package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.arrowkeysobserverMod.ArrowKeysObserver
import typings.std.ClipboardEvent
import typings.std.Record
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domeventobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/domeventobserver", JSImport.Default)
  @js.native
  abstract class default () extends DomEventObserver
  
  @js.native
  trait DomEventObserver
    extends typings.ckeditorCkeditor5Engine.observerMod.default[
          /* Couldn't translate: 'key not found: IArray(TsIdentLibraryScoped(ckeditor,ckeditor5-engine), TsIdentModule(Some(ckeditor),List(ckeditor5-engine, src, view, view)))' */ Any
        ] {
    
    /**
      * Type of the DOM event the observer should listen to. Array of types can be defined
      * if the observer should listen to multiple DOM events.
      */
    /* protected */ val domEventType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ Any = js.native
    
    /**
      * Calls `Document#fire()` if observer {@link #isEnabled is enabled}.
      */
    def fire[E /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ Any */, D /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[E] */ js.Any */, K /* <: /* keyof D */ String */](eventType: E, domEvent: D): Unit = js.native
    def fire[E /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ Any */, D /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[E] */ js.Any */, K /* <: /* keyof D */ String */](
      eventType: E,
      domEvent: D,
      additionalData: Record[
          K, 
          /* import warning: importer.ImportType#apply Failed type conversion: D[K] */ js.Any
        ]
    ): Unit = js.native
    
    def onDomEvent(event: ClipboardEvent): Unit = js.native
    /**
      * Callback which should be called when the DOM event occurred. Note that the callback will not be called if
      * observer {@link #isEnabled is not enabled}.
      */
    def onDomEvent(event: UIEvent): Unit = js.native
    
    /**
      * If set to `true` DOM events will be listened on the capturing phase.
      * Default value is `false`.
      */
    /* protected */ def useCapture_=(value: Boolean): Unit = js.native
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
