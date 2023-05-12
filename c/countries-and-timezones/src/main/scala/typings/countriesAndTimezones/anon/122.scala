package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-240`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.DO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `122` extends StObject {
  
  var c: js.Array[DO]
  
  var u: `-240`
}
object `122` {
  
  inline def apply(c: js.Array[DO]): `122` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -240)
    __obj.asInstanceOf[`122`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `122`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[DO]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: DO*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
