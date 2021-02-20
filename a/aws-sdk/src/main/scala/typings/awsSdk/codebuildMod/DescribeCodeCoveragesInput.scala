package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCodeCoveragesInput extends StObject {
  
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
  implicit class DescribeCodeCoveragesInputMutableBuilder[Self <: DescribeCodeCoveragesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxLineCoveragePercentage(value: Percentage): Self = StObject.set(x, "maxLineCoveragePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLineCoveragePercentageUndefined: Self = StObject.set(x, "maxLineCoveragePercentage", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMinLineCoveragePercentage(value: Percentage): Self = StObject.set(x, "minLineCoveragePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLineCoveragePercentageUndefined: Self = StObject.set(x, "minLineCoveragePercentage", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setReportArn(value: NonEmptyString): Self = StObject.set(x, "reportArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortBy(value: ReportCodeCoverageSortByType): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrderType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
