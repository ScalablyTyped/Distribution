package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceAccessDetailsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about a get instance access request.
    */
  var accessDetails: js.UndefOr[InstanceAccessDetails] = js.native
}

object GetInstanceAccessDetailsResult {
  @scala.inline
  def apply(): GetInstanceAccessDetailsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceAccessDetailsResult]
  }
  @scala.inline
  implicit class GetInstanceAccessDetailsResultOps[Self <: GetInstanceAccessDetailsResult] (val x: Self) extends AnyVal {
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
    def setAccessDetails(value: InstanceAccessDetails): Self = this.set("accessDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessDetails: Self = this.set("accessDetails", js.undefined)
  }
  
}

