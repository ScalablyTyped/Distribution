package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayCanarySettings extends js.Object {
  
  /**
    * The deployment identifier for the canary deployment.
    */
  var DeploymentId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The percentage of traffic that is diverted to a canary deployment.
    */
  var PercentTraffic: js.UndefOr[Double] = js.native
  
  /**
    * Stage variables that are overridden in the canary release deployment. The variables include new stage variables that are introduced in the canary. Each variable is represented as a string-to-string map between the stage variable name and the variable value.
    */
  var StageVariableOverrides: js.UndefOr[FieldMap] = js.native
  
  /**
    * Indicates whether the canary deployment uses the stage cache.
    */
  var UseStageCache: js.UndefOr[Boolean] = js.native
}
object AwsApiGatewayCanarySettings {
  
  @scala.inline
  def apply(): AwsApiGatewayCanarySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayCanarySettings]
  }
  
  @scala.inline
  implicit class AwsApiGatewayCanarySettingsOps[Self <: AwsApiGatewayCanarySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeploymentId(value: NonEmptyString): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
    
    @scala.inline
    def setPercentTraffic(value: Double): Self = this.set("PercentTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentTraffic: Self = this.set("PercentTraffic", js.undefined)
    
    @scala.inline
    def setStageVariableOverrides(value: FieldMap): Self = this.set("StageVariableOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageVariableOverrides: Self = this.set("StageVariableOverrides", js.undefined)
    
    @scala.inline
    def setUseStageCache(value: Boolean): Self = this.set("UseStageCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseStageCache: Self = this.set("UseStageCache", js.undefined)
  }
}
