package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaOutputUpdate extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the destination Lambda function.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.native
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your behalf. You need to grant the necessary permissions to this role. 
    */
  var RoleARNUpdate: js.UndefOr[RoleARN] = js.native
}

object LambdaOutputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN = null, RoleARNUpdate: RoleARN = null): LambdaOutputUpdate = {
    val __obj = js.Dynamic.literal()
    if (ResourceARNUpdate != null) __obj.updateDynamic("ResourceARNUpdate")(ResourceARNUpdate.asInstanceOf[js.Any])
    if (RoleARNUpdate != null) __obj.updateDynamic("RoleARNUpdate")(RoleARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaOutputUpdate]
  }
}

