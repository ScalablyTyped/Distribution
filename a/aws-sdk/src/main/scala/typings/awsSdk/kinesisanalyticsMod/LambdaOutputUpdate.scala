package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaOutputUpdate extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the destination Lambda function.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your behalf. You need to grant the necessary permissions to this role. 
    */
  var RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
}
object LambdaOutputUpdate {
  
  inline def apply(): LambdaOutputUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaOutputUpdate]
  }
  
  extension [Self <: LambdaOutputUpdate](x: Self) {
    
    inline def setResourceARNUpdate(value: ResourceARN): Self = StObject.set(x, "ResourceARNUpdate", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUpdateUndefined: Self = StObject.set(x, "ResourceARNUpdate", js.undefined)
    
    inline def setRoleARNUpdate(value: RoleARN): Self = StObject.set(x, "RoleARNUpdate", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUpdateUndefined: Self = StObject.set(x, "RoleARNUpdate", js.undefined)
  }
}
