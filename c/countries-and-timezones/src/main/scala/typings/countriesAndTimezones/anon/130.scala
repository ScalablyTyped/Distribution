package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-420`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`-480`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `130` extends StObject {
  
  var c: js.Array[MX]
  
  var d: `-420`
  
  var u: `-480`
}
object `130` {
  
  inline def apply(c: js.Array[MX]): `130` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -420, u = -480)
    __obj.asInstanceOf[`130`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `130`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[MX]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MX*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-420`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
