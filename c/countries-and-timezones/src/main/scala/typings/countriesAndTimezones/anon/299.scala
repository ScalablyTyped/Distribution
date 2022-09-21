package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLondon
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `299` extends StObject {
  
  var a: EuropeSlashLondon
  
  var c: js.Array[GB]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `299` {
  
  inline def apply(c: js.Array[GB]): `299` = {
    val __obj = js.Dynamic.literal(a = "Europe/London", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`299`]
  }
  
  extension [Self <: `299`](x: Self) {
    
    inline def setA(value: EuropeSlashLondon): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[GB]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: GB*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
