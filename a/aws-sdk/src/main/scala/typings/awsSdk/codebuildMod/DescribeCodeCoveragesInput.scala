package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCodeCoveragesInput extends StObject {
  
  /**
    * The maximum line coverage percentage to report.
    */
  var maxLineCoveragePercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * The minimum line coverage percentage to report.
    */
  var minLineCoveragePercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The nextToken value returned from a previous call to DescribeCodeCoverages. This specifies the next item to return. To return the beginning of the list, exclude this parameter.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    *  The ARN of the report for which test cases are returned. 
    */
  var reportArn: NonEmptyString
  
  /**
    * Specifies how the results are sorted. Possible values are:  FILE_PATH  The results are sorted by file path.  LINE_COVERAGE_PERCENTAGE  The results are sorted by the percentage of lines that are covered.  
    */
  var sortBy: js.UndefOr[ReportCodeCoverageSortByType] = js.undefined
  
  /**
    * Specifies if the results are sorted in ascending or descending order.
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.undefined
}
object DescribeCodeCoveragesInput {
  
  inline def apply(reportArn: NonEmptyString): DescribeCodeCoveragesInput = {
    val __obj = js.Dynamic.literal(reportArn = reportArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeCoveragesInput]
  }
  
  extension [Self <: DescribeCodeCoveragesInput](x: Self) {
    
    inline def setMaxLineCoveragePercentage(value: Percentage): Self = StObject.set(x, "maxLineCoveragePercentage", value.asInstanceOf[js.Any])
    
    inline def setMaxLineCoveragePercentageUndefined: Self = StObject.set(x, "maxLineCoveragePercentage", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMinLineCoveragePercentage(value: Percentage): Self = StObject.set(x, "minLineCoveragePercentage", value.asInstanceOf[js.Any])
    
    inline def setMinLineCoveragePercentageUndefined: Self = StObject.set(x, "minLineCoveragePercentage", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReportArn(value: NonEmptyString): Self = StObject.set(x, "reportArn", value.asInstanceOf[js.Any])
    
    inline def setSortBy(value: ReportCodeCoverageSortByType): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrderType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
