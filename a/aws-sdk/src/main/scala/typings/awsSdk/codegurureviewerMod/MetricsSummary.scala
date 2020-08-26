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
  def apply(): MetricsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsSummary]
  }
  @scala.inline
  implicit class MetricsSummaryOps[Self <: MetricsSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFindingsCount(value: FindingsCount): Self = this.set("FindingsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingsCount: Self = this.set("FindingsCount", js.undefined)
    @scala.inline
    def setMeteredLinesOfCodeCount(value: MeteredLinesOfCodeCount): Self = this.set("MeteredLinesOfCodeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeteredLinesOfCodeCount: Self = this.set("MeteredLinesOfCodeCount", js.undefined)
  }
  
}

