package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreMetricsAndOperatorMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTagMod._Tag
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MetricsAndOperator extends js.Object {
  /**
    * <p>The prefix used when evaluating an AND predicate.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>The list of tags used when evaluating an AND predicate.</p>
    */
  var Tags: js.UndefOr[js.Array[_Tag] | Iterable[_Tag]] = js.undefined
}

object _MetricsAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[_Tag] | Iterable[_Tag] = null): _MetricsAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MetricsAndOperator]
  }
}

