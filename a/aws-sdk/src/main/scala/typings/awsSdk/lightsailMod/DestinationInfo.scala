package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationInfo extends js.Object {
  /**
    * The ID of the resource created at the destination.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  /**
    * The destination service of the record.
    */
  var service: js.UndefOr[NonEmptyString] = js.native
}

object DestinationInfo {
  @scala.inline
  def apply(): DestinationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationInfo]
  }
  @scala.inline
  implicit class DestinationInfoOps[Self <: DestinationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: NonEmptyString): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setService(value: NonEmptyString): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

