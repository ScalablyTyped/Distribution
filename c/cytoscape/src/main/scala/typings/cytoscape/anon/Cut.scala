package typings.cytoscape.anon

import typings.cytoscape.mod.CollectionReturnValue
import typings.cytoscape.mod.NodeCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cut extends StObject {
  
  var components: CollectionReturnValue
  
  var cut: NodeCollection
}
object Cut {
  
  inline def apply(components: CollectionReturnValue, cut: NodeCollection): Cut = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cut]
  }
  
  extension [Self <: Cut](x: Self) {
    
    inline def setComponents(value: CollectionReturnValue): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setCut(value: NodeCollection): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
  }
}
