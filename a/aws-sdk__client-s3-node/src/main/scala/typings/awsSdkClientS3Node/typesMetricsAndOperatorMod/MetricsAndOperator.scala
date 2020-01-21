package typings.awsSdkClientS3Node.typesMetricsAndOperatorMod

import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsAndOperator extends js.Object {
  /**
    * <p>The prefix used when evaluating an AND predicate.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>The list of tags used when evaluating an AND predicate.</p>
    */
  var Tags: js.UndefOr[js.Array[Tag] | Iterable[Tag]] = js.undefined
}

object MetricsAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[Tag] | Iterable[Tag] = null): MetricsAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsAndOperator]
  }
}

