package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountAuditConfigurationResponse extends StObject {
  
  /**
    * Which audit checks are enabled and disabled for this account.
    */
  var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.native
  
  /**
    * Information about the targets to which audit notifications are sent for this account.
    */
  var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.native
  
  /**
    * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates, and other items as required when performing an audit. On the first call to UpdateAccountAuditConfiguration, this parameter is required.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}
object DescribeAccountAuditConfigurationResponse {
  
  @scala.inline
  def apply(): DescribeAccountAuditConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAuditConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeAccountAuditConfigurationResponseMutableBuilder[Self <: DescribeAccountAuditConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditCheckConfigurations(value: AuditCheckConfigurations): Self = StObject.set(x, "auditCheckConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditCheckConfigurationsUndefined: Self = StObject.set(x, "auditCheckConfigurations", js.undefined)
    
    @scala.inline
    def setAuditNotificationTargetConfigurations(value: AuditNotificationTargetConfigurations): Self = StObject.set(x, "auditNotificationTargetConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditNotificationTargetConfigurationsUndefined: Self = StObject.set(x, "auditNotificationTargetConfigurations", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
