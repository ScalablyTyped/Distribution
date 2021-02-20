package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAnnotation extends BaseElement {
  
  var text: String = js.native
  
  var textFormat: String = js.native
}
object TextAnnotation {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, id: String, text: String, textFormat: String): TextAnnotation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textFormat = textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAnnotation]
  }
  
  @scala.inline
  implicit class TextAnnotationMutableBuilder[Self <: TextAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormat(value: String): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
  }
}
