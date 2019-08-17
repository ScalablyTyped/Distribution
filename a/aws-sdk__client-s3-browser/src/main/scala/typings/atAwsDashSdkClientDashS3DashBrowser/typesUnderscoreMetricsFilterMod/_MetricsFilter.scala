package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreMetricsFilterMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreMetricsAndOperatorMod._MetricsAndOperator
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTagMod._Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MetricsFilter extends js.Object {
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.</p>
    */
  var And: js.UndefOr[_MetricsAndOperator] = js.undefined
  /**
    * <p>The prefix used when evaluating a metrics filter.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>The tag used when evaluating a metrics filter.</p>
    */
  var Tag: js.UndefOr[_Tag] = js.undefined
}

object _MetricsFilter {
  @scala.inline
  def apply(And: _MetricsAndOperator = null, Prefix: String = null, Tag: _Tag = null): _MetricsFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    __obj.asInstanceOf[_MetricsFilter]
  }
}

