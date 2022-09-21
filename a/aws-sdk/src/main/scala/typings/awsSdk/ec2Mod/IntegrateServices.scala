package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegrateServices extends StObject {
  
  /**
    * Information about the integration with Amazon Athena.
    */
  var AthenaIntegrations: js.UndefOr[AthenaIntegrationsSet] = js.undefined
}
object IntegrateServices {
  
  inline def apply(): IntegrateServices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrateServices]
  }
  
  extension [Self <: IntegrateServices](x: Self) {
    
    inline def setAthenaIntegrations(value: AthenaIntegrationsSet): Self = StObject.set(x, "AthenaIntegrations", value.asInstanceOf[js.Any])
    
    inline def setAthenaIntegrationsUndefined: Self = StObject.set(x, "AthenaIntegrations", js.undefined)
    
    inline def setAthenaIntegrationsVarargs(value: AthenaIntegration*): Self = StObject.set(x, "AthenaIntegrations", js.Array(value*))
  }
}
