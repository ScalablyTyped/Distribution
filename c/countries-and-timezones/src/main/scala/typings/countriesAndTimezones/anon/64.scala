package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-360`
import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-420`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `64` extends StObject {
  
  var c: js.Array[MX]
  
  var d: `-360`
  
  var u: `-420`
}
object `64` {
  
  inline def apply(c: js.Array[MX]): `64` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -360, u = -420)
    __obj.asInstanceOf[`64`]
  }
  
  extension [Self <: `64`](x: Self) {
    
    inline def setC(value: js.Array[MX]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MX*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-360`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-420`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
