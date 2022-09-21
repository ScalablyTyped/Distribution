package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-60`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `221` extends StObject {
  
  var c: js.Array[PT]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`
  
  var u: `-60`
}
object `221` {
  
  inline def apply(c: js.Array[PT]): `221` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 0, u = -60)
    __obj.asInstanceOf[`221`]
  }
  
  extension [Self <: `221`](x: Self) {
    
    inline def setC(value: js.Array[PT]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PT*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`0`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
