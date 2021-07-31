package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeSelector
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var name: String
  
  @JSName("type")
  var type_TypeSelector: typings.cssTree.cssTreeStrings.TypeSelector
}
object TypeSelector {
  
  @scala.inline
  def apply(name: String): TypeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeSelector")
    __obj.asInstanceOf[TypeSelector]
  }
  
  @scala.inline
  implicit class TypeSelectorMutableBuilder[Self <: TypeSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.TypeSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
