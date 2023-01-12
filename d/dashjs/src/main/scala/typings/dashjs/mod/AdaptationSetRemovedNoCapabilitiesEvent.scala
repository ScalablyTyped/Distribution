package typings.dashjs.mod

import typings.dashjs.dashjsStrings.adaptationSetRemovedNoCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdaptationSetRemovedNoCapabilitiesEvent
  extends StObject
     with Event {
  
  var adaptationSet: js.Object
  
  @JSName("type")
  var type_AdaptationSetRemovedNoCapabilitiesEvent: adaptationSetRemovedNoCapabilities
}
object AdaptationSetRemovedNoCapabilitiesEvent {
  
  inline def apply(adaptationSet: js.Object): AdaptationSetRemovedNoCapabilitiesEvent = {
    val __obj = js.Dynamic.literal(adaptationSet = adaptationSet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("adaptationSetRemovedNoCapabilities")
    __obj.asInstanceOf[AdaptationSetRemovedNoCapabilitiesEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdaptationSetRemovedNoCapabilitiesEvent] (val x: Self) extends AnyVal {
    
    inline def setAdaptationSet(value: js.Object): Self = StObject.set(x, "adaptationSet", value.asInstanceOf[js.Any])
    
    inline def setType(value: adaptationSetRemovedNoCapabilities): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
