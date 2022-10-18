package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.srcViewViewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverArrowkeysobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/arrowkeysobserver", JSImport.Default)
  @js.native
  open class default () extends ArrowKeysObserver
  
  @js.native
  trait ArrowKeysObserver
    extends typings.ckeditorCkeditor5Engine.srcViewObserverObserverMod.default[View] {
    
    def observe(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var ArrowKeysObserver: typings.ckeditorCkeditor5Engine.srcViewObserverArrowkeysobserverMod.ArrowKeysObserver
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
