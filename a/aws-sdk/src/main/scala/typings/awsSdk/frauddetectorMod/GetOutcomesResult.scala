package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOutcomesResult extends StObject {
  
  /**
    * The next page token for subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The outcomes. 
    */
  var outcomes: js.UndefOr[OutcomeList] = js.undefined
}
object GetOutcomesResult {
  
  inline def apply(): GetOutcomesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutcomesResult]
  }
  
  extension [Self <: GetOutcomesResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOutcomes(value: OutcomeList): Self = StObject.set(x, "outcomes", value.asInstanceOf[js.Any])
    
    inline def setOutcomesUndefined: Self = StObject.set(x, "outcomes", js.undefined)
    
    inline def setOutcomesVarargs(value: Outcome*): Self = StObject.set(x, "outcomes", js.Array(value :_*))
  }
}
