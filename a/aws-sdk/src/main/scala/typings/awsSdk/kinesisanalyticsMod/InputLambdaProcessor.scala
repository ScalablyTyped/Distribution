package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputLambdaProcessor extends js.Object {
  /**
    * The ARN of the AWS Lambda function that operates on records in the stream.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARN: typings.awsSdk.kinesisanalyticsMod.ResourceARN = js.native
  /**
    * The ARN of the IAM role that is used to access the AWS Lambda function.
    */
  var RoleARN: typings.awsSdk.kinesisanalyticsMod.RoleARN = js.native
}

object InputLambdaProcessor {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): InputLambdaProcessor = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLambdaProcessor]
  }
  @scala.inline
  implicit class InputLambdaProcessorOps[Self <: InputLambdaProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
  }
  
}

