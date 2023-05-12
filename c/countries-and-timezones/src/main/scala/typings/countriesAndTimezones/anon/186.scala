package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashUrumqi
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `186` extends StObject {
  
  var a: AsiaSlashUrumqi
  
  var c: js.Array[CN]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `186` {
  
  inline def apply(c: js.Array[CN]): `186` = {
    val __obj = js.Dynamic.literal(a = "Asia/Urumqi", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`186`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `186`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashUrumqi): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[CN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CN*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
