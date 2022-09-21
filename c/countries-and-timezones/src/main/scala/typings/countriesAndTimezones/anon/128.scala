package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-360`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.HN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `128` extends StObject {
  
  var c: js.Array[HN]
  
  var u: `-360`
}
object `128` {
  
  inline def apply(c: js.Array[HN]): `128` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -360)
    __obj.asInstanceOf[`128`]
  }
  
  extension [Self <: `128`](x: Self) {
    
    inline def setC(value: js.Array[HN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: HN*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
