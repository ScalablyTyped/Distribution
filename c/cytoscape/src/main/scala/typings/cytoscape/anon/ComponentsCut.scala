package typings.cytoscape.anon

import typings.cytoscape.mod.CollectionReturnValue
import typings.cytoscape.mod.EdgeCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentsCut extends StObject {
  
  var components: CollectionReturnValue
  
  var cut: EdgeCollection
}
object ComponentsCut {
  
  inline def apply(components: CollectionReturnValue, cut: EdgeCollection): ComponentsCut = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentsCut]
  }
  
  extension [Self <: ComponentsCut](x: Self) {
    
    inline def setComponents(value: CollectionReturnValue): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setCut(value: EdgeCollection): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
  }
}
