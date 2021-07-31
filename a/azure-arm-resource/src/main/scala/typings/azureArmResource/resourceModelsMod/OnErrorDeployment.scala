package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnErrorDeployment extends StObject {
  
  /**
    * The deployment to be used on error case.
    */
  var deploymentName: js.UndefOr[String] = js.undefined
  
  /**
    * The deployment on error behavior type. Possible values are LastSuccessful and
    * SpecificDeployment. Possible values include: 'LastSuccessful', 'SpecificDeployment'
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object OnErrorDeployment {
  
  @scala.inline
  def apply(): OnErrorDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnErrorDeployment]
  }
  
  @scala.inline
  implicit class OnErrorDeploymentMutableBuilder[Self <: OnErrorDeployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentName(value: String): Self = StObject.set(x, "deploymentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentNameUndefined: Self = StObject.set(x, "deploymentName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
