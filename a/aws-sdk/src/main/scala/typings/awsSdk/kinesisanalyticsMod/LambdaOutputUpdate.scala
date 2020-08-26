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
  def apply(): LambdaOutputUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaOutputUpdate]
  }
  @scala.inline
  implicit class LambdaOutputUpdateOps[Self <: LambdaOutputUpdate] (val x: Self) extends AnyVal {
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
    def setResourceARNUpdate(value: ResourceARN): Self = this.set("ResourceARNUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceARNUpdate: Self = this.set("ResourceARNUpdate", js.undefined)
    @scala.inline
    def setRoleARNUpdate(value: RoleARN): Self = this.set("RoleARNUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleARNUpdate: Self = this.set("RoleARNUpdate", js.undefined)
  }
  
}

