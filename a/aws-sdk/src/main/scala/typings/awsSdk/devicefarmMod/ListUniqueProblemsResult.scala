package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUniqueProblemsResult extends StObject {
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the unique problems. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var uniqueProblems: js.UndefOr[UniqueProblemsByExecutionResultMap] = js.undefined
}
object ListUniqueProblemsResult {
  
  inline def apply(): ListUniqueProblemsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUniqueProblemsResult]
  }
  
  extension [Self <: ListUniqueProblemsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setUniqueProblems(value: UniqueProblemsByExecutionResultMap): Self = StObject.set(x, "uniqueProblems", value.asInstanceOf[js.Any])
    
    inline def setUniqueProblemsUndefined: Self = StObject.set(x, "uniqueProblems", js.undefined)
  }
}
