package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var flags: String | Null = js.native
  
  var matcher: String | Null = js.native
  
  var name: Identifier = js.native
  
  @JSName("type")
  var type_AttributeSelector: typings.cssTree.cssTreeStrings.AttributeSelector = js.native
  
  var value: StringNode | Identifier | Null = js.native
}
object AttributeSelector {
  
  @scala.inline
  def apply(name: Identifier, `type`: typings.cssTree.cssTreeStrings.AttributeSelector): AttributeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeSelector]
  }
  
  @scala.inline
  implicit class AttributeSelectorMutableBuilder[Self <: AttributeSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsNull: Self = StObject.set(x, "flags", null)
    
    @scala.inline
    def setMatcher(value: String): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatcherNull: Self = StObject.set(x, "matcher", null)
    
    @scala.inline
    def setName(value: Identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.AttributeSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: StringNode | Identifier): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
