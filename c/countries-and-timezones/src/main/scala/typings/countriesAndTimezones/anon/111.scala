package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-180`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  var c: js.Array[SR]
  
  var u: `-180`
}
object `111` {
  
  inline def apply(c: js.Array[SR]): `111` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -180)
    __obj.asInstanceOf[`111`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `111`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[SR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: SR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
