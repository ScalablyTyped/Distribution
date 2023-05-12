package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBerlin
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `342` extends StObject {
  
  var a: EuropeSlashBerlin
  
  var c: js.Array[SE]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `342` {
  
  inline def apply(c: js.Array[SE]): `342` = {
    val __obj = js.Dynamic.literal(a = "Europe/Berlin", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`342`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `342`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashBerlin): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[SE]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: SE*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
