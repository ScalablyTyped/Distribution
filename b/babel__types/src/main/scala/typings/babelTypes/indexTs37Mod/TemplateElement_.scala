package typings.babelTypes.indexTs37Mod

import typings.babelTypes.anon.Cooked
import typings.babelTypes.babelTypesStrings.TemplateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateElement_
  extends BaseNode
     with _Node {
  
  var tail: Boolean = js.native
  
  @JSName("type")
  var type_TemplateElement_ : TemplateElement = js.native
  
  var value: Cooked = js.native
}
object TemplateElement_ {
  
  @scala.inline
  def apply(tail: Boolean, `type`: TemplateElement, value: Cooked): TemplateElement_ = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
