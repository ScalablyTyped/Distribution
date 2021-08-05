package typings.detectIt

import org.scalablytyped.runtime.Shortcut
import typings.detectHover.mod.detectHover
import typings.detectIt.detectItStrings.coarse
import typings.detectIt.detectItStrings.fine
import typings.detectIt.detectItStrings.hover
import typings.detectIt.detectItStrings.hybrid
import typings.detectIt.detectItStrings.mouseOnly
import typings.detectIt.detectItStrings.none
import typings.detectIt.detectItStrings.touchOnly
import typings.detectPassiveEvents.mod.detectPassiveEvents
import typings.detectPointer.mod.detectPointer
import typings.detectTouchEvents.mod.detectTouchEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("detect-it", JSImport.Default)
  @js.native
  val default: typings.detectIt.mod.detectIt = js.native
  
  type _To = typings.detectIt.mod.detectIt
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typings.detectIt.mod.detectIt = default
  
  trait detectIt extends StObject {
    
    var deviceType: hybrid | mouseOnly | touchOnly
    
    var hasMouse: Boolean
    
    var hasTouch: Boolean
    
    var maxTouchPoints: Double
    
    var passiveEvents: Boolean
    
    var primaryHover: hover | none
    
    var primaryPointer: coarse | fine | none
    
    var state: typings.detectIt.mod.state
    
    def update(): Unit
  }
  object detectIt {
    
    inline def apply(
      deviceType: hybrid | mouseOnly | touchOnly,
      hasMouse: Boolean,
      hasTouch: Boolean,
      maxTouchPoints: Double,
      passiveEvents: Boolean,
      primaryHover: hover | none,
      primaryPointer: coarse | fine | none,
      state: state,
      update: () => Unit
    ): typings.detectIt.mod.detectIt = {
      val __obj = js.Dynamic.literal(deviceType = deviceType.asInstanceOf[js.Any], hasMouse = hasMouse.asInstanceOf[js.Any], hasTouch = hasTouch.asInstanceOf[js.Any], maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any], passiveEvents = passiveEvents.asInstanceOf[js.Any], primaryHover = primaryHover.asInstanceOf[js.Any], primaryPointer = primaryPointer.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[typings.detectIt.mod.detectIt]
    }
    
    extension [Self <: typings.detectIt.mod.detectIt](x: Self) {
      
      inline def setDeviceType(value: hybrid | mouseOnly | touchOnly): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
      
      inline def setHasMouse(value: Boolean): Self = StObject.set(x, "hasMouse", value.asInstanceOf[js.Any])
      
      inline def setHasTouch(value: Boolean): Self = StObject.set(x, "hasTouch", value.asInstanceOf[js.Any])
      
      inline def setMaxTouchPoints(value: Double): Self = StObject.set(x, "maxTouchPoints", value.asInstanceOf[js.Any])
      
      inline def setPassiveEvents(value: Boolean): Self = StObject.set(x, "passiveEvents", value.asInstanceOf[js.Any])
      
      inline def setPrimaryHover(value: hover | none): Self = StObject.set(x, "primaryHover", value.asInstanceOf[js.Any])
      
      inline def setPrimaryPointer(value: coarse | fine | none): Self = StObject.set(x, "primaryPointer", value.asInstanceOf[js.Any])
      
      inline def setState(value: state): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait state extends StObject {
    
    var detectHover: typings.detectHover.mod.detectHover
    
    var detectPassiveEvents: typings.detectPassiveEvents.mod.detectPassiveEvents
    
    var detectPointer: typings.detectPointer.mod.detectPointer
    
    var detectTouchEvents: typings.detectTouchEvents.mod.detectTouchEvents
  }
  object state {
    
    inline def apply(
      detectHover: detectHover,
      detectPassiveEvents: detectPassiveEvents,
      detectPointer: detectPointer,
      detectTouchEvents: detectTouchEvents
    ): state = {
      val __obj = js.Dynamic.literal(detectHover = detectHover.asInstanceOf[js.Any], detectPassiveEvents = detectPassiveEvents.asInstanceOf[js.Any], detectPointer = detectPointer.asInstanceOf[js.Any], detectTouchEvents = detectTouchEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[state]
    }
    
    extension [Self <: state](x: Self) {
      
      inline def setDetectHover(value: detectHover): Self = StObject.set(x, "detectHover", value.asInstanceOf[js.Any])
      
      inline def setDetectPassiveEvents(value: detectPassiveEvents): Self = StObject.set(x, "detectPassiveEvents", value.asInstanceOf[js.Any])
      
      inline def setDetectPointer(value: detectPointer): Self = StObject.set(x, "detectPointer", value.asInstanceOf[js.Any])
      
      inline def setDetectTouchEvents(value: detectTouchEvents): Self = StObject.set(x, "detectTouchEvents", value.asInstanceOf[js.Any])
    }
  }
}
