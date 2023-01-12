package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StylesheetStyle
  extends StObject
     with Stylesheet {
  
  var selector: String
  
  var style: Node | Edge | typings.cytoscape.mod.Css.Core
}
object StylesheetStyle {
  
  inline def apply(selector: String, style: Node | Edge | typings.cytoscape.mod.Css.Core): StylesheetStyle = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesheetStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StylesheetStyle] (val x: Self) extends AnyVal {
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Node | Edge | typings.cytoscape.mod.Css.Core): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
