package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsSummary extends js.Object {
  /**
    *  Total number of recommendations found in the code review. 
    */
  var FindingsCount: js.UndefOr[typings.awsSdk.codegurureviewerMod.FindingsCount] = js.native
  /**
    *  Lines of code metered in the code review. For the initial code review pull request and all subsequent revisions, this includes all lines of code in the files added to the pull request. In subsequent revisions, for files that already existed in the pull request, this includes only the changed lines of code. In both cases, this does not include non-code lines such as comments and import statements. For example, if you submit a pull request containing 5 files, each with 500 lines of code, and in a subsequent revision you added a new file with 200 lines of code, and also modified a total of 25 lines across the initial 5 files, MeteredLinesOfCodeCount includes the first 5 files (5 * 500 = 2,500 lines), the new file (200 lines) and the 25 changed lines of code for a total of 2,725 lines of code. 
    */
  var MeteredLinesOfCodeCount: js.UndefOr[typings.awsSdk.codegurureviewerMod.MeteredLinesOfCodeCount] = js.native
}

object MetricsSummary {
  @scala.inline
  def apply(
    FindingsCount: js.UndefOr[FindingsCount] = js.undefined,
    MeteredLinesOfCodeCount: js.UndefOr[MeteredLinesOfCodeCount] = js.undefined
  ): MetricsSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FindingsCount)) __obj.updateDynamic("FindingsCount")(FindingsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MeteredLinesOfCodeCount)) __obj.updateDynamic("MeteredLinesOfCodeCount")(MeteredLinesOfCodeCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsSummary]
  }
}

