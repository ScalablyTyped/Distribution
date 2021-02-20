package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetRiskConfigurationResponse extends StObject {
  
  /**
    * The risk configuration.
    */
  var RiskConfiguration: RiskConfigurationType = js.native
}
object SetRiskConfigurationResponse {
  
  @scala.inline
  def apply(RiskConfiguration: RiskConfigurationType): SetRiskConfigurationResponse = {
    val __obj = js.Dynamic.literal(RiskConfiguration = RiskConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRiskConfigurationResponse]
  }
  
  @scala.inline
  implicit class SetRiskConfigurationResponseMutableBuilder[Self <: SetRiskConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRiskConfiguration(value: RiskConfigurationType): Self = StObject.set(x, "RiskConfiguration", value.asInstanceOf[js.Any])
  }
}
