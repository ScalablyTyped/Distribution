package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventTypesResult extends StObject {
  
  /**
    * An array of event types.
    */
  var eventTypes: js.UndefOr[eventTypeList] = js.undefined
  
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetEventTypesResult {
  
  inline def apply(): GetEventTypesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventTypesResult]
  }
  
  extension [Self <: GetEventTypesResult](x: Self) {
    
    inline def setEventTypes(value: eventTypeList): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
    
    inline def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
    
    inline def setEventTypesVarargs(value: EventType*): Self = StObject.set(x, "eventTypes", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
