package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`660`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.VU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `379` extends StObject {
  
  var c: js.Array[VU]
  
  var u: `660`
}
object `379` {
  
  inline def apply(c: js.Array[VU]): `379` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 660)
    __obj.asInstanceOf[`379`]
  }
  
  extension [Self <: `379`](x: Self) {
    
    inline def setC(value: js.Array[VU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: VU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
