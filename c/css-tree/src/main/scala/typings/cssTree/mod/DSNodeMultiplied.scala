package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Function
import typings.cssTree.cssTreeStrings.Group
import typings.cssTree.cssTreeStrings.Keyword
import typings.cssTree.cssTreeStrings.Property
import typings.cssTree.cssTreeStrings.Type
import org.scalablytyped.runtime.StObject
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
trait DSNodeMultiplied extends StObject
object DSNodeMultiplied {
  
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
  def DSNodeType(name: String, `type`: Type): typings.cssTree.mod.DSNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.DSNodeType]
  }
}
