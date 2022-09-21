package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.arrowkeysobserverMod.ArrowKeysObserver
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.blur
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.focus
import typings.std.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/focusobserver", JSImport.Default)
  @js.native
  open class default () extends FocusObserver
  
  @js.native
  trait FocusObserver
    extends typings.ckeditorCkeditor5Engine.domeventobserverMod.default {
    
    @JSName("domEventType")
    val domEventType_FocusObserver: js.Tuple2[focus, blur] = js.native
    
    def onDomEvent(domEvent: FocusEvent): Unit = js.native
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
