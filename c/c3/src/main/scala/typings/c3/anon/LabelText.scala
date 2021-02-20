package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelText extends StObject {
  
  var label: Text = js.native
}
object LabelText {
  
  @scala.inline
  def apply(label: Text): LabelText = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelText]
  }
  
  @scala.inline
  implicit class LabelTextMutableBuilder[Self <: LabelText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Text): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
