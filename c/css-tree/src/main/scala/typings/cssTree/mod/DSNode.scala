package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cssTree.mod.DSNodeAtWord
  - typings.cssTree.mod.DSNodeComma
  - typings.cssTree.mod.DSNodeFunction
  - typings.cssTree.mod.DSNodeGroup
  - typings.cssTree.mod.DSNodeKeyword
  - typings.cssTree.mod.DSNodeMultiplier
  - typings.cssTree.mod.DSNodeProperty
  - typings.cssTree.mod.DSNodeString
  - typings.cssTree.mod.DSNodeToken
  - typings.cssTree.mod.DSNodeType
*/
trait DSNode extends StObject
object DSNode {
  
  inline def DSNodeAtWord(name: String): typings.cssTree.mod.DSNodeAtWord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AtKeyword")
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeAtWord]
  }
  
  inline def DSNodeComma(): typings.cssTree.mod.DSNodeComma = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Comma")
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeComma]
  }
  
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
  
  inline def DSNodeMultiplier(comma: Boolean, max: Double, min: Double, term: DSNodeMultiplied): typings.cssTree.mod.DSNodeMultiplier = {
    val __obj = js.Dynamic.literal(comma = comma.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Multiplier")
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeMultiplier]
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
  
  inline def DSNodeToken(value: String): typings.cssTree.mod.DSNodeToken = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Token")
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeToken]
  }
  
  inline def DSNodeType(name: String): typings.cssTree.mod.DSNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], opts = null)
    __obj.updateDynamic("type")("Type")
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeType]
  }
}
