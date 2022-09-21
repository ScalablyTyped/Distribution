package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEulasRequest extends StObject {
  
  /**
    * The list of EULA IDs that should be returned
    */
  var eulaIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The token to request the next page of results. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListEulasRequest {
  
  inline def apply(): ListEulasRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEulasRequest]
  }
  
  extension [Self <: ListEulasRequest](x: Self) {
    
    inline def setEulaIds(value: StringList): Self = StObject.set(x, "eulaIds", value.asInstanceOf[js.Any])
    
    inline def setEulaIdsUndefined: Self = StObject.set(x, "eulaIds", js.undefined)
    
    inline def setEulaIdsVarargs(value: String*): Self = StObject.set(x, "eulaIds", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
