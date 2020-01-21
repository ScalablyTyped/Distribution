package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTargetGroupAttributesOutput extends js.Object {
  /**
    * Information about the attributes.
    */
  var Attributes: js.UndefOr[TargetGroupAttributes] = js.native
}

object ModifyTargetGroupAttributesOutput {
  @scala.inline
  def apply(Attributes: TargetGroupAttributes = null): ModifyTargetGroupAttributesOutput = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTargetGroupAttributesOutput]
  }
}

