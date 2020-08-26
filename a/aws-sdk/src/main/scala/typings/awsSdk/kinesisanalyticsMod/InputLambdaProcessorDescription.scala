package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputLambdaProcessorDescription extends js.Object {
  /**
    * The ARN of the AWS Lambda function that is used to preprocess the records in the stream.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ResourceARN] = js.native
  /**
    * The ARN of the IAM role that is used to access the AWS Lambda function.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.RoleARN] = js.native
}

object InputLambdaProcessorDescription {
  @scala.inline
  def apply(): InputLambdaProcessorDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLambdaProcessorDescription]
  }
  @scala.inline
  implicit class InputLambdaProcessorDescriptionOps[Self <: InputLambdaProcessorDescription] (val x: Self) extends AnyVal {
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
    def deleteResourceARN: Self = this.set("ResourceARN", js.undefined)
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
  }
  
}

