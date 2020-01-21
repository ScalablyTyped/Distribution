package typings.awsSdkClientS3Node.typesMetricsAndOperatorMod

import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledMetricsAndOperator extends MetricsAndOperator {
  /**
    * <p>The list of tags used when evaluating an AND predicate.</p>
    */
  @JSName("Tags")
  var Tags_UnmarshalledMetricsAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.undefined
}

object UnmarshalledMetricsAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[UnmarshalledTag] = null): UnmarshalledMetricsAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledMetricsAndOperator]
  }
}

