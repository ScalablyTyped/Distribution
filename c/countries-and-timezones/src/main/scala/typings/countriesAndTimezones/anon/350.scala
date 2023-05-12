package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.PL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `350` extends StObject {
  
  var c: js.Array[PL]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`
}
object `350` {
  
  inline def apply(c: js.Array[PL]): `350` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`350`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `350`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[PL]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PL*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
