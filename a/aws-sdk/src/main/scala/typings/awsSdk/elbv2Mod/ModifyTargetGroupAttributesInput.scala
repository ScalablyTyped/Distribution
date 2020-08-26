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
  @scala.inline
  implicit class ModifyTargetGroupAttributesInputOps[Self <: ModifyTargetGroupAttributesInput] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: TargetGroupAttribute*): Self = this.set("Attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: TargetGroupAttributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetGroupArn(value: TargetGroupArn): Self = this.set("TargetGroupArn", value.asInstanceOf[js.Any])
  }
  
}

