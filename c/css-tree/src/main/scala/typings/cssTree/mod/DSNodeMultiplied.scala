package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Function
import typings.cssTree.cssTreeStrings.Group
import typings.cssTree.cssTreeStrings.Keyword
import typings.cssTree.cssTreeStrings.Property
import typings.cssTree.cssTreeStrings.String
import typings.cssTree.cssTreeStrings.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cssTree.mod.DSNodeFunction
  - typings.cssTree.mod.DSNodeGroup
  - typings.cssTree.mod.DSNodeKeyword
  - typings.cssTree.mod.DSNodeProperty
  - typings.cssTree.mod.DSNodeString
  - typings.cssTree.mod.DSNodeType
*/
trait DSNodeMultiplied extends js.Object
object DSNodeMultiplied {
  
  @scala.inline
  def DSNodeString(`type`: String, value: java.lang.String): DSNodeMultiplied = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplied]
  }
  
  @scala.inline
  def DSNodeProperty(name: java.lang.String, `type`: Property): DSNodeMultiplied = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplied]
  }
  
  @scala.inline
  def DSNodeKeyword(name: java.lang.String, `type`: Keyword): DSNodeMultiplied = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplied]
  }
  
  @scala.inline
  def DSNodeType(name: java.lang.String, `type`: Type): DSNodeMultiplied = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplied]
  }
  
  @scala.inline
  def DSNodeGroup(
    combinator: DSNodeCombinator,
    disallowEmpty: Boolean,
    explicit: Boolean,
    terms: js.Array[DSNode],
    `type`: Group
  ): DSNodeMultiplied = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], disallowEmpty = disallowEmpty.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplied]
  }
  
  @scala.inline
  def DSNodeFunction(name: java.lang.String, `type`: Function): DSNodeMultiplied = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplied]
  }
}
