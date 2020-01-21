package typings.awsSdkClientS3Node.typesMetricsFilterMod

import typings.awsSdkClientS3Node.typesMetricsAndOperatorMod.MetricsAndOperator
import typings.awsSdkClientS3Node.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsFilter extends js.Object {
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.</p>
    */
  var And: js.UndefOr[MetricsAndOperator] = js.undefined
  /**
    * <p>The prefix used when evaluating a metrics filter.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>The tag used when evaluating a metrics filter.</p>
    */
  var Tag: js.UndefOr[typings.awsSdkClientS3Node.typesTagMod.Tag] = js.undefined
}

object MetricsFilter {
  @scala.inline
  def apply(And: MetricsAndOperator = null, Prefix: String = null, Tag: Tag = null): MetricsFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsFilter]
  }
}

