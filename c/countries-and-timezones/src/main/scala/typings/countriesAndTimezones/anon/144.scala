package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AQ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashRiyadh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144` extends StObject {
  
  var a: AsiaSlashRiyadh
  
  var c: js.Array[AQ]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `144` {
  
  inline def apply(c: js.Array[AQ]): `144` = {
    val __obj = js.Dynamic.literal(a = "Asia/Riyadh", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`144`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `144`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashRiyadh): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[AQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AQ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
