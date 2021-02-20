package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRemediationConfigurationsRequest extends StObject {
  
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
  implicit class PutRemediationConfigurationsRequestMutableBuilder[Self <: PutRemediationConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemediationConfigurations(value: RemediationConfigurations): Self = StObject.set(x, "RemediationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediationConfigurationsVarargs(value: RemediationConfiguration*): Self = StObject.set(x, "RemediationConfigurations", js.Array(value :_*))
  }
}
