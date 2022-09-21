package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-180`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  var c: js.Array[CL]
  
  var u: `-180`
}
object `115` {
  
  inline def apply(c: js.Array[CL]): `115` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -180)
    __obj.asInstanceOf[`115`]
  }
  
  extension [Self <: `115`](x: Self) {
    
    inline def setC(value: js.Array[CL]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CL*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
