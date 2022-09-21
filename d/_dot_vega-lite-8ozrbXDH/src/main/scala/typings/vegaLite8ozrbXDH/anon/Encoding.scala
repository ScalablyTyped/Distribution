package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.color
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.fill
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.fillOpacity
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.opacity
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.shape
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.size
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stroke
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.strokeOpacity
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.strokeWidth
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.text
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoding extends StObject {
  
  var encoding: fill | color | fillOpacity | opacity | stroke | strokeOpacity | strokeWidth | text | size | x | y | shape
  
  var order: Unit
}
object Encoding {
  
  inline def apply(
    encoding: fill | color | fillOpacity | opacity | stroke | strokeOpacity | strokeWidth | text | size | x | y | shape,
    order: Unit
  ): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  extension [Self <: Encoding](x: Self) {
    
    inline def setEncoding(
      value: fill | color | fillOpacity | opacity | stroke | strokeOpacity | strokeWidth | text | size | typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x | y | shape
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Unit): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
