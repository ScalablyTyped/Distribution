package typings.codemirrorView.mod

import typings.codemirrorState.mod.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
View plugins associate stateful values with a view. They can
influence the way the content is drawn, and are notified of things
that happen in the view.
*/
trait ViewPlugin[V /* <: PluginValue */] extends StObject {
  
  /**
    Instances of this class act as extensions.
    */
  var `extension`: Extension
}
object ViewPlugin {
  
  inline def apply[V /* <: PluginValue */](`extension`: Extension): ViewPlugin[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPlugin[V]]
  }
  
  extension [Self <: ViewPlugin[?], V /* <: PluginValue */](x: Self & ViewPlugin[V]) {
    
    inline def setExtension(value: Extension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionVarargs(value: Any*): Self = StObject.set(x, "extension", js.Array(value*))
  }
}
