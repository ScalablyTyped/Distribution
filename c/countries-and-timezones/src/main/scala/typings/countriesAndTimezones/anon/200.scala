package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AQ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.KW
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SA
import typings.countriesAndTimezones.countriesAndTimezonesStrings.YE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200` extends StObject {
  
  var c: js.Tuple4[SA, AQ, KW, YE]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`
}
object `200` {
  
  inline def apply(c: js.Tuple4[SA, AQ, KW, YE]): `200` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`200`]
  }
  
  extension [Self <: `200`](x: Self) {
    
    inline def setC(value: js.Tuple4[SA, AQ, KW, YE]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
