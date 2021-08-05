package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticFunctions extends StObject {
  
  var Buttons: ButtonStaticFunctions
}
object StaticFunctions {
  
  inline def apply(Buttons: ButtonStaticFunctions): StaticFunctions = {
    val __obj = js.Dynamic.literal(Buttons = Buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticFunctions]
  }
  
  extension [Self <: StaticFunctions](x: Self) {
    
    inline def setButtons(value: ButtonStaticFunctions): Self = StObject.set(x, "Buttons", value.asInstanceOf[js.Any])
  }
}
