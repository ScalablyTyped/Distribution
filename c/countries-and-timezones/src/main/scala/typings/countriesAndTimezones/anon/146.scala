package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AQ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashUrumqi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `146` extends StObject {
  
  var a: AsiaSlashUrumqi
  
  var c: js.Array[AQ]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `146` {
  
  inline def apply(c: js.Array[AQ]): `146` = {
    val __obj = js.Dynamic.literal(a = "Asia/Urumqi", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`146`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `146`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashUrumqi): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[AQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AQ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
