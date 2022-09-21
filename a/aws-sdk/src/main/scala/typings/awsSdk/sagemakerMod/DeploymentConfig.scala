package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentConfig extends StObject {
  
  /**
    * Automatic rollback configuration for handling endpoint deployment failures and recovery.
    */
  var AutoRollbackConfiguration: js.UndefOr[AutoRollbackConfig] = js.undefined
  
  /**
    * Update policy for a blue/green deployment. If this update policy is specified, SageMaker creates a new fleet during the deployment while maintaining the old fleet. SageMaker flips traffic to the new fleet according to the specified traffic routing configuration. Only one update policy should be used in the deployment configuration. If no update policy is specified, SageMaker uses a blue/green deployment strategy with all at once traffic shifting by default.
    */
  var BlueGreenUpdatePolicy: typings.awsSdk.sagemakerMod.BlueGreenUpdatePolicy
}
object DeploymentConfig {
  
  inline def apply(BlueGreenUpdatePolicy: BlueGreenUpdatePolicy): DeploymentConfig = {
    val __obj = js.Dynamic.literal(BlueGreenUpdatePolicy = BlueGreenUpdatePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfig]
  }
  
  extension [Self <: DeploymentConfig](x: Self) {
    
    inline def setAutoRollbackConfiguration(value: AutoRollbackConfig): Self = StObject.set(x, "AutoRollbackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAutoRollbackConfigurationUndefined: Self = StObject.set(x, "AutoRollbackConfiguration", js.undefined)
    
    inline def setBlueGreenUpdatePolicy(value: BlueGreenUpdatePolicy): Self = StObject.set(x, "BlueGreenUpdatePolicy", value.asInstanceOf[js.Any])
  }
}
