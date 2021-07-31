package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassSelector
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var name: String
  
  @JSName("type")
  var type_ClassSelector: typings.cssTree.cssTreeStrings.ClassSelector
}
object ClassSelector {
  
  @scala.inline
  def apply(name: String): ClassSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassSelector")
    __obj.asInstanceOf[ClassSelector]
  }
  
  @scala.inline
  implicit class ClassSelectorMutableBuilder[Self <: ClassSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.ClassSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
