package typings.confirmdialog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var setContentAppend: Any
}
object Window {
  
  inline def apply(setContentAppend: Any): Window = {
    val __obj = js.Dynamic.literal(setContentAppend = setContentAppend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setSetContentAppend(value: Any): Self = StObject.set(x, "setContentAppend", value.asInstanceOf[js.Any])
  }
}
