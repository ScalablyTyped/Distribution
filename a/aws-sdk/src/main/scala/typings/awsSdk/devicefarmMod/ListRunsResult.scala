package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRunsResult extends StObject {
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the runs.
    */
  var runs: js.UndefOr[Runs] = js.undefined
}
object ListRunsResult {
  
  inline def apply(): ListRunsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRunsResult]
  }
  
  extension [Self <: ListRunsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRuns(value: Runs): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    inline def setRunsUndefined: Self = StObject.set(x, "runs", js.undefined)
    
    inline def setRunsVarargs(value: Run*): Self = StObject.set(x, "runs", js.Array(value :_*))
  }
}
