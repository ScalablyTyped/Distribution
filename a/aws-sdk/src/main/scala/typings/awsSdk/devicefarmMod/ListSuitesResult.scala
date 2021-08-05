package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSuitesResult extends StObject {
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the suites.
    */
  var suites: js.UndefOr[Suites] = js.undefined
}
object ListSuitesResult {
  
  inline def apply(): ListSuitesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSuitesResult]
  }
  
  extension [Self <: ListSuitesResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSuites(value: Suites): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
    
    inline def setSuitesUndefined: Self = StObject.set(x, "suites", js.undefined)
    
    inline def setSuitesVarargs(value: Suite*): Self = StObject.set(x, "suites", js.Array(value :_*))
  }
}
