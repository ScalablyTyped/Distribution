package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAbidjan
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  var a: AfricaSlashAbidjan
  
  var c: js.Array[MR]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `34` {
  
  inline def apply(c: js.Array[MR]): `34` = {
    val __obj = js.Dynamic.literal(a = "Africa/Abidjan", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`34`]
  }
  
  extension [Self <: `34`](x: Self) {
    
    inline def setA(value: AfricaSlashAbidjan): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[MR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
