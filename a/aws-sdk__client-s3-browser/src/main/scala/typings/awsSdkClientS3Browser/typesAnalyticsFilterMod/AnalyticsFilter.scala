package typings.awsSdkClientS3Browser.typesAnalyticsFilterMod

import typings.awsSdkClientS3Browser.typesAnalyticsAndOperatorMod.AnalyticsAndOperator
import typings.awsSdkClientS3Browser.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsFilter extends js.Object {
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.</p>
    */
  var And: js.UndefOr[AnalyticsAndOperator] = js.undefined
  /**
    * <p>The prefix to use when evaluating an analytics filter.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>The tag to use when evaluating an analytics filter.</p>
    */
  var Tag: js.UndefOr[typings.awsSdkClientS3Browser.typesTagMod.Tag] = js.undefined
}

object AnalyticsFilter {
  @scala.inline
  def apply(And: AnalyticsAndOperator = null, Prefix: String = null, Tag: Tag = null): AnalyticsFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsFilter]
  }
}

