package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.AtKeyword
import typings.cssTree.cssTreeStrings.Comma
import typings.cssTree.cssTreeStrings.Function
import typings.cssTree.cssTreeStrings.Group
import typings.cssTree.cssTreeStrings.Keyword
import typings.cssTree.cssTreeStrings.Multiplier
import typings.cssTree.cssTreeStrings.Property
import typings.cssTree.cssTreeStrings.String
import typings.cssTree.cssTreeStrings.Token
import typings.cssTree.cssTreeStrings.Type
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
trait DSNode extends js.Object
object DSNode {
  
  @scala.inline
  def DSNodeComma(`type`: Comma): DSNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeString(`type`: String, value: java.lang.String): DSNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeProperty(name: java.lang.String, `type`: Property): DSNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeAtWord(name: java.lang.String, `type`: AtKeyword): DSNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeKeyword(name: java.lang.String, `type`: Keyword): DSNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeMultiplier(comma: Boolean, max: Double, min: Double, term: DSNodeMultiplied, `type`: Multiplier): DSNode = {
    val __obj = js.Dynamic.literal(comma = comma.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeType(name: java.lang.String, `type`: Type): DSNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeGroup(
    combinator: DSNodeCombinator,
    disallowEmpty: Boolean,
    explicit: Boolean,
    terms: js.Array[DSNode],
    `type`: Group
  ): DSNode = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], disallowEmpty = disallowEmpty.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeFunction(name: java.lang.String, `type`: Function): DSNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
  
  @scala.inline
  def DSNodeToken(`type`: Token, value: java.lang.String): DSNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNode]
  }
}
