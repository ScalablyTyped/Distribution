package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BV
import typings.countriesAndTimezones.countriesAndTimezonesStrings.NO
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SJ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `327` extends StObject {
  
  var c: js.Tuple3[NO, SJ, BV]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`
}
object `327` {
  
  inline def apply(c: js.Tuple3[NO, SJ, BV]): `327` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`327`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `327`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple3[NO, SJ, BV]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
