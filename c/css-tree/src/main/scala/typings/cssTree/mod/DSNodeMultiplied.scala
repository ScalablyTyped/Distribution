package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cssTree.mod.DSNodeFunction
  - typings.cssTree.mod.DSNodeGroup
  - typings.cssTree.mod.DSNodeKeyword
  - typings.cssTree.mod.DSNodeProperty
  - typings.cssTree.mod.DSNodeString
  - typings.cssTree.mod.DSNodeType
*/
trait DSNodeMultiplied extends StObject
object DSNodeMultiplied {
  
  inline def DSNodeFunction(name: String): typings.cssTree.mod.DSNodeFunction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Function")
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeFunction]
  }
  
  inline def DSNodeGroup(combinator: DSNodeCombinator, disallowEmpty: Boolean, explicit: Boolean, terms: js.Array[DSNode]): typings.cssTree.mod.DSNodeGroup = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], disallowEmpty = disallowEmpty.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeGroup]
  }
  
  inline def DSNodeKeyword(name: String): typings.cssTree.mod.DSNodeKeyword = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Keyword")
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeKeyword]
  }
  
  inline def DSNodeProperty(name: String): typings.cssTree.mod.DSNodeProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Property")
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeProperty]
  }
  
  inline def DSNodeString(value: String): typings.cssTree.mod.DSNodeString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("String")
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeString]
  }
  
  inline def DSNodeType(name: String): typings.cssTree.mod.DSNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], opts = null)
    __obj.updateDynamic("type")("Type")
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeType]
  }
}
