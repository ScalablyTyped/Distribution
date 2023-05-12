package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-660`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.NU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `401` extends StObject {
  
  var c: js.Array[NU]
  
  var u: `-660`
}
object `401` {
  
  inline def apply(c: js.Array[NU]): `401` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -660)
    __obj.asInstanceOf[`401`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `401`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[NU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: NU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
