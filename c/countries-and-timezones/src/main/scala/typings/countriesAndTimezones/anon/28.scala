package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashJohannesburg
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28` extends StObject {
  
  var a: AfricaSlashJohannesburg
  
  var c: js.Array[SZ]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `28` {
  
  inline def apply(c: js.Array[SZ]): `28` = {
    val __obj = js.Dynamic.literal(a = "Africa/Johannesburg", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`28`]
  }
  
  extension [Self <: `28`](x: Self) {
    
    inline def setA(value: AfricaSlashJohannesburg): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[SZ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: SZ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
