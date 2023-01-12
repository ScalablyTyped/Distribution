package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get the entry point to modify the visual style of the graph after initialisation.
  * http://js.cytoscape.org/#core/style
  */
trait ElementStylesheetStyle
  extends StObject
     with StylesheetStyle {
  
  def json(): Any
}
object ElementStylesheetStyle {
  
  inline def apply(json: () => Any, selector: String, style: Node | Edge | typings.cytoscape.mod.Css.Core): ElementStylesheetStyle = {
    val __obj = js.Dynamic.literal(json = js.Any.fromFunction0(json), selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStylesheetStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementStylesheetStyle] (val x: Self) extends AnyVal {
    
    inline def setJson(value: () => Any): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
  }
}
