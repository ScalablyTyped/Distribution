package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashRome
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `333` extends StObject {
  
  var a: EuropeSlashRome
  
  var c: js.Array[SM]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `333` {
  
  inline def apply(c: js.Array[SM]): `333` = {
    val __obj = js.Dynamic.literal(a = "Europe/Rome", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`333`]
  }
  
  extension [Self <: `333`](x: Self) {
    
    inline def setA(value: EuropeSlashRome): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[SM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: SM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
