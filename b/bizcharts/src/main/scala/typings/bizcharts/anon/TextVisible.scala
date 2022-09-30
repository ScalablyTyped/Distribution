package typings.bizcharts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextVisible extends StObject {
  
  var text: Unit
  
  var visible: Boolean
}
object TextVisible {
  
  inline def apply(text: Unit, visible: Boolean): TextVisible = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextVisible]
  }
  
  extension [Self <: TextVisible](x: Self) {
    
    inline def setText(value: Unit): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
