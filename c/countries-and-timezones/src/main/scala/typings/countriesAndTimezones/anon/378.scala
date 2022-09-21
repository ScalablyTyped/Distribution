package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-300`
import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-360`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `378` extends StObject {
  
  var c: js.Array[CL]
  
  var d: `-300`
  
  var u: `-360`
}
object `378` {
  
  inline def apply(c: js.Array[CL]): `378` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -300, u = -360)
    __obj.asInstanceOf[`378`]
  }
  
  extension [Self <: `378`](x: Self) {
    
    inline def setC(value: js.Array[CL]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CL*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-300`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
