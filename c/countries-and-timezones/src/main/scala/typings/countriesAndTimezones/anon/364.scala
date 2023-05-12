package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDubai
import typings.countriesAndTimezones.countriesAndTimezonesStrings.RE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `364` extends StObject {
  
  var a: AsiaSlashDubai
  
  var c: js.Array[RE]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `364` {
  
  inline def apply(c: js.Array[RE]): `364` = {
    val __obj = js.Dynamic.literal(a = "Asia/Dubai", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`364`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `364`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashDubai): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[RE]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: RE*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
