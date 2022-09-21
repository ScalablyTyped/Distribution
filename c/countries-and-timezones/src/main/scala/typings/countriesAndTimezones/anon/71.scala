package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-240`
import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-300`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `71` extends StObject {
  
  var c: js.Array[US]
  
  var d: `-240`
  
  var u: `-300`
}
object `71` {
  
  inline def apply(c: js.Array[US]): `71` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -240, u = -300)
    __obj.asInstanceOf[`71`]
  }
  
  extension [Self <: `71`](x: Self) {
    
    inline def setC(value: js.Array[US]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: US*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-240`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
