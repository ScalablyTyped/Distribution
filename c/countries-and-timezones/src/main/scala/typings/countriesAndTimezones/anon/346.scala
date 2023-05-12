package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashZurich
import typings.countriesAndTimezones.countriesAndTimezonesStrings.LI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `346` extends StObject {
  
  var a: EuropeSlashZurich
  
  var c: js.Array[LI]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `346` {
  
  inline def apply(c: js.Array[LI]): `346` = {
    val __obj = js.Dynamic.literal(a = "Europe/Zurich", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`346`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `346`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashZurich): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[LI]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: LI*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
