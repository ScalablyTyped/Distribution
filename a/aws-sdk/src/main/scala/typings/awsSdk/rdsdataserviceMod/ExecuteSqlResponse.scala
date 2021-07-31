package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteSqlResponse extends StObject {
  
  /**
    * The results of the SQL statement or statements.
    */
  var sqlStatementResults: js.UndefOr[SqlStatementResults] = js.undefined
}
object ExecuteSqlResponse {
  
  @scala.inline
  def apply(): ExecuteSqlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteSqlResponse]
  }
  
  @scala.inline
  implicit class ExecuteSqlResponseMutableBuilder[Self <: ExecuteSqlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSqlStatementResults(value: SqlStatementResults): Self = StObject.set(x, "sqlStatementResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlStatementResultsUndefined: Self = StObject.set(x, "sqlStatementResults", js.undefined)
    
    @scala.inline
    def setSqlStatementResultsVarargs(value: SqlStatementResult*): Self = StObject.set(x, "sqlStatementResults", js.Array(value :_*))
  }
}
