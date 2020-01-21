package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTargetGroupAttributesInput extends js.Object {
  /**
    * The attributes.
    */
  var Attributes: TargetGroupAttributes = js.native
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.elbv2Mod.TargetGroupArn = js.native
}

object ModifyTargetGroupAttributesInput {
  @scala.inline
  def apply(Attributes: TargetGroupAttributes, TargetGroupArn: TargetGroupArn): ModifyTargetGroupAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModifyTargetGroupAttributesInput]
  }
}

