package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.LS
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SZ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.ZA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var c: js.Tuple3[ZA, LS, SZ]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`
}
object `13` {
  
  inline def apply(c: js.Tuple3[ZA, LS, SZ]): `13` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 120)
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setC(value: js.Tuple3[ZA, LS, SZ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
