package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.srcViewViewMod.View
import typings.std.ClipboardEvent
import typings.std.Record
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverDomeventobserverMod {
  
  /* note: abstract class */ @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/domeventobserver", JSImport.Default)
  @js.native
  open class default () extends DomEventObserver
  
  @js.native
  trait DomEventObserver
    extends typings.ckeditorCkeditor5Engine.srcViewObserverObserverMod.default[View] {
    
    /**
      * Type of the DOM event the observer should listen to. Array of types can be defined
      * if the observer should listen to multiple DOM events.
      */
    /* protected */ val domEventType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102, starting with typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.fullscreenchange, typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.fullscreenerror, typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.copy */ Any = js.native
    
    /**
      * Calls `Document#fire()` if observer {@link #isEnabled is enabled}.
      */
    def fire[E /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101, starting with typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.fullscreenchange, typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.fullscreenerror, typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.copy */ Any */, D /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[E] */ js.Any */, K /* <: /* keyof D */ String */](eventType: E, domEvent: D): Unit = js.native
    def fire[E /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101, starting with typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.fullscreenchange, typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.fullscreenerror, typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.copy */ Any */, D /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[E] */ js.Any */, K /* <: /* keyof D */ String */](
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
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var DomEventObserver: typings.ckeditorCkeditor5Engine.srcViewObserverDomeventobserverMod.DomEventObserver
    }
    object Observers {
      
      inline def apply(DomEventObserver: DomEventObserver): Observers = {
        val __obj = js.Dynamic.literal(DomEventObserver = DomEventObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      extension [Self <: Observers](x: Self) {
        
        inline def setDomEventObserver(value: DomEventObserver): Self = StObject.set(x, "DomEventObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
