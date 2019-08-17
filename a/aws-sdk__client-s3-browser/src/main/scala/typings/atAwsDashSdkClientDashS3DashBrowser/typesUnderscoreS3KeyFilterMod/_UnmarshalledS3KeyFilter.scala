package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreS3KeyFilterMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreFilterRuleMod._UnmarshalledFilterRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledS3KeyFilter extends _S3KeyFilter {
  /**
    * <p>A list of containers for key value pair that defines the criteria for the filter rule.</p>
    */
  @JSName("FilterRules")
  var FilterRules__UnmarshalledS3KeyFilter: js.UndefOr[js.Array[_UnmarshalledFilterRule]] = js.undefined
}

object _UnmarshalledS3KeyFilter {
  @scala.inline
  def apply(FilterRules: js.Array[_UnmarshalledFilterRule] = null): _UnmarshalledS3KeyFilter = {
    val __obj = js.Dynamic.literal()
    if (FilterRules != null) __obj.updateDynamic("FilterRules")(FilterRules)
    __obj.asInstanceOf[_UnmarshalledS3KeyFilter]
  }
}

