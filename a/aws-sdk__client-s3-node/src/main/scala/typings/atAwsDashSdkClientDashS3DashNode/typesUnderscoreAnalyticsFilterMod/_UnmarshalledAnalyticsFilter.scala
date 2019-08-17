package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAnalyticsFilterMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAnalyticsAndOperatorMod._UnmarshalledAnalyticsAndOperator
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTagMod._UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAnalyticsFilter extends _AnalyticsFilter {
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.</p>
    */
  @JSName("And")
  var And__UnmarshalledAnalyticsFilter: js.UndefOr[_UnmarshalledAnalyticsAndOperator] = js.undefined
  /**
    * <p>The tag to use when evaluating an analytics filter.</p>
    */
  @JSName("Tag")
  var Tag__UnmarshalledAnalyticsFilter: js.UndefOr[_UnmarshalledTag] = js.undefined
}

object _UnmarshalledAnalyticsFilter {
  @scala.inline
  def apply(And: _UnmarshalledAnalyticsAndOperator = null, Prefix: String = null, Tag: _UnmarshalledTag = null): _UnmarshalledAnalyticsFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    __obj.asInstanceOf[_UnmarshalledAnalyticsFilter]
  }
}

