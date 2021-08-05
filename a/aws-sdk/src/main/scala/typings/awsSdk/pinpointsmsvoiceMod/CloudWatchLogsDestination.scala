package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to write event data to an Amazon CloudWatch destination.
    */
  var IamRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon CloudWatch Log Group that you want to record events in.
    */
  var LogGroupArn: js.UndefOr[String] = js.undefined
}
object CloudWatchLogsDestination {
  
  inline def apply(): CloudWatchLogsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsDestination]
  }
  
  extension [Self <: CloudWatchLogsDestination](x: Self) {
    
    inline def setIamRoleArn(value: String): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    inline def setLogGroupArn(value: String): Self = StObject.set(x, "LogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLogGroupArnUndefined: Self = StObject.set(x, "LogGroupArn", js.undefined)
  }
}
