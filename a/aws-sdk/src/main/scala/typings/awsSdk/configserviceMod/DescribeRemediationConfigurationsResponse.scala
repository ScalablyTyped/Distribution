package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRemediationConfigurationsResponse extends StObject {
  
  /**
    * Returns a remediation configuration object.
    */
  var RemediationConfigurations: js.UndefOr[typings.awsSdk.configserviceMod.RemediationConfigurations] = js.undefined
}
object DescribeRemediationConfigurationsResponse {
  
  @scala.inline
  def apply(): DescribeRemediationConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRemediationConfigurationsResponse]
  }
  
  @scala.inline
  implicit class DescribeRemediationConfigurationsResponseMutableBuilder[Self <: DescribeRemediationConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemediationConfigurations(value: RemediationConfigurations): Self = StObject.set(x, "RemediationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediationConfigurationsUndefined: Self = StObject.set(x, "RemediationConfigurations", js.undefined)
    
    @scala.inline
    def setRemediationConfigurationsVarargs(value: RemediationConfiguration*): Self = StObject.set(x, "RemediationConfigurations", js.Array(value :_*))
  }
}
