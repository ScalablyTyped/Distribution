package typings.awsSdkClientS3Browser.typesAnalyticsAndOperatorMod

import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAnalyticsAndOperator extends AnalyticsAndOperator {
  /**
    * <p>The list of tags to use when evaluating an AND predicate.</p>
    */
  @JSName("Tags")
  var Tags_UnmarshalledAnalyticsAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.undefined
}

object UnmarshalledAnalyticsAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[UnmarshalledTag] = null): UnmarshalledAnalyticsAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAnalyticsAndOperator]
  }
}

