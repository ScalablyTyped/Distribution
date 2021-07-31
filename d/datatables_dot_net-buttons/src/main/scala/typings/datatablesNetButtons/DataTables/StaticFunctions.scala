package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticFunctions extends StObject {
  
  var Buttons: ButtonStaticFunctions
}
object StaticFunctions {
  
  @scala.inline
  def apply(Buttons: ButtonStaticFunctions): StaticFunctions = {
    val __obj = js.Dynamic.literal(Buttons = Buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticFunctions]
  }
  
  @scala.inline
  implicit class StaticFunctionsMutableBuilder[Self <: StaticFunctions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: ButtonStaticFunctions): Self = StObject.set(x, "Buttons", value.asInstanceOf[js.Any])
  }
}
