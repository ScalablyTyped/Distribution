package typings.awsSdkClientS3Browser.typesAnalyticsAndOperatorMod

import typings.awsSdkClientS3Browser.typesTagMod.Tag
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsAndOperator extends js.Object {
  /**
    * <p>The prefix to use when evaluating an AND predicate.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>The list of tags to use when evaluating an AND predicate.</p>
    */
  var Tags: js.UndefOr[js.Array[Tag] | Iterable[Tag]] = js.undefined
}

object AnalyticsAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[Tag] | Iterable[Tag] = null): AnalyticsAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsAndOperator]
  }
}

