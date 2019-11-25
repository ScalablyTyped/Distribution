package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLifecycleRuleFilterMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLifecycleRuleAndOperatorMod._LifecycleRuleAndOperator
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTagMod._Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _LifecycleRuleFilter extends js.Object {
  /**
    * <p>This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.</p>
    */
  var And: js.UndefOr[_LifecycleRuleAndOperator] = js.undefined
  /**
    * <p>Prefix identifying one or more objects to which the rule applies.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>This tag must exist in the object's tag set in order for the rule to apply.</p>
    */
  var Tag: js.UndefOr[_Tag] = js.undefined
}

object _LifecycleRuleFilter {
  @scala.inline
  def apply(And: _LifecycleRuleAndOperator = null, Prefix: String = null, Tag: _Tag = null): _LifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[_LifecycleRuleFilter]
  }
}

