package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOutcomesRequest extends StObject {
  
  /**
    * The maximum number of objects to return for the request. 
    */
  var maxResults: js.UndefOr[OutcomesMaxResults] = js.undefined
  
  /**
    * The name of the outcome or outcomes to get.
    */
  var name: js.UndefOr[identifier] = js.undefined
  
  /**
    * The next page token for the request. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetOutcomesRequest {
  
  inline def apply(): GetOutcomesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutcomesRequest]
  }
  
  extension [Self <: GetOutcomesRequest](x: Self) {
    
    inline def setMaxResults(value: OutcomesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
