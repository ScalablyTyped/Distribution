package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AQ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashAuckland
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  var a: PacificSlashAuckland
  
  var c: js.Array[AQ]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `139` {
  
  inline def apply(c: js.Array[AQ]): `139` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Auckland", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`139`]
  }
  
  extension [Self <: `139`](x: Self) {
    
    inline def setA(value: PacificSlashAuckland): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[AQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AQ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
