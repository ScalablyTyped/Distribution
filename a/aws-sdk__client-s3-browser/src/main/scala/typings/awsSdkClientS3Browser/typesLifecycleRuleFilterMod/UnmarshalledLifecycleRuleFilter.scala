package typings.awsSdkClientS3Browser.typesLifecycleRuleFilterMod

import typings.awsSdkClientS3Browser.typesLifecycleRuleAndOperatorMod.UnmarshalledLifecycleRuleAndOperator
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledLifecycleRuleFilter extends LifecycleRuleFilter {
  /**
    * <p>This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.</p>
    */
  @JSName("And")
  var And_UnmarshalledLifecycleRuleFilter: js.UndefOr[UnmarshalledLifecycleRuleAndOperator] = js.undefined
  /**
    * <p>This tag must exist in the object's tag set in order for the rule to apply.</p>
    */
  @JSName("Tag")
  var Tag_UnmarshalledLifecycleRuleFilter: js.UndefOr[UnmarshalledTag] = js.undefined
}

object UnmarshalledLifecycleRuleFilter {
  @scala.inline
  def apply(
    And: UnmarshalledLifecycleRuleAndOperator = null,
    Prefix: String = null,
    Tag: UnmarshalledTag = null
  ): UnmarshalledLifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledLifecycleRuleFilter]
  }
}

