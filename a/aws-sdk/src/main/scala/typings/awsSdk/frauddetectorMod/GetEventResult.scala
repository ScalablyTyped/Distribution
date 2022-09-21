package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventResult extends StObject {
  
  /**
    * The details of the event.
    */
  var event: js.UndefOr[Event] = js.undefined
}
object GetEventResult {
  
  inline def apply(): GetEventResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventResult]
  }
  
  extension [Self <: GetEventResult](x: Self) {
    
    inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
