package typings.awsSdkClientPinpointBrowser.typesEndpointsResponseMod

import typings.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEndpointsResponse extends EndpointsResponse {
  /**
    * The list of endpoints.
    */
  @JSName("Item")
  var Item_UnmarshalledEndpointsResponse: js.UndefOr[js.Array[UnmarshalledEndpointResponse]] = js.native
}

object UnmarshalledEndpointsResponse {
  @scala.inline
  def apply(): UnmarshalledEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEndpointsResponse]
  }
  @scala.inline
  implicit class UnmarshalledEndpointsResponseOps[Self <: UnmarshalledEndpointsResponse] (val x: Self) extends AnyVal {
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
    def setItemVarargs(value: UnmarshalledEndpointResponse*): Self = this.set("Item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[UnmarshalledEndpointResponse]): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
  
}

