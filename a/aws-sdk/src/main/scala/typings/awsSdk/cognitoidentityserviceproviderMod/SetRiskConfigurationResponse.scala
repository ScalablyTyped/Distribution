package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRiskConfigurationResponse extends js.Object {
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
}

