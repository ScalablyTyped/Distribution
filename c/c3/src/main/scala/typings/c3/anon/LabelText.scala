package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelText extends StObject {
  
  var label: Text
}
object LabelText {
  
  inline def apply(label: Text): LabelText = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelText]
  }
  
  extension [Self <: LabelText](x: Self) {
    
    inline def setLabel(value: Text): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
