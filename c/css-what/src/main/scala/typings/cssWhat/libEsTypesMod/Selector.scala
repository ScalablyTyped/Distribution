package typings.cssWhat.libEsTypesMod

import typings.cssWhat.libEsTypesMod.SelectorType.Attribute
import typings.cssWhat.libEsTypesMod.SelectorType.Pseudo
import typings.cssWhat.libEsTypesMod.SelectorType.Tag
import typings.cssWhat.libEsTypesMod.SelectorType.Universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cssWhat.libEsTypesMod.PseudoSelector
  - typings.cssWhat.libEsTypesMod.PseudoElement
  - typings.cssWhat.libEsTypesMod.AttributeSelector
  - typings.cssWhat.libEsTypesMod.TagSelector
  - typings.cssWhat.libEsTypesMod.UniversalSelector
  - typings.cssWhat.libEsTypesMod.Traversal
*/
trait Selector extends StObject
object Selector {
  
  inline def AttributeSelector(action: AttributeAction, name: String, `type`: Attribute, value: String): typings.cssWhat.libEsTypesMod.AttributeSelector = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], ignoreCase = null, namespace = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssWhat.libEsTypesMod.AttributeSelector]
  }
  
  inline def PseudoElement(name: String, `type`: typings.cssWhat.libEsTypesMod.SelectorType.PseudoElement): typings.cssWhat.libEsTypesMod.PseudoElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], data = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssWhat.libEsTypesMod.PseudoElement]
  }
  
  inline def PseudoSelector(name: String, `type`: Pseudo): typings.cssWhat.libEsTypesMod.PseudoSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], data = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssWhat.libEsTypesMod.PseudoSelector]
  }
  
  inline def TagSelector(name: String, `type`: Tag): typings.cssWhat.libEsTypesMod.TagSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssWhat.libEsTypesMod.TagSelector]
  }
  
  inline def Traversal(`type`: TraversalType): typings.cssWhat.libEsTypesMod.Traversal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssWhat.libEsTypesMod.Traversal]
  }
  
  inline def UniversalSelector(`type`: Universal): typings.cssWhat.libEsTypesMod.UniversalSelector = {
    val __obj = js.Dynamic.literal(namespace = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssWhat.libEsTypesMod.UniversalSelector]
  }
}
