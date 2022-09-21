package typings.awsSdk.sagemakeredgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeDeployment extends StObject {
  
  /**
    * Returns a list of Definition objects.
    */
  var Definitions: js.UndefOr[typings.awsSdk.sagemakeredgeMod.Definitions] = js.undefined
  
  /**
    * The name and unique ID of the deployment.
    */
  var DeploymentName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * Determines whether to rollback to previous configuration if deployment fails.
    */
  var FailureHandlingPolicy: js.UndefOr[typings.awsSdk.sagemakeredgeMod.FailureHandlingPolicy] = js.undefined
  
  /**
    * The type of the deployment.
    */
  var Type: js.UndefOr[DeploymentType] = js.undefined
}
object EdgeDeployment {
  
  inline def apply(): EdgeDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeDeployment]
  }
  
  extension [Self <: EdgeDeployment](x: Self) {
    
    inline def setDefinitions(value: Definitions): Self = StObject.set(x, "Definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "Definitions", js.undefined)
    
    inline def setDefinitionsVarargs(value: Definition*): Self = StObject.set(x, "Definitions", js.Array(value*))
    
    inline def setDeploymentName(value: EntityName): Self = StObject.set(x, "DeploymentName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentNameUndefined: Self = StObject.set(x, "DeploymentName", js.undefined)
    
    inline def setFailureHandlingPolicy(value: FailureHandlingPolicy): Self = StObject.set(x, "FailureHandlingPolicy", value.asInstanceOf[js.Any])
    
    inline def setFailureHandlingPolicyUndefined: Self = StObject.set(x, "FailureHandlingPolicy", js.undefined)
    
    inline def setType(value: DeploymentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
