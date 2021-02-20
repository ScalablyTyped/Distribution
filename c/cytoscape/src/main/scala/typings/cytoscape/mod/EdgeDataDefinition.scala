package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeDataDefinition
  extends ElementDataDefinition
     with /* key */ StringDictionary[js.Any] {
  
  /**
    * the source node id (edge comes from this node)
    */
  var source: String = js.native
  
  /**
    * the target node id (edge goes to this node)
    */
  var target: String = js.native
}
object EdgeDataDefinition {
  
  @scala.inline
  def apply(source: String, target: String): EdgeDataDefinition = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeDataDefinition]
  }
  
  @scala.inline
  implicit class EdgeDataDefinitionMutableBuilder[Self <: EdgeDataDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
