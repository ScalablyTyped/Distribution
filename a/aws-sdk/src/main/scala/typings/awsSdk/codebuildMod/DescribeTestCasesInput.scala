package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTestCasesInput extends StObject {
  
  /**
    *  A TestCaseFilter object used to filter the returned reports. 
    */
  var filter: js.UndefOr[TestCaseFilter] = js.native
  
  /**
    *  The maximum number of paginated test cases returned per response. Use nextToken to iterate pages in the list of returned TestCase objects. The default value is 100. 
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    *  The ARN of the report for which test cases are returned. 
    */
  var reportArn: String = js.native
}
object DescribeTestCasesInput {
  
  @scala.inline
  def apply(reportArn: String): DescribeTestCasesInput = {
    val __obj = js.Dynamic.literal(reportArn = reportArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTestCasesInput]
  }
  
  @scala.inline
  implicit class DescribeTestCasesInputMutableBuilder[Self <: DescribeTestCasesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: TestCaseFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setReportArn(value: String): Self = StObject.set(x, "reportArn", value.asInstanceOf[js.Any])
  }
}
