package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountAuditConfigurationRequest extends StObject {
  
  /**
    * Specifies which audit checks are enabled and disabled for this account. Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are currently enabled. Some data collection might start immediately when certain checks are enabled. When a check is disabled, any data collected so far in relation to the check is deleted. You cannot disable a check if it's used by any scheduled audit. You must first delete the check from the scheduled audit or delete the scheduled audit itself. On the first call to UpdateAccountAuditConfiguration, this parameter is required and must specify at least one enabled check.
    */
  var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.undefined
  
  /**
    * Information about the targets to which audit notifications are sent.
    */
  var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role that grants permission to IoT to access information about your devices, policies, certificates, and other items as required when performing an audit.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object UpdateAccountAuditConfigurationRequest {
  
  inline def apply(): UpdateAccountAuditConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountAuditConfigurationRequest]
  }
  
  extension [Self <: UpdateAccountAuditConfigurationRequest](x: Self) {
    
    inline def setAuditCheckConfigurations(value: AuditCheckConfigurations): Self = StObject.set(x, "auditCheckConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAuditCheckConfigurationsUndefined: Self = StObject.set(x, "auditCheckConfigurations", js.undefined)
    
    inline def setAuditNotificationTargetConfigurations(value: AuditNotificationTargetConfigurations): Self = StObject.set(x, "auditNotificationTargetConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAuditNotificationTargetConfigurationsUndefined: Self = StObject.set(x, "auditNotificationTargetConfigurations", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
