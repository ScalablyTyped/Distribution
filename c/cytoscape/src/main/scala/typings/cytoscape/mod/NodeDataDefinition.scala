package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeDataDefinition
  extends StObject
     with ElementDataDefinition
     with /* key */ StringDictionary[Any] {
  
  var parent: js.UndefOr[String] = js.undefined
}
object NodeDataDefinition {
  
  inline def apply(): NodeDataDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDataDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeDataDefinition] (val x: Self) extends AnyVal {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
