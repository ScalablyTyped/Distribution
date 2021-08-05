package typings.cytoscape.mod

import typings.cytoscape.anon.Weight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortableNode extends StObject {
  
  var data: Weight
}
object SortableNode {
  
  inline def apply(data: Weight): SortableNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableNode]
  }
  
  extension [Self <: SortableNode](x: Self) {
    
    inline def setData(value: Weight): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
