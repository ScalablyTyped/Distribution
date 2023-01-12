package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEmailMonitoringConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Log group associated with the email monitoring configuration.
    */
  var LogGroupArn: typings.awsSdk.clientsWorkmailMod.LogGroupArn
  
  /**
    * The ID of the organization for which the email monitoring configuration is set.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The Amazon Resource Name (ARN) of the IAM Role associated with the email monitoring configuration.
    */
  var RoleArn: typings.awsSdk.clientsWorkmailMod.RoleArn
}
object PutEmailMonitoringConfigurationRequest {
  
  inline def apply(LogGroupArn: LogGroupArn, OrganizationId: OrganizationId, RoleArn: RoleArn): PutEmailMonitoringConfigurationRequest = {
    val __obj = js.Dynamic.literal(LogGroupArn = LogGroupArn.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailMonitoringConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutEmailMonitoringConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "LogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
