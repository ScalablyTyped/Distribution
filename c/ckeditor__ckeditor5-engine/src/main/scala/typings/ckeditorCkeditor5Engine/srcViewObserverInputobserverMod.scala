package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.beforeinput
import typings.std.InputEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverInputobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/inputobserver", JSImport.Default)
  @js.native
  open class default () extends InputObserver
  
  @js.native
  trait InputObserver
    extends typings.ckeditorCkeditor5Engine.srcViewObserverDomeventobserverMod.default {
    
    @JSName("domEventType")
    val domEventType_InputObserver: js.Array[beforeinput] = js.native
    
    def onDomEvent(domEvent: InputEvent): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var InputObserver: typings.ckeditorCkeditor5Engine.srcViewObserverInputobserverMod.InputObserver
    }
    object Observers {
      
      inline def apply(InputObserver: InputObserver): Observers = {
        val __obj = js.Dynamic.literal(InputObserver = InputObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Observers] (val x: Self) extends AnyVal {
        
        inline def setInputObserver(value: InputObserver): Self = StObject.set(x, "InputObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
