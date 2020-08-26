package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTargetGroupAttributesOutput extends js.Object {
  /**
    * Information about the target group attributes
    */
  var Attributes: js.UndefOr[TargetGroupAttributes] = js.native
}

object DescribeTargetGroupAttributesOutput {
  @scala.inline
  def apply(): DescribeTargetGroupAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTargetGroupAttributesOutput]
  }
  @scala.inline
  implicit class DescribeTargetGroupAttributesOutputOps[Self <: DescribeTargetGroupAttributesOutput] (val x: Self) extends AnyVal {
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
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
  }
  
}

