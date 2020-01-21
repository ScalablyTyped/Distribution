package typings.awsSdkClientS3Node.typesS3KeyFilterMod

import typings.awsSdkClientS3Node.typesFilterRuleMod.UnmarshalledFilterRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledS3KeyFilter extends S3KeyFilter {
  /**
    * <p>A list of containers for key value pair that defines the criteria for the filter rule.</p>
    */
  @JSName("FilterRules")
  var FilterRules_UnmarshalledS3KeyFilter: js.UndefOr[js.Array[UnmarshalledFilterRule]] = js.undefined
}

object UnmarshalledS3KeyFilter {
  @scala.inline
  def apply(FilterRules: js.Array[UnmarshalledFilterRule] = null): UnmarshalledS3KeyFilter = {
    val __obj = js.Dynamic.literal()
    if (FilterRules != null) __obj.updateDynamic("FilterRules")(FilterRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledS3KeyFilter]
  }
}

