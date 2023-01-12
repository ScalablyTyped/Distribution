package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.DJ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.ER
import typings.countriesAndTimezones.countriesAndTimezonesStrings.ET
import typings.countriesAndTimezones.countriesAndTimezonesStrings.KE
import typings.countriesAndTimezones.countriesAndTimezonesStrings.KM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MG
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SO
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TZ
import typings.countriesAndTimezones.countriesAndTimezonesStrings.UG
import typings.countriesAndTimezones.countriesAndTimezonesStrings.YT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  var c: js.Tuple10[KE, DJ, ER, ET, KM, MG, SO, TZ, UG, YT]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`
}
object `31` {
  
  inline def apply(c: js.Tuple10[KE, DJ, ER, ET, KM, MG, SO, TZ, UG, YT]): `31` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `31`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple10[KE, DJ, ER, ET, KM, MG, SO, TZ, UG, YT]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
