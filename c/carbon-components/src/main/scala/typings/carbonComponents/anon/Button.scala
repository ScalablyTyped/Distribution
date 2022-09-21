package typings.carbonComponents.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  var button: typings.std.Element
  
  var element: HTMLElement
}
object Button {
  
  inline def apply(button: typings.std.Element, element: HTMLElement): Button = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  extension [Self <: Button](x: Self) {
    
    inline def setButton(value: typings.std.Element): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
