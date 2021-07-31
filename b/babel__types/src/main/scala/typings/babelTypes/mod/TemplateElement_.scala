package typings.babelTypes.mod

import typings.babelTypes.anon.Cooked
import typings.babelTypes.babelTypesStrings.TemplateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateElement_
  extends StObject
     with BaseNode
     with _Node {
  
  var tail: Boolean
  
  @JSName("type")
  var type_TemplateElement_ : TemplateElement
  
  var value: Cooked
}
object TemplateElement_ {
  
  @scala.inline
  def apply(tail: Boolean, value: Cooked): TemplateElement_ = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TemplateElement")
    __obj.asInstanceOf[TemplateElement_]
  }
  
  @scala.inline
  implicit class TemplateElement_MutableBuilder[Self <: TemplateElement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTail(value: Boolean): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TemplateElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Cooked): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
