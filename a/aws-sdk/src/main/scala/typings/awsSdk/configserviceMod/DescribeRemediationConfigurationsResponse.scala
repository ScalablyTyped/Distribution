package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRemediationConfigurationsResponse extends js.Object {
  
  /**
    * Returns a remediation configuration object.
    */
  var RemediationConfigurations: js.UndefOr[typings.awsSdk.configserviceMod.RemediationConfigurations] = js.native
}
object DescribeRemediationConfigurationsResponse {
  
  @scala.inline
  def apply(): DescribeRemediationConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRemediationConfigurationsResponse]
  }
  
  @scala.inline
  implicit class DescribeRemediationConfigurationsResponseOps[Self <: DescribeRemediationConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRemediationConfigurationsVarargs(value: RemediationConfiguration*): Self = this.set("RemediationConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setRemediationConfigurations(value: RemediationConfigurations): Self = this.set("RemediationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemediationConfigurations: Self = this.set("RemediationConfigurations", js.undefined)
  }
}
