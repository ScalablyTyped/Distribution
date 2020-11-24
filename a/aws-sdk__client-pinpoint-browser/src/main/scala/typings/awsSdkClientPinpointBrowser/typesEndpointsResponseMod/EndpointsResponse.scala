package typings.awsSdkClientPinpointBrowser.typesEndpointsResponseMod

import typings.awsSdkClientPinpointBrowser.typesEndpointResponseMod.EndpointResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointsResponse extends js.Object {
  
  /**
    * The list of endpoints.
    */
  var Item: js.UndefOr[js.Array[EndpointResponse] | Iterable[EndpointResponse]] = js.native
}
object EndpointsResponse {
  
  @scala.inline
  def apply(): EndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointsResponse]
  }
  
  @scala.inline
  implicit class EndpointsResponseOps[Self <: EndpointsResponse] (val x: Self) extends AnyVal {
    
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
    def setItemVarargs(value: EndpointResponse*): Self = this.set("Item", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: js.Array[EndpointResponse] | Iterable[EndpointResponse]): Self = this.set("Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
}
