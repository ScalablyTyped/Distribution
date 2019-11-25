package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreAnalyticsAndOperatorMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTagMod._UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAnalyticsAndOperator extends _AnalyticsAndOperator {
  /**
    * <p>The list of tags to use when evaluating an AND predicate.</p>
    */
  @JSName("Tags")
  var Tags__UnmarshalledAnalyticsAndOperator: js.UndefOr[js.Array[_UnmarshalledTag]] = js.undefined
}

object _UnmarshalledAnalyticsAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[_UnmarshalledTag] = null): _UnmarshalledAnalyticsAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledAnalyticsAndOperator]
  }
}

