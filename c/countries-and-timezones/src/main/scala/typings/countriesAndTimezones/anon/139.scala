package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AQ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPort_Moresby
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  var a: PacificSlashPort_Moresby
  
  var c: js.Array[AQ]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `139` {
  
  inline def apply(c: js.Array[AQ]): `139` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Port_Moresby", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`139`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `139`] (val x: Self) extends AnyVal {
    
    inline def setA(value: PacificSlashPort_Moresby): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[AQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AQ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
