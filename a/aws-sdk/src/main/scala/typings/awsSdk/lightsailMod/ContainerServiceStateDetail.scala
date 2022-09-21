package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerServiceStateDetail extends StObject {
  
  /**
    * The state code of the container service. The following state codes are possible:   The following state codes are possible if your container service is in a DEPLOYING or UPDATING state:    CREATING_SYSTEM_RESOURCES - The system resources for your container service are being created.    CREATING_NETWORK_INFRASTRUCTURE - The network infrastructure for your container service are being created.    PROVISIONING_CERTIFICATE - The SSL/TLS certificate for your container service is being created.    PROVISIONING_SERVICE - Your container service is being provisioned.    CREATING_DEPLOYMENT - Your deployment is being created on your container service.    EVALUATING_HEALTH_CHECK - The health of your deployment is being evaluated.    ACTIVATING_DEPLOYMENT - Your deployment is being activated.     The following state codes are possible if your container service is in a PENDING state:    CERTIFICATE_LIMIT_EXCEEDED - The SSL/TLS certificate required for your container service exceeds the maximum number of certificates allowed for your account.    UNKNOWN_ERROR - An error was experienced when your container service was being created.    
    */
  var code: js.UndefOr[ContainerServiceStateDetailCode] = js.undefined
  
  /**
    * A message that provides more information for the state code.  The state detail is populated only when a container service is in a PENDING, DEPLOYING, or UPDATING state. 
    */
  var message: js.UndefOr[String] = js.undefined
}
object ContainerServiceStateDetail {
  
  inline def apply(): ContainerServiceStateDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceStateDetail]
  }
  
  extension [Self <: ContainerServiceStateDetail](x: Self) {
    
    inline def setCode(value: ContainerServiceStateDetailCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
