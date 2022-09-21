package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementStylesheetCSS
  extends StObject
     with StylesheetCSS {
  
  def json(): Any
}
object ElementStylesheetCSS {
  
  inline def apply(css: Node | Edge | typings.cytoscape.mod.Css.Core, json: () => Any, selector: String): ElementStylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStylesheetCSS]
  }
  
  extension [Self <: ElementStylesheetCSS](x: Self) {
    
    inline def setJson(value: () => Any): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
  }
}
