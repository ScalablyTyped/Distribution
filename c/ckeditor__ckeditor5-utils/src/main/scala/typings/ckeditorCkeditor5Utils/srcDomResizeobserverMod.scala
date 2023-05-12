package typings.ckeditorCkeditor5Utils

import typings.std.Element
import typings.std.ResizeObserverEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDomResizeobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/dom/resizeobserver", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ResizeObserver {
    /**
      * Creates an instance of the `ResizeObserver` class.
      *
      * @param element A DOM element that is to be observed for resizing. Note that
      * the element must be visible (i.e. not detached from DOM) for the observer to work.
      * @param callback A function called when the observed element was resized. It passes
      * the [`ResizeObserverEntry`](https://developer.mozilla.org/en-US/docs/Web/API/ResizeObserverEntry)
      * object with information about the resize event.
      */
    def this(element: Element, callback: js.Function1[/* entry */ ResizeObserverEntry, Unit]) = this()
    
    /**
      * The callback executed each time {@link #_element} is resized.
      */
    /* private */ /* CompleteClass */
    override val _callback: Any = js.native
    
    /**
      * The element observed by this observer.
      */
    /* private */ /* CompleteClass */
    override val _element: Any = js.native
    
    /**
      * Destroys the observer which disables the `callback` passed to the {@link #constructor}.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-utils/src/dom/resizeobserver", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Registers a new resize callback for the DOM element.
      */
    @JSImport("@ckeditor/ckeditor5-utils/src/dom/resizeobserver", "default._addElementCallback")
    @js.native
    def _addElementCallback: Any = js.native
    inline def _addElementCallback_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_addElementCallback")(x.asInstanceOf[js.Any])
    
    /**
      * Creates the single native observer shared across all `ResizeObserver` instances.
      */
    @JSImport("@ckeditor/ckeditor5-utils/src/dom/resizeobserver", "default._createObserver")
    @js.native
    def _createObserver: Any = js.native
    inline def _createObserver_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_createObserver")(x.asInstanceOf[js.Any])
    
    /**
      * Removes a resize callback from the DOM element. If no callbacks are left
      * for the element, it removes the element from the native observer.
      */
    @JSImport("@ckeditor/ckeditor5-utils/src/dom/resizeobserver", "default._deleteElementCallback")
    @js.native
    def _deleteElementCallback: Any = js.native
    inline def _deleteElementCallback_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_deleteElementCallback")(x.asInstanceOf[js.Any])
    
    /**
      * A mapping of native DOM elements and their callbacks shared across all
      * {@link module:utils/dom/resizeobserver~ResizeObserver} instances.
      */
    @JSImport("@ckeditor/ckeditor5-utils/src/dom/resizeobserver", "default._elementCallbacks")
    @js.native
    def _elementCallbacks: Any = js.native
    inline def _elementCallbacks_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_elementCallbacks")(x.asInstanceOf[js.Any])
    
    /**
      * Returns are registered resize callbacks for the DOM element.
      */
    @JSImport("@ckeditor/ckeditor5-utils/src/dom/resizeobserver", "default._getElementCallbacks")
    @js.native
    def _getElementCallbacks: Any = js.native
    inline def _getElementCallbacks_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getElementCallbacks")(x.asInstanceOf[js.Any])
    
    /**
      * The single native observer instance shared across all {@link module:utils/dom/resizeobserver~ResizeObserver} instances.
      */
    @JSImport("@ckeditor/ckeditor5-utils/src/dom/resizeobserver", "default._observerInstance")
    @js.native
    def _observerInstance: Any = js.native
    inline def _observerInstance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_observerInstance")(x.asInstanceOf[js.Any])
  }
  
  trait ResizeObserver extends StObject {
    
    /**
      * The callback executed each time {@link #_element} is resized.
      */
    /* private */ val _callback: Any
    
    /**
      * The element observed by this observer.
      */
    /* private */ val _element: Any
    
    /**
      * Destroys the observer which disables the `callback` passed to the {@link #constructor}.
      */
    def destroy(): Unit
  }
  object ResizeObserver {
    
    inline def apply(_callback: Any, _element: Any, destroy: () => Unit): ResizeObserver = {
      val __obj = js.Dynamic.literal(_callback = _callback.asInstanceOf[js.Any], _element = _element.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[ResizeObserver]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeObserver] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def set_callback(value: Any): Self = StObject.set(x, "_callback", value.asInstanceOf[js.Any])
      
      inline def set_element(value: Any): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
    }
  }
}
