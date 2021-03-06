package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.AtKeyword
import typings.cssTree.cssTreeStrings.Comma
import typings.cssTree.cssTreeStrings.Function
import typings.cssTree.cssTreeStrings.Group
import typings.cssTree.cssTreeStrings.Keyword
import typings.cssTree.cssTreeStrings.Multiplier
import typings.cssTree.cssTreeStrings.Property
import typings.cssTree.cssTreeStrings.Token
import typings.cssTree.cssTreeStrings.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def DSNodeAtWord(name: String, `type`: AtKeyword): typings.cssTree.mod.DSNodeAtWord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeAtWord]
  }
  
  @scala.inline
  def DSNodeComma(`type`: Comma): typings.cssTree.mod.DSNodeComma = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeComma]
  }
  
  @scala.inline
  def DSNodeFunction(name: String, `type`: Function): typings.cssTree.mod.DSNodeFunction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeFunction]
  }
  
  @scala.inline
  def DSNodeGroup(
    combinator: DSNodeCombinator,
    disallowEmpty: Boolean,
    explicit: Boolean,
    terms: js.Array[DSNode],
    `type`: Group
  ): typings.cssTree.mod.DSNodeGroup = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], disallowEmpty = disallowEmpty.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeGroup]
  }
  
  @scala.inline
  def DSNodeKeyword(name: String, `type`: Keyword): typings.cssTree.mod.DSNodeKeyword = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeKeyword]
  }
  
  @scala.inline
  def DSNodeMultiplier(comma: Boolean, max: Double, min: Double, term: DSNodeMultiplied, `type`: Multiplier): typings.cssTree.mod.DSNodeMultiplier = {
    val __obj = js.Dynamic.literal(comma = comma.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeMultiplier]
  }
  
  @scala.inline
  def DSNodeProperty(name: String, `type`: Property): typings.cssTree.mod.DSNodeProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeProperty]
  }
  
  @scala.inline
  def DSNodeString(`type`: typings.cssTree.cssTreeStrings.String, value: String): typings.cssTree.mod.DSNodeString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeString]
  }
  
  @scala.inline
  def DSNodeToken(`type`: Token, value: String): typings.cssTree.mod.DSNodeToken = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeToken]
  }
  
  @scala.inline
  def DSNodeType(name: String, `type`: Type): typings.cssTree.mod.DSNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeType]
  }
}
