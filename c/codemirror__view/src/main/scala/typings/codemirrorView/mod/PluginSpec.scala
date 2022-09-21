package typings.codemirrorView.mod

import typings.codemirrorState.mod.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Provides additional information when defining a [view
plugin](https://codemirror.net/6/docs/ref/#view.ViewPlugin).
*/
trait PluginSpec[V /* <: PluginValue */] extends StObject {
  
  /**
    Allow the plugin to provide decorations. When given, this should
    be a function that take the plugin value and return a
    [decoration set](https://codemirror.net/6/docs/ref/#view.DecorationSet). See also the caveat about
    [layout-changing decorations](https://codemirror.net/6/docs/ref/#view.EditorView^decorations) that
    depend on the view.
    */
  var decorations: js.UndefOr[js.Function1[/* value */ V, DecorationSet]] = js.undefined
  
  /**
    Register the given [event
    handlers](https://codemirror.net/6/docs/ref/#view.EditorView^domEventHandlers) for the plugin.
    When called, these will have their `this` bound to the plugin
    value.
    */
  var eventHandlers: js.UndefOr[DOMEventHandlers[V]] = js.undefined
  
  /**
    Specify that the plugin provides additional extensions when
    added to an editor configuration.
    */
  var provide: js.UndefOr[js.Function1[/* plugin */ ViewPlugin[V], Extension]] = js.undefined
}
object PluginSpec {
  
  inline def apply[V /* <: PluginValue */](): PluginSpec[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginSpec[V]]
  }
  
  extension [Self <: PluginSpec[?], V /* <: PluginValue */](x: Self & PluginSpec[V]) {
    
    inline def setDecorations(value: /* value */ V => DecorationSet): Self = StObject.set(x, "decorations", js.Any.fromFunction1(value))
    
    inline def setDecorationsUndefined: Self = StObject.set(x, "decorations", js.undefined)
    
    inline def setEventHandlers(value: DOMEventHandlers[V]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    
    inline def setProvide(value: /* plugin */ ViewPlugin[V] => Extension): Self = StObject.set(x, "provide", js.Any.fromFunction1(value))
    
    inline def setProvideUndefined: Self = StObject.set(x, "provide", js.undefined)
  }
}
