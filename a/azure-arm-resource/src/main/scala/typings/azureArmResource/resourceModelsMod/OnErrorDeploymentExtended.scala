package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnErrorDeploymentExtended extends StObject {
  
  /**
    * The deployment to be used on error case.
    */
  var deploymentName: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the provisioning for the on error deployment.
    */
  val provisioningState: js.UndefOr[String] = js.undefined
  
  /**
    * The deployment on error behavior type. Possible values are LastSuccessful and
    * SpecificDeployment. Possible values include: 'LastSuccessful', 'SpecificDeployment'
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object OnErrorDeploymentExtended {
  
  inline def apply(): OnErrorDeploymentExtended = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnErrorDeploymentExtended]
  }
  
  extension [Self <: OnErrorDeploymentExtended](x: Self) {
    
    inline def setDeploymentName(value: String): Self = StObject.set(x, "deploymentName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentNameUndefined: Self = StObject.set(x, "deploymentName", js.undefined)
    
    inline def setProvisioningState(value: String): Self = StObject.set(x, "provisioningState", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStateUndefined: Self = StObject.set(x, "provisioningState", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
