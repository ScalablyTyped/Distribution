package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get the entry point to modify the visual style of the graph after initialisation.
  * http://js.cytoscape.org/#core/style
  */
@js.native
trait ElementStylesheetStyle extends StylesheetStyle {
  
  def json(): js.Any = js.native
}
object ElementStylesheetStyle {
  
  @scala.inline
  def apply(json: () => js.Any, selector: String, style: Node | Edge | typings.cytoscape.mod.Css.Core): ElementStylesheetStyle = {
    val __obj = js.Dynamic.literal(json = js.Any.fromFunction0(json), selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStylesheetStyle]
  }
  
  @scala.inline
  implicit class ElementStylesheetStyleMutableBuilder[Self <: ElementStylesheetStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJson(value: () => js.Any): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
  }
}
