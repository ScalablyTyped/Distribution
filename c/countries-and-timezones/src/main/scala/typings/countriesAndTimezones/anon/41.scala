package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-480`
import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-540`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  var c: js.Array[US]
  
  var d: `-480`
  
  var u: `-540`
}
object `41` {
  
  inline def apply(c: js.Array[US]): `41` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -480, u = -540)
    __obj.asInstanceOf[`41`]
  }
  
  extension [Self <: `41`](x: Self) {
    
    inline def setC(value: js.Array[US]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: US*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-480`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-540`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
