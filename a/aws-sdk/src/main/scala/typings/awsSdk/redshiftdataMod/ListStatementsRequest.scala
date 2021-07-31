package typings.awsSdk.redshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStatementsRequest extends StObject {
  
  /**
    * The maximum number of SQL statements to return in the response. If more SQL statements exist than fit in one response, then NextToken is returned to page through the results. 
    */
  var MaxResults: js.UndefOr[ListStatementsLimit] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response records have been retrieved for the request. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the SQL statement specified as input to ExecuteStatement to identify the query. You can list multiple statements by providing a prefix that matches the beginning of the statement name. For example, to list myStatement1, myStatement2, myStatement3, and so on, then provide the a value of myStatement. Data API does a case-sensitive match of SQL statement names to the prefix value you provide. 
    */
  var StatementName: js.UndefOr[StatementNameString] = js.undefined
  
  /**
    * The status of the SQL statement to list. Status values are defined as follows:    ABORTED - The query run was stopped by the user.    ALL - A status value that includes all query statuses. This value can be used to filter results.    FAILED - The query run failed.    FINISHED - The query has finished running.    PICKED - The query has been chosen to be run.    STARTED - The query run has started.    SUBMITTED - The query was submitted, but not yet processed.   
    */
  var Status: js.UndefOr[StatusString] = js.undefined
}
object ListStatementsRequest {
  
  @scala.inline
  def apply(): ListStatementsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStatementsRequest]
  }
  
  @scala.inline
  implicit class ListStatementsRequestMutableBuilder[Self <: ListStatementsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ListStatementsLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatementName(value: StatementNameString): Self = StObject.set(x, "StatementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementNameUndefined: Self = StObject.set(x, "StatementName", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
