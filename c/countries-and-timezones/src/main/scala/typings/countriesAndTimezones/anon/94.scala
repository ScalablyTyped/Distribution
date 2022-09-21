package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-420`
import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-480`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94` extends StObject {
  
  var c: js.Array[US]
  
  var d: `-420`
  
  var u: `-480`
}
object `94` {
  
  inline def apply(c: js.Array[US]): `94` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -420, u = -480)
    __obj.asInstanceOf[`94`]
  }
  
  extension [Self <: `94`](x: Self) {
    
    inline def setC(value: js.Array[US]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: US*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-420`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
