package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeDataDefinition
  extends StObject
     with ElementDataDefinition
     with /* key */ StringDictionary[js.Any] {
  
  /**
    * the source node id (edge comes from this node)
    */
  var source: String
  
  /**
    * the target node id (edge goes to this node)
    */
  var target: String
}
object EdgeDataDefinition {
  
  inline def apply(source: String, target: String): EdgeDataDefinition = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeDataDefinition]
  }
  
  extension [Self <: EdgeDataDefinition](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
