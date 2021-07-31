package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTestGridSessionsResult extends StObject {
  
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The sessions that match the criteria in a ListTestGridSessionsRequest. 
    */
  var testGridSessions: js.UndefOr[TestGridSessions] = js.undefined
}
object ListTestGridSessionsResult {
  
  @scala.inline
  def apply(): ListTestGridSessionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridSessionsResult]
  }
  
  @scala.inline
  implicit class ListTestGridSessionsResultMutableBuilder[Self <: ListTestGridSessionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTestGridSessions(value: TestGridSessions): Self = StObject.set(x, "testGridSessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestGridSessionsUndefined: Self = StObject.set(x, "testGridSessions", js.undefined)
    
    @scala.inline
    def setTestGridSessionsVarargs(value: TestGridSession*): Self = StObject.set(x, "testGridSessions", js.Array(value :_*))
  }
}
