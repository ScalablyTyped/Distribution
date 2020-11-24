package typings.cssWhat.parseMod

import typings.cssWhat.cssWhatStrings.`pseudo-element`
import typings.cssWhat.cssWhatStrings.attribute
import typings.cssWhat.cssWhatStrings.pseudo
import typings.cssWhat.cssWhatStrings.tag
import typings.cssWhat.cssWhatStrings.universal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cssWhat.parseMod.PseudoSelector
  - typings.cssWhat.parseMod.PseudoElement
  - typings.cssWhat.parseMod.AttributeSelector
  - typings.cssWhat.parseMod.TagSelector
  - typings.cssWhat.parseMod.UniversalSelector
  - typings.cssWhat.parseMod.Traversal
*/
trait Selector extends js.Object
object Selector {
  
  @scala.inline
  def AttributeSelector(action: AttributeAction, ignoreCase: Boolean, name: String, `type`: attribute, value: String): Selector = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def PseudoSelector(name: String, `type`: pseudo): Selector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def TagSelector(name: String, `type`: tag): Selector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def Traversal(`type`: TraversalType): Selector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def UniversalSelector(`type`: universal): Selector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def PseudoElement(name: String, `type`: `pseudo-element`): Selector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
}
