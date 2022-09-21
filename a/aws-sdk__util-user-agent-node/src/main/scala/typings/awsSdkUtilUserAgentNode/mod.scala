package typings.awsSdkUtilUserAgentNode

import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.UserAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-user-agent-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/util-user-agent-node", "UA_APP_ID_ENV_NAME")
  @js.native
  val UA_APP_ID_ENV_NAME: /* "AWS_SDK_UA_APP_ID" */ String = js.native
  
  @JSImport("@aws-sdk/util-user-agent-node", "UA_APP_ID_INI_NAME")
  @js.native
  val UA_APP_ID_INI_NAME: /* "sdk-ua-app-id" */ String = js.native
  
  inline def defaultUserAgent(hasServiceIdClientVersion: DefaultUserAgentOptions): Provider[UserAgent] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUserAgent")(hasServiceIdClientVersion.asInstanceOf[js.Any]).asInstanceOf[Provider[UserAgent]]
  
  trait DefaultUserAgentOptions extends StObject {
    
    var clientVersion: String
    
    var serviceId: js.UndefOr[String] = js.undefined
  }
  object DefaultUserAgentOptions {
    
    inline def apply(clientVersion: String): DefaultUserAgentOptions = {
      val __obj = js.Dynamic.literal(clientVersion = clientVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultUserAgentOptions]
    }
    
    extension [Self <: DefaultUserAgentOptions](x: Self) {
      
      inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    }
  }
}
