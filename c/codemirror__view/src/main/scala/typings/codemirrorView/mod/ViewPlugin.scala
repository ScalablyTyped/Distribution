package typings.codemirrorView.mod

import typings.codemirrorState.mod.Extension
import typings.codemirrorView.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
View plugins associate stateful values with a view. They can
influence the way the content is drawn, and are notified of things
that happen in the view.
*/
@JSImport("@codemirror/view", "ViewPlugin")
@js.native
/* private */ open class ViewPlugin[V /* <: PluginValue */] () extends StObject {
  
  /**
    Instances of this class act as extensions.
    */
  var `extension`: Extension = js.native
}
object ViewPlugin {
  
  @JSImport("@codemirror/view", "ViewPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    Define a plugin from a constructor function that creates the
    plugin's value, given an editor view.
    */
  /* static member */
  inline def define[V /* <: PluginValue */](create: js.Function1[/* view */ EditorView, V]): ViewPlugin[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(create.asInstanceOf[js.Any]).asInstanceOf[ViewPlugin[V]]
  inline def define[V /* <: PluginValue */](create: js.Function1[/* view */ EditorView, V], spec: PluginSpec[V]): ViewPlugin[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(create.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[ViewPlugin[V]]
  
  /**
    Create a plugin for a class whose constructor takes a single
    editor view as argument.
    */
  /* static member */
  inline def fromClass[V /* <: PluginValue */](cls: Instantiable[V]): ViewPlugin[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromClass")(cls.asInstanceOf[js.Any]).asInstanceOf[ViewPlugin[V]]
  inline def fromClass[V /* <: PluginValue */](cls: Instantiable[V], spec: PluginSpec[V]): ViewPlugin[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromClass")(cls.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[ViewPlugin[V]]
}
