package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBelgrade
import typings.countriesAndTimezones.countriesAndTimezonesStrings.HR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `351` extends StObject {
  
  var a: EuropeSlashBelgrade
  
  var c: js.Array[HR]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `351` {
  
  inline def apply(c: js.Array[HR]): `351` = {
    val __obj = js.Dynamic.literal(a = "Europe/Belgrade", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`351`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `351`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashBelgrade): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[HR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: HR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
