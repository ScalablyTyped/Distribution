package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashRome
import typings.countriesAndTimezones.countriesAndTimezonesStrings.VA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `347` extends StObject {
  
  var a: EuropeSlashRome
  
  var c: js.Array[VA]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `347` {
  
  inline def apply(c: js.Array[VA]): `347` = {
    val __obj = js.Dynamic.literal(a = "Europe/Rome", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`347`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `347`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashRome): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[VA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: VA*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
