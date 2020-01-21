package typings.awsSdkClientS3Browser.typesLifecycleRuleAndOperatorMod

import typings.awsSdkClientS3Browser.typesTagMod.Tag
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleRuleAndOperator extends js.Object {
  /**
    * _Prefix shape
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>All of these tags must exist in the object's tag set in order for the rule to apply.</p>
    */
  var Tags: js.UndefOr[js.Array[Tag] | Iterable[Tag]] = js.undefined
}

object LifecycleRuleAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[Tag] | Iterable[Tag] = null): LifecycleRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRuleAndOperator]
  }
}

