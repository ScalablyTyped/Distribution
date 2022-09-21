package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BA
import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBelgrade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `334` extends StObject {
  
  var a: EuropeSlashBelgrade
  
  var c: js.Array[BA]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `334` {
  
  inline def apply(c: js.Array[BA]): `334` = {
    val __obj = js.Dynamic.literal(a = "Europe/Belgrade", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`334`]
  }
  
  extension [Self <: `334`](x: Self) {
    
    inline def setA(value: EuropeSlashBelgrade): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[BA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BA*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
