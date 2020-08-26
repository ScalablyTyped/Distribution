package typings.awsSdkClientPinpointBrowser.typesApplicationsResponseMod

import typings.awsSdkClientPinpointBrowser.typesApplicationResponseMod.UnmarshalledApplicationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledApplicationsResponse extends ApplicationsResponse {
  /**
    * List of applications returned in this page.
    */
  @JSName("Item")
  var Item_UnmarshalledApplicationsResponse: js.UndefOr[js.Array[UnmarshalledApplicationResponse]] = js.native
}

object UnmarshalledApplicationsResponse {
  @scala.inline
  def apply(): UnmarshalledApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledApplicationsResponse]
  }
  @scala.inline
  implicit class UnmarshalledApplicationsResponseOps[Self <: UnmarshalledApplicationsResponse] (val x: Self) extends AnyVal {
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
    def setItemVarargs(value: UnmarshalledApplicationResponse*): Self = this.set("Item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[UnmarshalledApplicationResponse]): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
  
}

