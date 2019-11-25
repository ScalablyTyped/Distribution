package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAnalyticsFilterMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAnalyticsAndOperatorMod._AnalyticsAndOperator
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTagMod._Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AnalyticsFilter extends js.Object {
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.</p>
    */
  var And: js.UndefOr[_AnalyticsAndOperator] = js.undefined
  /**
    * <p>The prefix to use when evaluating an analytics filter.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>The tag to use when evaluating an analytics filter.</p>
    */
  var Tag: js.UndefOr[_Tag] = js.undefined
}

object _AnalyticsFilter {
  @scala.inline
  def apply(And: _AnalyticsAndOperator = null, Prefix: String = null, Tag: _Tag = null): _AnalyticsFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnalyticsFilter]
  }
}

