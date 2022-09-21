package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-180`
import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-240`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  var c: js.Array[PY]
  
  var d: `-180`
  
  var u: `-240`
}
object `47` {
  
  inline def apply(c: js.Array[PY]): `47` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -180, u = -240)
    __obj.asInstanceOf[`47`]
  }
  
  extension [Self <: `47`](x: Self) {
    
    inline def setC(value: js.Array[PY]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PY*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-180`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
