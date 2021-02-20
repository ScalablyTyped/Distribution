package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var name: String = js.native
  
  @JSName("type")
  var type_TypeSelector: typings.cssTree.cssTreeStrings.TypeSelector = js.native
}
object TypeSelector {
  
  @scala.inline
  def apply(name: String, `type`: typings.cssTree.cssTreeStrings.TypeSelector): TypeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
