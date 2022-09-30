package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.GB
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GG
import typings.countriesAndTimezones.countriesAndTimezonesStrings.IM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.JE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `320` extends StObject {
  
  var c: js.Tuple4[GB, GG, IM, JE]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`
}
object `320` {
  
  inline def apply(c: js.Tuple4[GB, GG, IM, JE]): `320` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 60, u = 0)
    __obj.asInstanceOf[`320`]
  }
  
  extension [Self <: `320`](x: Self) {
    
    inline def setC(value: js.Tuple4[GB, GG, IM, JE]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
