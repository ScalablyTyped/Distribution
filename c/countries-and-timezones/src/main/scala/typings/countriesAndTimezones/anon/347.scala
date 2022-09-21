package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBelgrade
import typings.countriesAndTimezones.countriesAndTimezonesStrings.HR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `347` extends StObject {
  
  var a: EuropeSlashBelgrade
  
  var c: js.Array[HR]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `347` {
  
  inline def apply(c: js.Array[HR]): `347` = {
    val __obj = js.Dynamic.literal(a = "Europe/Belgrade", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`347`]
  }
  
  extension [Self <: `347`](x: Self) {
    
    inline def setA(value: EuropeSlashBelgrade): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[HR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: HR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
