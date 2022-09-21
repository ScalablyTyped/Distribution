package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.arrowkeysobserverMod.ArrowKeysObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/selectionobserver", JSImport.Default)
  @js.native
  open class default () extends SelectionObserver
  
  @js.native
  trait SelectionObserver
    extends typings.ckeditorCkeditor5Engine.observerMod.default[
          /* Couldn't translate: 'key not found: IArray(TsIdentLibraryScoped(ckeditor,ckeditor5-engine), TsIdentModule(Some(ckeditor),List(ckeditor5-engine, src, view, view)))' */ Any
        ] {
    
    /**
      * Reference to the {@link module:engine/view/view~View#domConverter}.
      */
    val domConverter: typings.ckeditorCkeditor5Engine.domconverterMod.default = js.native
    
    /**
      * Instance of the mutation observer. Selection observer calls
      * {@link module:engine/view/observer/mutationobserver~MutationObserver#flush} to ensure that the mutations will be handled
      * before the {@link module:engine/view/document~Document#event:selectionChange} event is fired.
      */
    val mutationObserver: typings.ckeditorCkeditor5Engine.mutationobserverMod.default = js.native
    
    /**
      * Reference to the view {@link module:engine/view/documentselection~DocumentSelection} object used to compare
      * new selection with it.
      */
    val selection: typings.ckeditorCkeditor5Engine.viewDocumentselectionMod.default = js.native
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
