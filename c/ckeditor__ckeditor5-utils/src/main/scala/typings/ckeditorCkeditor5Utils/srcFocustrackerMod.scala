package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.Instantiable1
import typings.ckeditorCkeditor5Utils.anon.InstantiableObservable
import typings.ckeditorCkeditor5Utils.srcDomEmittermixinMod.DomEmitter
import typings.std.ConstructorParameters
import typings.std.Element
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFocustrackerMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/focustracker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FocusTracker
  
  /* Inlined parent @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/mix.Mixed<{new (): @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/observablemixin.Observable,   prototype :@ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/observablemixin.Observable}, @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/dom/emittermixin.DomEmitter> */
  @js.native
  trait FocusTracker
    extends StObject
       with Instantiable1[
          /* args */ ConstructorParameters[InstantiableObservable], 
          InstanceType[InstantiableObservable] & DomEmitter
        ] {
    
    /**
      * Clears currently focused element and set {@link #isFocused} as `false`.
      * This method uses `setTimeout` to change order of fires `blur` and `focus` events.
      */
    /* private */ var _blur: Any = js.native
    
    /**
      * List of registered elements.
      */
    /* private */ var _elements: Any = js.native
    
    /**
      * Stores currently focused element and set {@link #isFocused} as `true`.
      */
    /* private */ var _focus: Any = js.native
    
    /**
      * Event loop timeout.
      */
    /* private */ var _nextEventLoopTimeout: Any = js.native
    
    /**
      * Starts tracking the specified element.
      */
    def add(element: Element): Unit = js.native
    
    /**
      * Destroys the focus tracker by:
      * - Disabling all event listeners attached to tracked elements.
      * - Removing all tracked elements that were previously added.
      */
    def destroy(): Unit = js.native
    
    /**
      * The currently focused element.
      *
      * While {@link #isFocused `isFocused`} remains `true`, the focus can
      * move between different UI elements. This property tracks those
      * elements and tells which one is currently focused.
      *
      * @readonly
      * @observable
      */
    var focusedElement: Element | Null = js.native
    
    /**
      * True when one of the registered elements is focused.
      *
      * @readonly
      * @observable
      */
    var isFocused: Boolean = js.native
    
    /**
      * Stops tracking the specified element and stops listening on this element.
      */
    def remove(element: Element): Unit = js.native
  }
}
