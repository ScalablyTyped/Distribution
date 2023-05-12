package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPago_Pago
import typings.countriesAndTimezones.countriesAndTimezonesStrings.UM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `399` extends StObject {
  
  var a: PacificSlashPago_Pago
  
  var c: js.Array[UM]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `399` {
  
  inline def apply(c: js.Array[UM]): `399` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Pago_Pago", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`399`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `399`] (val x: Self) extends AnyVal {
    
    inline def setA(value: PacificSlashPago_Pago): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[UM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: UM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
