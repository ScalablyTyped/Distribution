package typings.awsSdkClientS3Node.typesMetricsFilterMod

import typings.awsSdkClientS3Node.typesMetricsAndOperatorMod.UnmarshalledMetricsAndOperator
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledMetricsFilter extends MetricsFilter {
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.</p>
    */
  @JSName("And")
  var And_UnmarshalledMetricsFilter: js.UndefOr[UnmarshalledMetricsAndOperator] = js.undefined
  /**
    * <p>The tag used when evaluating a metrics filter.</p>
    */
  @JSName("Tag")
  var Tag_UnmarshalledMetricsFilter: js.UndefOr[UnmarshalledTag] = js.undefined
}

object UnmarshalledMetricsFilter {
  @scala.inline
  def apply(And: UnmarshalledMetricsAndOperator = null, Prefix: String = null, Tag: UnmarshalledTag = null): UnmarshalledMetricsFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledMetricsFilter]
  }
}

