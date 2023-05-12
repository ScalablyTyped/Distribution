package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKuching
import typings.countriesAndTimezones.countriesAndTimezonesStrings.BN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `162` extends StObject {
  
  var a: AsiaSlashKuching
  
  var c: js.Array[BN]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `162` {
  
  inline def apply(c: js.Array[BN]): `162` = {
    val __obj = js.Dynamic.literal(a = "Asia/Kuching", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`162`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `162`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashKuching): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[BN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BN*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
