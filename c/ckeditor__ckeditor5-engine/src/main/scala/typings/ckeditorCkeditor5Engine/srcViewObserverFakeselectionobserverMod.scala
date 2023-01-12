package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.srcViewViewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverFakeselectionobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/fakeselectionobserver", JSImport.Default)
  @js.native
  open class default () extends FakeSelectionObserver
  
  @js.native
  trait FakeSelectionObserver
    extends typings.ckeditorCkeditor5Engine.srcViewObserverObserverMod.default[View] {
    
    def observe(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var FakeSelectionObserver: typings.ckeditorCkeditor5Engine.srcViewObserverFakeselectionobserverMod.FakeSelectionObserver
    }
    object Observers {
      
      inline def apply(FakeSelectionObserver: FakeSelectionObserver): Observers = {
        val __obj = js.Dynamic.literal(FakeSelectionObserver = FakeSelectionObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Observers] (val x: Self) extends AnyVal {
        
        inline def setFakeSelectionObserver(value: FakeSelectionObserver): Self = StObject.set(x, "FakeSelectionObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
