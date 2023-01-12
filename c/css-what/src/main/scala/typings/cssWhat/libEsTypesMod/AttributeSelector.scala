package typings.cssWhat.libEsTypesMod

import typings.cssWhat.cssWhatStrings.quirks
import typings.cssWhat.libEsTypesMod.SelectorType.Attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeSelector
  extends StObject
     with Selector {
  
  var action: AttributeAction
  
  var ignoreCase: quirks | Boolean | Null
  
  var name: String
  
  var namespace: String | Null
  
  var `type`: Attribute
  
  var value: String
}
object AttributeSelector {
  
  inline def apply(action: AttributeAction, name: String, `type`: Attribute, value: String): AttributeSelector = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], ignoreCase = null, namespace = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeSelector] (val x: Self) extends AnyVal {
    
    inline def setAction(value: AttributeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCase(value: quirks | Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseNull: Self = StObject.set(x, "ignoreCase", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
    
    inline def setType(value: Attribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
