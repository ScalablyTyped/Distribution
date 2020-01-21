package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var Arn: js.UndefOr[String] = js.native
}

object TargetGroup {
  @scala.inline
  def apply(Arn: String = null): TargetGroup = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroup]
  }
}

