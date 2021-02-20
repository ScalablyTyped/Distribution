package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContactMethodsRequest extends StObject {
  
  /**
    * The protocols used to send notifications, such as Email, or SMS (text messaging). Specify a protocol in your request to return information about a specific contact method protocol.
    */
  var protocols: js.UndefOr[ContactProtocolsList] = js.native
}
object GetContactMethodsRequest {
  
  @scala.inline
  def apply(): GetContactMethodsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactMethodsRequest]
  }
  
  @scala.inline
  implicit class GetContactMethodsRequestMutableBuilder[Self <: GetContactMethodsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocols(value: ContactProtocolsList): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: ContactProtocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
  }
}
