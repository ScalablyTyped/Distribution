package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBelgrade
import typings.countriesAndTimezones.countriesAndTimezonesStrings.ME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `333` extends StObject {
  
  var a: EuropeSlashBelgrade
  
  var c: js.Array[ME]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `333` {
  
  inline def apply(c: js.Array[ME]): `333` = {
    val __obj = js.Dynamic.literal(a = "Europe/Belgrade", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`333`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `333`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashBelgrade): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[ME]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: ME*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
