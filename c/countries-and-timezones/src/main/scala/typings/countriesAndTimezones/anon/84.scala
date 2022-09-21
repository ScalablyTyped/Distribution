package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-240`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `84` extends StObject {
  
  var c: js.Array[GY]
  
  var u: `-240`
}
object `84` {
  
  inline def apply(c: js.Array[GY]): `84` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -240)
    __obj.asInstanceOf[`84`]
  }
  
  extension [Self <: `84`](x: Self) {
    
    inline def setC(value: js.Array[GY]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: GY*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
