package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCodeCoveragesInput extends js.Object {
  
  /**
    * The maximum line coverage percentage to report.
    */
  var maxLineCoveragePercentage: js.UndefOr[Percentage] = js.native
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * The minimum line coverage percentage to report.
    */
  var minLineCoveragePercentage: js.UndefOr[Percentage] = js.native
  
  /**
    * The nextToken value returned from a previous call to DescribeCodeCoverages. This specifies the next item to return. To return the beginning of the list, exclude this parameter.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    *  The ARN of the report for which test cases are returned. 
    */
  var reportArn: NonEmptyString = js.native
  
  /**
    * Specifies how the results are sorted. Possible values are:  FILE_PATH  The results are sorted by file path.  LINE_COVERAGE_PERCENTAGE  The results are sorted by the percentage of lines that are covered.  
    */
  var sortBy: js.UndefOr[ReportCodeCoverageSortByType] = js.native
  
  /**
    * Specifies if the results are sorted in ascending or descending order.
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.native
}
object DescribeCodeCoveragesInput {
  
  @scala.inline
  def apply(reportArn: NonEmptyString): DescribeCodeCoveragesInput = {
    val __obj = js.Dynamic.literal(reportArn = reportArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeCoveragesInput]
  }
  
  @scala.inline
  implicit class DescribeCodeCoveragesInputOps[Self <: DescribeCodeCoveragesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReportArn(value: NonEmptyString): Self = this.set("reportArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLineCoveragePercentage(value: Percentage): Self = this.set("maxLineCoveragePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLineCoveragePercentage: Self = this.set("maxLineCoveragePercentage", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setMinLineCoveragePercentage(value: Percentage): Self = this.set("minLineCoveragePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLineCoveragePercentage: Self = this.set("minLineCoveragePercentage", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: ReportCodeCoverageSortByType): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrderType): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
}
