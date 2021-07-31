package typings.babelTypes.ts36Mod

import typings.babelTypes.anon.Raw
import typings.babelTypes.babelTypesStrings.TemplateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateElement_
  extends StObject
     with Node {
  
  var tail: Boolean
  
  @JSName("type")
  var type_TemplateElement_ : TemplateElement
  
  var value: Raw
}
object TemplateElement_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, tail: Boolean, value: Raw): TemplateElement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
    def setValue(value: Raw): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
