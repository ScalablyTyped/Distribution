package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BV
import typings.countriesAndTimezones.countriesAndTimezonesStrings.NO
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SJ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `327` extends StObject {
  
  var c: js.Tuple3[NO, SJ, BV]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`
}
object `327` {
  
  inline def apply(c: js.Tuple3[NO, SJ, BV]): `327` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`327`]
  }
  
  extension [Self <: `327`](x: Self) {
    
    inline def setC(value: js.Tuple3[NO, SJ, BV]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
