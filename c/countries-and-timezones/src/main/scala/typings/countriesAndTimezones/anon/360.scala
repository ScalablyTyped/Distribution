package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashNairobi
import typings.countriesAndTimezones.countriesAndTimezonesStrings.YT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `360` extends StObject {
  
  var a: AfricaSlashNairobi
  
  var c: js.Array[YT]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `360` {
  
  inline def apply(c: js.Array[YT]): `360` = {
    val __obj = js.Dynamic.literal(a = "Africa/Nairobi", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`360`]
  }
  
  extension [Self <: `360`](x: Self) {
    
    inline def setA(value: AfricaSlashNairobi): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[YT]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: YT*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
