package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDestinationRequest extends js.Object {
  /**
    * A name for the destination.
    */
  var destinationName: DestinationName = js.native
  /**
    * The ARN of an IAM role that grants CloudWatch Logs permissions to call the Amazon Kinesis PutRecord operation on the destination stream.
    */
  var roleArn: RoleArn = js.native
  /**
    * The ARN of an Amazon Kinesis stream to which to deliver matching log events.
    */
  var targetArn: TargetArn = js.native
}

object PutDestinationRequest {
  @scala.inline
  def apply(destinationName: DestinationName, roleArn: RoleArn, targetArn: TargetArn): PutDestinationRequest = {
    val __obj = js.Dynamic.literal(destinationName = destinationName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDestinationRequest]
  }
}

