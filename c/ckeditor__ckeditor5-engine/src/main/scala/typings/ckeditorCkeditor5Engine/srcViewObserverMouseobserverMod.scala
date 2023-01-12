package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.mousedown
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.mouseout
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.mouseover
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.mouseup
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverMouseobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/mouseobserver", JSImport.Default)
  @js.native
  open class default () extends MouseObserver
  
  @js.native
  trait MouseObserver
    extends typings.ckeditorCkeditor5Engine.srcViewObserverDomeventobserverMod.default {
    
    @JSName("domEventType")
    val domEventType_MouseObserver: js.Tuple4[mousedown, mouseup, mouseover, mouseout] = js.native
    
    def onDomEvent(domEvent: MouseEvent): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var MouseObserver: typings.ckeditorCkeditor5Engine.srcViewObserverMouseobserverMod.MouseObserver
    }
    object Observers {
      
      inline def apply(MouseObserver: MouseObserver): Observers = {
        val __obj = js.Dynamic.literal(MouseObserver = MouseObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Observers] (val x: Self) extends AnyVal {
        
        inline def setMouseObserver(value: MouseObserver): Self = StObject.set(x, "MouseObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
