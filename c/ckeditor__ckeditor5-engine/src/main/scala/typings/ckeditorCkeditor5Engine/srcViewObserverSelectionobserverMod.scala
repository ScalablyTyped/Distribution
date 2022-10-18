package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.srcViewViewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverSelectionobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/selectionobserver", JSImport.Default)
  @js.native
  open class default () extends SelectionObserver
  
  @js.native
  trait SelectionObserver
    extends typings.ckeditorCkeditor5Engine.srcViewObserverObserverMod.default[View] {
    
    /**
      * Reference to the {@link module:engine/view/view~View#domConverter}.
      */
    val domConverter: typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.default = js.native
    
    /**
      * Instance of the mutation observer. Selection observer calls
      * {@link module:engine/view/observer/mutationobserver~MutationObserver#flush} to ensure that the mutations will be handled
      * before the {@link module:engine/view/document~Document#event:selectionChange} event is fired.
      */
    val mutationObserver: typings.ckeditorCkeditor5Engine.srcViewObserverMutationobserverMod.default = js.native
    
    /**
      * Reference to the view {@link module:engine/view/documentselection~DocumentSelection} object used to compare
      * new selection with it.
      */
    val selection: typings.ckeditorCkeditor5Engine.srcViewDocumentselectionMod.default = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var SelectionObserver: typings.ckeditorCkeditor5Engine.srcViewObserverSelectionobserverMod.SelectionObserver
    }
    object Observers {
      
      inline def apply(SelectionObserver: SelectionObserver): Observers = {
        val __obj = js.Dynamic.literal(SelectionObserver = SelectionObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      extension [Self <: Observers](x: Self) {
        
        inline def setSelectionObserver(value: SelectionObserver): Self = StObject.set(x, "SelectionObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
