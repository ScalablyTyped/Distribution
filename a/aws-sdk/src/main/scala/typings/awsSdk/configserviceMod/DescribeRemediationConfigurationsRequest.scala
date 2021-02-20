package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRemediationConfigurationsRequest extends StObject {
  
  /**
    * A list of AWS Config rule names of remediation configurations for which you want details. 
    */
  var ConfigRuleNames: typings.awsSdk.configserviceMod.ConfigRuleNames = js.native
}
object DescribeRemediationConfigurationsRequest {
  
  @scala.inline
  def apply(ConfigRuleNames: ConfigRuleNames): DescribeRemediationConfigurationsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleNames = ConfigRuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRemediationConfigurationsRequest]
  }
  
  @scala.inline
  implicit class DescribeRemediationConfigurationsRequestMutableBuilder[Self <: DescribeRemediationConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigRuleNames(value: ConfigRuleNames): Self = StObject.set(x, "ConfigRuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleNamesVarargs(value: ConfigRuleName*): Self = StObject.set(x, "ConfigRuleNames", js.Array(value :_*))
  }
}
