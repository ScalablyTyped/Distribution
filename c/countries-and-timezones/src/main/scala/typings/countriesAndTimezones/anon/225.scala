package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-60`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `225` extends StObject {
  
  var c: js.Array[PT]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`
  
  var u: `-60`
}
object `225` {
  
  inline def apply(c: js.Array[PT]): `225` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 0, u = -60)
    __obj.asInstanceOf[`225`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `225`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[PT]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PT*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
