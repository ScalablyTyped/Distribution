package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-360`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.BZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52` extends StObject {
  
  var c: js.Array[BZ]
  
  var u: `-360`
}
object `52` {
  
  inline def apply(c: js.Array[BZ]): `52` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -360)
    __obj.asInstanceOf[`52`]
  }
  
  extension [Self <: `52`](x: Self) {
    
    inline def setC(value: js.Array[BZ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BZ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
