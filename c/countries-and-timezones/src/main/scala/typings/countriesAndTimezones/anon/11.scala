package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMaputo
import typings.countriesAndTimezones.countriesAndTimezonesStrings.BW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var a: AfricaSlashMaputo
  
  var c: js.Array[BW]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `11` {
  
  inline def apply(c: js.Array[BW]): `11` = {
    val __obj = js.Dynamic.literal(a = "Africa/Maputo", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setA(value: AfricaSlashMaputo): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[BW]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BW*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
