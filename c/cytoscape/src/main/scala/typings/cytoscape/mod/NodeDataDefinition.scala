package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeDataDefinition
  extends ElementDataDefinition
     with /* key */ StringDictionary[js.Any] {
  
  var parent: js.UndefOr[String] = js.native
}
object NodeDataDefinition {
  
  @scala.inline
  def apply(): NodeDataDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDataDefinition]
  }
  
  @scala.inline
  implicit class NodeDataDefinitionMutableBuilder[Self <: NodeDataDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
