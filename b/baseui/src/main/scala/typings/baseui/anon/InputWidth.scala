package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputWidth extends StObject {
  
  var inputWidth: Double
}
object InputWidth {
  
  inline def apply(inputWidth: Double): InputWidth = {
    val __obj = js.Dynamic.literal(inputWidth = inputWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputWidth]
  }
  
  extension [Self <: InputWidth](x: Self) {
    
    inline def setInputWidth(value: Double): Self = StObject.set(x, "inputWidth", value.asInstanceOf[js.Any])
  }
}
