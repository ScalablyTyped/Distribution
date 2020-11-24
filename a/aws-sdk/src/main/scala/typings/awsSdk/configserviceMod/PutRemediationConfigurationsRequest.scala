package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRemediationConfigurationsRequest extends js.Object {
  
  /**
    * A list of remediation configuration objects.
    */
  var RemediationConfigurations: typings.awsSdk.configserviceMod.RemediationConfigurations = js.native
}
object PutRemediationConfigurationsRequest {
  
  @scala.inline
  def apply(RemediationConfigurations: RemediationConfigurations): PutRemediationConfigurationsRequest = {
    val __obj = js.Dynamic.literal(RemediationConfigurations = RemediationConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRemediationConfigurationsRequest]
  }
  
  @scala.inline
  implicit class PutRemediationConfigurationsRequestOps[Self <: PutRemediationConfigurationsRequest] (val x: Self) extends AnyVal {
    
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
  }
}
