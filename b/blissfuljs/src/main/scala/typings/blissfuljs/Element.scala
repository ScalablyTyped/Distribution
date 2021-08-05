package typings.blissfuljs

import typings.blissfuljs.BlissNS.BlissBindedElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  @JSName("_")
  var _underscore: BlissBindedElement[Element]
}
object Element {
  
  inline def apply(_underscore: BlissBindedElement[Element]): Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def set_underscore(value: BlissBindedElement[Element]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
