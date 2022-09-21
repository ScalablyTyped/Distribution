package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEmailMonitoringConfigurationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Log group associated with the email monitoring configuration.
    */
  var LogGroupArn: js.UndefOr[typings.awsSdk.workmailMod.LogGroupArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM Role associated with the email monitoring configuration.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.workmailMod.RoleArn] = js.undefined
}
object DescribeEmailMonitoringConfigurationResponse {
  
  inline def apply(): DescribeEmailMonitoringConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEmailMonitoringConfigurationResponse]
  }
  
  extension [Self <: DescribeEmailMonitoringConfigurationResponse](x: Self) {
    
    inline def setLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "LogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLogGroupArnUndefined: Self = StObject.set(x, "LogGroupArn", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
