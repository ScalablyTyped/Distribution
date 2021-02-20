package typings.awsSdk.redshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStatementsResponse extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response records have been retrieved for the request. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The SQL statements. 
    */
  var Statements: StatementList = js.native
}
object ListStatementsResponse {
  
  @scala.inline
  def apply(Statements: StatementList): ListStatementsResponse = {
    val __obj = js.Dynamic.literal(Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStatementsResponse]
  }
  
  @scala.inline
  implicit class ListStatementsResponseMutableBuilder[Self <: ListStatementsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatements(value: StatementList): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: StatementData*): Self = StObject.set(x, "Statements", js.Array(value :_*))
  }
}
