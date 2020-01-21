package typings.awsSdkClientS3Node.typesAnalyticsFilterMod

import typings.awsSdkClientS3Node.typesAnalyticsAndOperatorMod.UnmarshalledAnalyticsAndOperator
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAnalyticsFilter extends AnalyticsFilter {
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.</p>
    */
  @JSName("And")
  var And_UnmarshalledAnalyticsFilter: js.UndefOr[UnmarshalledAnalyticsAndOperator] = js.undefined
  /**
    * <p>The tag to use when evaluating an analytics filter.</p>
    */
  @JSName("Tag")
  var Tag_UnmarshalledAnalyticsFilter: js.UndefOr[UnmarshalledTag] = js.undefined
}

object UnmarshalledAnalyticsFilter {
  @scala.inline
  def apply(And: UnmarshalledAnalyticsAndOperator = null, Prefix: String = null, Tag: UnmarshalledTag = null): UnmarshalledAnalyticsFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAnalyticsFilter]
  }
}

