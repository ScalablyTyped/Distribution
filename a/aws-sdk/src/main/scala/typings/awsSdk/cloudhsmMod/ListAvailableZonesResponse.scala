package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailableZonesResponse extends js.Object {
  /**
    * The list of Availability Zones that have available AWS CloudHSM capacity.
    */
  var AZList: js.UndefOr[typings.awsSdk.cloudhsmMod.AZList] = js.native
}

object ListAvailableZonesResponse {
  @scala.inline
  def apply(): ListAvailableZonesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableZonesResponse]
  }
  @scala.inline
  implicit class ListAvailableZonesResponseOps[Self <: ListAvailableZonesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAZListVarargs(value: AZ*): Self = this.set("AZList", js.Array(value :_*))
    @scala.inline
    def setAZList(value: AZList): Self = this.set("AZList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAZList: Self = this.set("AZList", js.undefined)
  }
  
}

