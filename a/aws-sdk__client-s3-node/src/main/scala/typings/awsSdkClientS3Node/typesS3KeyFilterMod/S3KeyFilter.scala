package typings.awsSdkClientS3Node.typesS3KeyFilterMod

import typings.awsSdkClientS3Node.typesFilterRuleMod.FilterRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3KeyFilter extends js.Object {
  /**
    * <p>A list of containers for key value pair that defines the criteria for the filter rule.</p>
    */
  var FilterRules: js.UndefOr[js.Array[FilterRule] | Iterable[FilterRule]] = js.undefined
}

object S3KeyFilter {
  @scala.inline
  def apply(FilterRules: js.Array[FilterRule] | Iterable[FilterRule] = null): S3KeyFilter = {
    val __obj = js.Dynamic.literal()
    if (FilterRules != null) __obj.updateDynamic("FilterRules")(FilterRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3KeyFilter]
  }
}

