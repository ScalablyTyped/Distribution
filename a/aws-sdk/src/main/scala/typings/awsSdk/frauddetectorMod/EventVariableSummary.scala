package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventVariableSummary extends StObject {
  
  /**
    *  The event variable name. 
    */
  var name: js.UndefOr[sensitiveString] = js.undefined
  
  /**
    *  The event variable source. 
    */
  var source: js.UndefOr[sensitiveString] = js.undefined
  
  /**
    *  The value of the event variable. 
    */
  var value: js.UndefOr[sensitiveString] = js.undefined
}
object EventVariableSummary {
  
  inline def apply(): EventVariableSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventVariableSummary]
  }
  
  extension [Self <: EventVariableSummary](x: Self) {
    
    inline def setName(value: sensitiveString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSource(value: sensitiveString): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setValue(value: sensitiveString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
