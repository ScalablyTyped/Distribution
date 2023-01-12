package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.srcViewViewMod.View
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.Record
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverDomeventdataMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/domeventdata", JSImport.Default)
  @js.native
  open class default[V /* <: View */, K /* <: InputEvent | ClipboardEvent | TransitionEvent | AnimationEvent | CompositionEvent | FormDataEvent | WheelEvent | ErrorEvent | DragEvent | KeyboardEvent | MouseEvent | SubmitEvent | UIEvent | PointerEvent | TouchEvent | FocusEvent | Event | ProgressEvent[EventTarget] | SecurityPolicyViolationEvent */, L /* <: /* keyof K */ String */] protected ()
    extends StObject
       with DomEventData[V, K, L] {
    def this(view: View, domEvent: K) = this()
    def this(
      view: View,
      domEvent: K,
      additionalData: Record[
            L, 
            /* import warning: importer.ImportType#apply Failed type conversion: K[L] */ js.Any
          ]
    ) = this()
    
    /**
      * The instance of the document.
      */
    /* CompleteClass */
    override val document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default = js.native
    
    /**
      * The DOM event.
      */
    /* CompleteClass */
    override val domEvent: K = js.native
    
    /**
      * The DOM target.
      */
    /* CompleteClass */
    override val domTarget: /* import warning: importer.ImportType#apply Failed type conversion: K['target'] */ js.Any = js.native
    
    /**
      * Prevents the native's event default action.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /**
      * Stops native event propagation.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /**
      * The tree view element representing the target.
      */
    /* CompleteClass */
    override val target: typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    
    /**
      * Instance of the view controller.
      */
    /* CompleteClass */
    override val view: V = js.native
  }
  
  trait DomEventData[V /* <: View */, K /* <: InputEvent | ClipboardEvent | TransitionEvent | AnimationEvent | CompositionEvent | FormDataEvent | WheelEvent | ErrorEvent | DragEvent | KeyboardEvent | MouseEvent | SubmitEvent | UIEvent | PointerEvent | TouchEvent | FocusEvent | Event | ProgressEvent[EventTarget] | SecurityPolicyViolationEvent */, L /* <: /* keyof K */ String */] extends StObject {
    
    /**
      * The instance of the document.
      */
    val document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default
    
    /**
      * The DOM event.
      */
    val domEvent: K
    
    /**
      * The DOM target.
      */
    val domTarget: /* import warning: importer.ImportType#apply Failed type conversion: K['target'] */ js.Any
    
    /**
      * Prevents the native's event default action.
      */
    def preventDefault(): Unit
    
    /**
      * Stops native event propagation.
      */
    def stopPropagation(): Unit
    
    /**
      * The tree view element representing the target.
      */
    val target: typings.ckeditorCkeditor5Engine.srcViewElementMod.default
    
    /**
      * Instance of the view controller.
      */
    val view: V
  }
  object DomEventData {
    
    inline def apply[V /* <: View */, K /* <: InputEvent | ClipboardEvent | TransitionEvent | AnimationEvent | CompositionEvent | FormDataEvent | WheelEvent | ErrorEvent | DragEvent | KeyboardEvent | MouseEvent | SubmitEvent | UIEvent | PointerEvent | TouchEvent | FocusEvent | Event | ProgressEvent[EventTarget] | SecurityPolicyViolationEvent */, L /* <: /* keyof K */ String */](
      document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default,
      domEvent: K,
      domTarget: /* import warning: importer.ImportType#apply Failed type conversion: K['target'] */ js.Any,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: typings.ckeditorCkeditor5Engine.srcViewElementMod.default,
      view: V
    ): DomEventData[V, K, L] = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], domEvent = domEvent.asInstanceOf[js.Any], domTarget = domTarget.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEventData[V, K, L]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DomEventData[?, ?, ?], V /* <: View */, K /* <: InputEvent | ClipboardEvent | TransitionEvent | AnimationEvent | CompositionEvent | FormDataEvent | WheelEvent | ErrorEvent | DragEvent | KeyboardEvent | MouseEvent | SubmitEvent | UIEvent | PointerEvent | TouchEvent | FocusEvent | Event | ProgressEvent[EventTarget] | SecurityPolicyViolationEvent */, L /* <: /* keyof K */ String */] (val x: Self & (DomEventData[V, K, L])) extends AnyVal {
      
      inline def setDocument(value: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDomEvent(value: K): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      inline def setDomTarget(value: /* import warning: importer.ImportType#apply Failed type conversion: K['target'] */ js.Any): Self = StObject.set(x, "domTarget", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setView(value: V): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
