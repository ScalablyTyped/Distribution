package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.PT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `231` extends StObject {
  
  var c: js.Array[PT]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`
}
object `231` {
  
  inline def apply(c: js.Array[PT]): `231` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 60, u = 0)
    __obj.asInstanceOf[`231`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `231`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[PT]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PT*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
