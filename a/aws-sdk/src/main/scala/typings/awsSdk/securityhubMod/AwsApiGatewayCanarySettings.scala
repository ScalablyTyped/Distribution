package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsApiGatewayCanarySettings extends StObject {
  
  /**
    * The deployment identifier for the canary deployment.
    */
  var DeploymentId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The percentage of traffic that is diverted to a canary deployment.
    */
  var PercentTraffic: js.UndefOr[Double] = js.undefined
  
  /**
    * Stage variables that are overridden in the canary release deployment. The variables include new stage variables that are introduced in the canary. Each variable is represented as a string-to-string map between the stage variable name and the variable value.
    */
  var StageVariableOverrides: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * Indicates whether the canary deployment uses the stage cache.
    */
  var UseStageCache: js.UndefOr[Boolean] = js.undefined
}
object AwsApiGatewayCanarySettings {
  
  @scala.inline
  def apply(): AwsApiGatewayCanarySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayCanarySettings]
  }
  
  @scala.inline
  implicit class AwsApiGatewayCanarySettingsMutableBuilder[Self <: AwsApiGatewayCanarySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: NonEmptyString): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    @scala.inline
    def setPercentTraffic(value: Double): Self = StObject.set(x, "PercentTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentTrafficUndefined: Self = StObject.set(x, "PercentTraffic", js.undefined)
    
    @scala.inline
    def setStageVariableOverrides(value: FieldMap): Self = StObject.set(x, "StageVariableOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageVariableOverridesUndefined: Self = StObject.set(x, "StageVariableOverrides", js.undefined)
    
    @scala.inline
    def setUseStageCache(value: Boolean): Self = StObject.set(x, "UseStageCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseStageCacheUndefined: Self = StObject.set(x, "UseStageCache", js.undefined)
  }
}
