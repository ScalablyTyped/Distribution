package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorizationCodePayloadMod {
  
  trait AuthorizationCodePayload extends StObject {
    
    var client_info: js.UndefOr[String] = js.undefined
    
    var cloud_graph_host_name: js.UndefOr[String] = js.undefined
    
    var cloud_instance_host_name: js.UndefOr[String] = js.undefined
    
    var cloud_instance_name: js.UndefOr[String] = js.undefined
    
    var code: String
    
    var msgraph_host: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object AuthorizationCodePayload {
    
    inline def apply(code: String): AuthorizationCodePayload = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationCodePayload]
    }
    
    extension [Self <: AuthorizationCodePayload](x: Self) {
      
      inline def setClient_info(value: String): Self = StObject.set(x, "client_info", value.asInstanceOf[js.Any])
      
      inline def setClient_infoUndefined: Self = StObject.set(x, "client_info", js.undefined)
      
      inline def setCloud_graph_host_name(value: String): Self = StObject.set(x, "cloud_graph_host_name", value.asInstanceOf[js.Any])
      
      inline def setCloud_graph_host_nameUndefined: Self = StObject.set(x, "cloud_graph_host_name", js.undefined)
      
      inline def setCloud_instance_host_name(value: String): Self = StObject.set(x, "cloud_instance_host_name", value.asInstanceOf[js.Any])
      
      inline def setCloud_instance_host_nameUndefined: Self = StObject.set(x, "cloud_instance_host_name", js.undefined)
      
      inline def setCloud_instance_name(value: String): Self = StObject.set(x, "cloud_instance_name", value.asInstanceOf[js.Any])
      
      inline def setCloud_instance_nameUndefined: Self = StObject.set(x, "cloud_instance_name", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMsgraph_host(value: String): Self = StObject.set(x, "msgraph_host", value.asInstanceOf[js.Any])
      
      inline def setMsgraph_hostUndefined: Self = StObject.set(x, "msgraph_host", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
