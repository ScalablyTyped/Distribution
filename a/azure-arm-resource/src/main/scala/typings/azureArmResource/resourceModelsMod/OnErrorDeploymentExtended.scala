package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnErrorDeploymentExtended extends StObject {
  
  /**
    * The deployment to be used on error case.
    */
  var deploymentName: js.UndefOr[String] = js.native
  
  /**
    * The state of the provisioning for the on error deployment.
    */
  val provisioningState: js.UndefOr[String] = js.native
  
  /**
    * The deployment on error behavior type. Possible values are LastSuccessful and
    * SpecificDeployment. Possible values include: 'LastSuccessful', 'SpecificDeployment'
    */
  var `type`: js.UndefOr[String] = js.native
}
object OnErrorDeploymentExtended {
  
  @scala.inline
  def apply(): OnErrorDeploymentExtended = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnErrorDeploymentExtended]
  }
  
  @scala.inline
  implicit class OnErrorDeploymentExtendedMutableBuilder[Self <: OnErrorDeploymentExtended] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentName(value: String): Self = StObject.set(x, "deploymentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentNameUndefined: Self = StObject.set(x, "deploymentName", js.undefined)
    
    @scala.inline
    def setProvisioningState(value: String): Self = StObject.set(x, "provisioningState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningStateUndefined: Self = StObject.set(x, "provisioningState", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
