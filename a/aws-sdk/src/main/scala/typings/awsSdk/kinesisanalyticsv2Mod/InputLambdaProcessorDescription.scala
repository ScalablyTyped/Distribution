package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputLambdaProcessorDescription extends js.Object {
  /**
    * The ARN of the AWS Lambda function that is used to preprocess the records in the stream.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARN: typings.awsSdk.kinesisanalyticsv2Mod.ResourceARN = js.native
  /**
    * The ARN of the IAM role that is used to access the AWS Lambda function.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.RoleARN] = js.native
}

object InputLambdaProcessorDescription {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN = null): InputLambdaProcessorDescription = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLambdaProcessorDescription]
  }
}

