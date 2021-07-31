package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaOutput extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the destination Lambda function to write to.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARN: typings.awsSdk.kinesisanalyticsMod.ResourceARN
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your behalf. You need to grant the necessary permissions to this role. 
    */
  var RoleARN: typings.awsSdk.kinesisanalyticsMod.RoleARN
}
object LambdaOutput {
  
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): LambdaOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaOutput]
  }
  
  @scala.inline
  implicit class LambdaOutputMutableBuilder[Self <: LambdaOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
  }
}
