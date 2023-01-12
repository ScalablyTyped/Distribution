package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.blur
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.focus
import typings.std.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverFocusobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/focusobserver", JSImport.Default)
  @js.native
  open class default () extends FocusObserver
  
  @js.native
  trait FocusObserver
    extends typings.ckeditorCkeditor5Engine.srcViewObserverDomeventobserverMod.default {
    
    @JSName("domEventType")
    val domEventType_FocusObserver: js.Tuple2[focus, blur] = js.native
    
    def onDomEvent(domEvent: FocusEvent): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var FocusObserver: typings.ckeditorCkeditor5Engine.srcViewObserverFocusobserverMod.FocusObserver
    }
    object Observers {
      
      inline def apply(FocusObserver: FocusObserver): Observers = {
        val __obj = js.Dynamic.literal(FocusObserver = FocusObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Observers] (val x: Self) extends AnyVal {
        
        inline def setFocusObserver(value: FocusObserver): Self = StObject.set(x, "FocusObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
