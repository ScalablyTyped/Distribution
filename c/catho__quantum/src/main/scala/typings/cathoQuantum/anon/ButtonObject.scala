package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonObject extends StObject {
  
  var button: js.Object
}
object ButtonObject {
  
  inline def apply(button: js.Object): ButtonObject = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonObject]
  }
  
  extension [Self <: ButtonObject](x: Self) {
    
    inline def setButton(value: js.Object): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
  }
}
