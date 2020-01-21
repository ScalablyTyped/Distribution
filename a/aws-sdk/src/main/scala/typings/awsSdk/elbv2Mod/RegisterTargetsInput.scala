package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTargetsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.elbv2Mod.TargetGroupArn = js.native
  /**
    * The targets. To register a target by instance ID, specify the instance ID. To register a target by IP address, specify the IP address. To register a Lambda function, specify the ARN of the Lambda function.
    */
  var Targets: TargetDescriptions = js.native
}

object RegisterTargetsInput {
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn, Targets: TargetDescriptions): RegisterTargetsInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegisterTargetsInput]
  }
}

