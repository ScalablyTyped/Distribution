package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.arrowkeysobserverMod.ArrowKeysObserver
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.beforeinput
import typings.std.InputEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/inputobserver", JSImport.Default)
  @js.native
  open class default () extends InputObserver
  
  @js.native
  trait InputObserver
    extends typings.ckeditorCkeditor5Engine.domeventobserverMod.default {
    
    @JSName("domEventType")
    val domEventType_InputObserver: js.Array[beforeinput] = js.native
    
    def onDomEvent(domEvent: InputEvent): Unit = js.native
  }
  
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var ArrowKeysObserver: typings.ckeditorCkeditor5Engine.arrowkeysobserverMod.ArrowKeysObserver
    }
    object Observers {
      
      inline def apply(ArrowKeysObserver: ArrowKeysObserver): Observers = {
        val __obj = js.Dynamic.literal(ArrowKeysObserver = ArrowKeysObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      extension [Self <: Observers](x: Self) {
        
        inline def setArrowKeysObserver(value: ArrowKeysObserver): Self = StObject.set(x, "ArrowKeysObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
