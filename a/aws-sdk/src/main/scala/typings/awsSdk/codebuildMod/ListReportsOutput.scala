package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReportsOutput extends StObject {
  
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    *  The list of returned ARNs for the reports in the current AWS account. 
    */
  var reports: js.UndefOr[ReportArns] = js.undefined
}
object ListReportsOutput {
  
  @scala.inline
  def apply(): ListReportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportsOutput]
  }
  
  @scala.inline
  implicit class ListReportsOutputMutableBuilder[Self <: ListReportsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setReports(value: ReportArns): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    @scala.inline
    def setReportsVarargs(value: NonEmptyString*): Self = StObject.set(x, "reports", js.Array(value :_*))
  }
}
