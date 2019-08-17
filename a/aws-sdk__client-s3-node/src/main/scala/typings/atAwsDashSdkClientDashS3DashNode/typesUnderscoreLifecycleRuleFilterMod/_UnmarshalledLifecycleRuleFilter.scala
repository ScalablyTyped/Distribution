package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLifecycleRuleFilterMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLifecycleRuleAndOperatorMod._UnmarshalledLifecycleRuleAndOperator
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTagMod._UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledLifecycleRuleFilter extends _LifecycleRuleFilter {
  /**
    * <p>This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.</p>
    */
  @JSName("And")
  var And__UnmarshalledLifecycleRuleFilter: js.UndefOr[_UnmarshalledLifecycleRuleAndOperator] = js.undefined
  /**
    * <p>This tag must exist in the object's tag set in order for the rule to apply.</p>
    */
  @JSName("Tag")
  var Tag__UnmarshalledLifecycleRuleFilter: js.UndefOr[_UnmarshalledTag] = js.undefined
}

object _UnmarshalledLifecycleRuleFilter {
  @scala.inline
  def apply(
    And: _UnmarshalledLifecycleRuleAndOperator = null,
    Prefix: String = null,
    Tag: _UnmarshalledTag = null
  ): _UnmarshalledLifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    __obj.asInstanceOf[_UnmarshalledLifecycleRuleFilter]
  }
}

