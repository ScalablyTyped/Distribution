package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.LK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `164` extends StObject {
  
  var c: js.Array[LK]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`330`
}
object `164` {
  
  inline def apply(c: js.Array[LK]): `164` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 330)
    __obj.asInstanceOf[`164`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `164`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[LK]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: LK*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`330`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
