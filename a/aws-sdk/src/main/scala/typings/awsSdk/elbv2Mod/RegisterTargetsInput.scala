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
  @scala.inline
  implicit class RegisterTargetsInputOps[Self <: RegisterTargetsInput] (val x: Self) extends AnyVal {
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
    def setTargetGroupArn(value: TargetGroupArn): Self = this.set("TargetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetsVarargs(value: TargetDescription*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: TargetDescriptions): Self = this.set("Targets", value.asInstanceOf[js.Any])
  }
  
}

