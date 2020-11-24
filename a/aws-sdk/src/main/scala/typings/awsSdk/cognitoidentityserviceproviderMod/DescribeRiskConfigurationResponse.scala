package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRiskConfigurationResponse extends js.Object {
  
  /**
    * The risk configuration.
    */
  var RiskConfiguration: RiskConfigurationType = js.native
}
object DescribeRiskConfigurationResponse {
  
  @scala.inline
  def apply(RiskConfiguration: RiskConfigurationType): DescribeRiskConfigurationResponse = {
    val __obj = js.Dynamic.literal(RiskConfiguration = RiskConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRiskConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeRiskConfigurationResponseOps[Self <: DescribeRiskConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setRiskConfiguration(value: RiskConfigurationType): Self = this.set("RiskConfiguration", value.asInstanceOf[js.Any])
  }
}
