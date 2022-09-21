package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.MU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `359` extends StObject {
  
  var c: js.Array[MU]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`240`
}
object `359` {
  
  inline def apply(c: js.Array[MU]): `359` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 240)
    __obj.asInstanceOf[`359`]
  }
  
  extension [Self <: `359`](x: Self) {
    
    inline def setC(value: js.Array[MU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
