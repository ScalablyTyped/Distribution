package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.arrowkeysobserverMod.ArrowKeysObserver
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.mousedown
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.mouseout
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.mouseover
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.mouseup
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mouseobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/mouseobserver", JSImport.Default)
  @js.native
  open class default () extends MouseObserver
  
  @js.native
  trait MouseObserver
    extends typings.ckeditorCkeditor5Engine.domeventobserverMod.default {
    
    @JSName("domEventType")
    val domEventType_MouseObserver: js.Tuple4[mousedown, mouseup, mouseover, mouseout] = js.native
    
    def onDomEvent(domEvent: MouseEvent): Unit = js.native
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
