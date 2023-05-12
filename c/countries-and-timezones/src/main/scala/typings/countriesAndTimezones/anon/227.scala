package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.ES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `227` extends StObject {
  
  var c: js.Array[ES]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`
}
object `227` {
  
  inline def apply(c: js.Array[ES]): `227` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 60, u = 0)
    __obj.asInstanceOf[`227`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `227`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[ES]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: ES*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
