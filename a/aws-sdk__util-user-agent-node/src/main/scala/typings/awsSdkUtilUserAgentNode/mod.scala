package typings.awsSdkUtilUserAgentNode

import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkTypes.distTypesUtilMod.UserAgent
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
  
  inline def defaultUserAgent(param0: DefaultUserAgentOptions): Provider[UserAgent] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUserAgent")(param0.asInstanceOf[js.Any]).asInstanceOf[Provider[UserAgent]]
  
  trait DefaultUserAgentOptions extends StObject {
    
    var clientVersion: String
    
    var serviceId: js.UndefOr[String] = js.undefined
  }
  object DefaultUserAgentOptions {
    
    inline def apply(clientVersion: String): DefaultUserAgentOptions = {
      val __obj = js.Dynamic.literal(clientVersion = clientVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultUserAgentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultUserAgentOptions] (val x: Self) extends AnyVal {
      
      inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    }
  }
}
