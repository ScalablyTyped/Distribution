package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.LB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160` extends StObject {
  
  var c: js.Array[LB]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`
}
object `160` {
  
  inline def apply(c: js.Array[LB]): `160` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 180, u = 120)
    __obj.asInstanceOf[`160`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `160`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[LB]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: LB*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
