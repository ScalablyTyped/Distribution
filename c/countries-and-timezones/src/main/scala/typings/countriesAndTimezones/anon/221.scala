package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBangkok
import typings.countriesAndTimezones.countriesAndTimezonesStrings.LA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `221` extends StObject {
  
  var a: AsiaSlashBangkok
  
  var c: js.Array[LA]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `221` {
  
  inline def apply(c: js.Array[LA]): `221` = {
    val __obj = js.Dynamic.literal(a = "Asia/Bangkok", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`221`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `221`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashBangkok): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[LA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: LA*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
