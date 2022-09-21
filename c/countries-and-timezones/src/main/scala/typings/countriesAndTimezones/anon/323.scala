package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AX
import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashHelsinki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `323` extends StObject {
  
  var a: EuropeSlashHelsinki
  
  var c: js.Array[AX]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `323` {
  
  inline def apply(c: js.Array[AX]): `323` = {
    val __obj = js.Dynamic.literal(a = "Europe/Helsinki", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`323`]
  }
  
  extension [Self <: `323`](x: Self) {
    
    inline def setA(value: EuropeSlashHelsinki): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[AX]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AX*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
