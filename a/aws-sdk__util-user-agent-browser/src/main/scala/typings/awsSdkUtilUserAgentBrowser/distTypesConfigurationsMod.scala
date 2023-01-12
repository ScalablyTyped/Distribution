package typings.awsSdkUtilUserAgentBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConfigurationsMod {
  
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
