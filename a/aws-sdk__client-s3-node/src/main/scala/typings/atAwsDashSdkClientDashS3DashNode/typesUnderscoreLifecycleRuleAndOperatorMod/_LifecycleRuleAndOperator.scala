package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLifecycleRuleAndOperatorMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTagMod._Tag
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _LifecycleRuleAndOperator extends js.Object {
  /**
    * _Prefix shape
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>All of these tags must exist in the object's tag set in order for the rule to apply.</p>
    */
  var Tags: js.UndefOr[js.Array[_Tag] | Iterable[_Tag]] = js.undefined
}

object _LifecycleRuleAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[_Tag] | Iterable[_Tag] = null): _LifecycleRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[_LifecycleRuleAndOperator]
  }
}

