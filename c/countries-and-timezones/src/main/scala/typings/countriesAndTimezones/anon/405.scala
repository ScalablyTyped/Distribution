package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-600`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `405` extends StObject {
  
  var c: js.Array[CK]
  
  var u: `-600`
}
object `405` {
  
  inline def apply(c: js.Array[CK]): `405` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -600)
    __obj.asInstanceOf[`405`]
  }
  
  extension [Self <: `405`](x: Self) {
    
    inline def setC(value: js.Array[CK]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CK*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-600`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
