package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeSelector
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var flags: String | Null
  
  var matcher: String | Null
  
  var name: Identifier
  
  @JSName("type")
  var type_AttributeSelector: typings.cssTree.cssTreeStrings.AttributeSelector
  
  var value: StringNode | Identifier | Null
}
object AttributeSelector {
  
  inline def apply(name: Identifier): AttributeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], flags = null, matcher = null, value = null)
    __obj.updateDynamic("type")("AttributeSelector")
    __obj.asInstanceOf[AttributeSelector]
  }
  
  extension [Self <: AttributeSelector](x: Self) {
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsNull: Self = StObject.set(x, "flags", null)
    
    inline def setMatcher(value: String): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    inline def setMatcherNull: Self = StObject.set(x, "matcher", null)
    
    inline def setName(value: Identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.cssTree.cssTreeStrings.AttributeSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StringNode | Identifier): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
