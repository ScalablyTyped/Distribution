package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#cy.style
  */
trait StylesheetCSS
  extends StObject
     with Stylesheet {
  
  var css: Node | Edge | typings.cytoscape.mod.Css.Core
  
  var selector: String
}
object StylesheetCSS {
  
  inline def apply(css: Node | Edge | typings.cytoscape.mod.Css.Core, selector: String): StylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesheetCSS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StylesheetCSS] (val x: Self) extends AnyVal {
    
    inline def setCss(value: Node | Edge | typings.cytoscape.mod.Css.Core): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
