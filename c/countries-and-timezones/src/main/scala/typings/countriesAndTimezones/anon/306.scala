package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BE
import typings.countriesAndTimezones.countriesAndTimezonesStrings.LU
import typings.countriesAndTimezones.countriesAndTimezonesStrings.NL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `306` extends StObject {
  
  var c: js.Tuple3[BE, LU, NL]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`
}
object `306` {
  
  inline def apply(c: js.Tuple3[BE, LU, NL]): `306` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`306`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `306`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple3[BE, LU, NL]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
