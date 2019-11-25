package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreMetricsFilterMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreMetricsAndOperatorMod._UnmarshalledMetricsAndOperator
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTagMod._UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledMetricsFilter extends _MetricsFilter {
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.</p>
    */
  @JSName("And")
  var And__UnmarshalledMetricsFilter: js.UndefOr[_UnmarshalledMetricsAndOperator] = js.undefined
  /**
    * <p>The tag used when evaluating a metrics filter.</p>
    */
  @JSName("Tag")
  var Tag__UnmarshalledMetricsFilter: js.UndefOr[_UnmarshalledTag] = js.undefined
}

object _UnmarshalledMetricsFilter {
  @scala.inline
  def apply(And: _UnmarshalledMetricsAndOperator = null, Prefix: String = null, Tag: _UnmarshalledTag = null): _UnmarshalledMetricsFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledMetricsFilter]
  }
}

