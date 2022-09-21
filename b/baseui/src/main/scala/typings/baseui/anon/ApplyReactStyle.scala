package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyReactStyle extends StObject {
  
  var applyReactStyle: Fn
}
object ApplyReactStyle {
  
  inline def apply(applyReactStyle: Fn): ApplyReactStyle = {
    val __obj = js.Dynamic.literal(applyReactStyle = applyReactStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyReactStyle]
  }
  
  extension [Self <: ApplyReactStyle](x: Self) {
    
    inline def setApplyReactStyle(value: Fn): Self = StObject.set(x, "applyReactStyle", value.asInstanceOf[js.Any])
  }
}
