package typings.cssWhat.typesMod

import typings.cssWhat.typesMod.SelectorType.Attribute
import typings.cssWhat.typesMod.SelectorType.Pseudo
import typings.cssWhat.typesMod.SelectorType.Tag
import typings.cssWhat.typesMod.SelectorType.Universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cssWhat.typesMod.PseudoSelector
  - typings.cssWhat.typesMod.PseudoElement
  - typings.cssWhat.typesMod.AttributeSelector
  - typings.cssWhat.typesMod.TagSelector
  - typings.cssWhat.typesMod.UniversalSelector
  - typings.cssWhat.typesMod.Traversal
*/
trait Selector extends StObject
object Selector {
  
  inline def AttributeSelector(action: AttributeAction, name: String, `type`: Attribute, value: String): typings.cssWhat.typesMod.AttributeSelector = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], ignoreCase = null, namespace = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssWhat.typesMod.AttributeSelector]
  }
  
  inline def PseudoElement(name: String, `type`: typings.cssWhat.typesMod.SelectorType.PseudoElement): typings.cssWhat.typesMod.PseudoElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], data = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssWhat.typesMod.PseudoElement]
  }
  
  inline def PseudoSelector(name: String, `type`: Pseudo): typings.cssWhat.typesMod.PseudoSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], data = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssWhat.typesMod.PseudoSelector]
  }
  
  inline def TagSelector(name: String, `type`: Tag): typings.cssWhat.typesMod.TagSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssWhat.typesMod.TagSelector]
  }
  
  inline def Traversal(`type`: TraversalType): typings.cssWhat.typesMod.Traversal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssWhat.typesMod.Traversal]
  }
  
  inline def UniversalSelector(`type`: Universal): typings.cssWhat.typesMod.UniversalSelector = {
    val __obj = js.Dynamic.literal(namespace = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssWhat.typesMod.UniversalSelector]
  }
}
