package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBv2Action extends js.Object {
  /**
    * Specifies the DynamoDB table to which the message data will be written. For example:  { "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }  Each attribute in the message payload will be written to a separate column in the DynamoDB database.
    */
  var putItem: PutItemInput = js.native
  /**
    * The ARN of the IAM role that grants access to the DynamoDB table.
    */
  var roleArn: AwsArn = js.native
}

object DynamoDBv2Action {
  @scala.inline
  def apply(putItem: PutItemInput, roleArn: AwsArn): DynamoDBv2Action = {
    val __obj = js.Dynamic.literal(putItem = putItem.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBv2Action]
  }
  @scala.inline
  implicit class DynamoDBv2ActionOps[Self <: DynamoDBv2Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPutItem(value: PutItemInput): Self = this.set("putItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
  }
  
}

