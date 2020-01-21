package typings.awsSdkClientS3Browser.typesLifecycleRuleFilterMod

import typings.awsSdkClientS3Browser.typesLifecycleRuleAndOperatorMod.LifecycleRuleAndOperator
import typings.awsSdkClientS3Browser.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleRuleFilter extends js.Object {
  /**
    * <p>This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.</p>
    */
  var And: js.UndefOr[LifecycleRuleAndOperator] = js.undefined
  /**
    * <p>Prefix identifying one or more objects to which the rule applies.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>This tag must exist in the object's tag set in order for the rule to apply.</p>
    */
  var Tag: js.UndefOr[typings.awsSdkClientS3Browser.typesTagMod.Tag] = js.undefined
}

object LifecycleRuleFilter {
  @scala.inline
  def apply(And: LifecycleRuleAndOperator = null, Prefix: String = null, Tag: Tag = null): LifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRuleFilter]
  }
}

