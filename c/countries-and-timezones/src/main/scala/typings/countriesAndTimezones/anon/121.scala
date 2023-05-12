package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-180`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`-240`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121` extends StObject {
  
  var c: js.Array[CL]
  
  var d: `-180`
  
  var u: `-240`
}
object `121` {
  
  inline def apply(c: js.Array[CL]): `121` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -180, u = -240)
    __obj.asInstanceOf[`121`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `121`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[CL]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CL*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-180`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
