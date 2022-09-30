package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPago_Pago
import typings.countriesAndTimezones.countriesAndTimezonesStrings.WS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `407` extends StObject {
  
  var a: PacificSlashPago_Pago
  
  var c: js.Array[WS]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `407` {
  
  inline def apply(c: js.Array[WS]): `407` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Pago_Pago", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`407`]
  }
  
  extension [Self <: `407`](x: Self) {
    
    inline def setA(value: PacificSlashPago_Pago): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[WS]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: WS*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
