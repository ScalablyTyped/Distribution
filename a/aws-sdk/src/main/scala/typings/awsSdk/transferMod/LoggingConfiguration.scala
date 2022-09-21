package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfiguration extends StObject {
  
  /**
    * The name of the CloudWatch logging group for the Transfer Family server to which this workflow belongs.
    */
  var LogGroupName: js.UndefOr[typings.awsSdk.transferMod.LogGroupName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity in your CloudWatch logs.
    */
  var LoggingRole: js.UndefOr[Role] = js.undefined
}
object LoggingConfiguration {
  
  inline def apply(): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  extension [Self <: LoggingConfiguration](x: Self) {
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    inline def setLoggingRole(value: Role): Self = StObject.set(x, "LoggingRole", value.asInstanceOf[js.Any])
    
    inline def setLoggingRoleUndefined: Self = StObject.set(x, "LoggingRole", js.undefined)
  }
}
