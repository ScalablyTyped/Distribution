package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.CX
import typings.countriesAndTimezones.countriesAndTimezonesStrings.KH
import typings.countriesAndTimezones.countriesAndTimezonesStrings.LA
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TH
import typings.countriesAndTimezones.countriesAndTimezonesStrings.VN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `158` extends StObject {
  
  var c: js.Tuple5[TH, CX, KH, LA, VN]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`420`
}
object `158` {
  
  inline def apply(c: js.Tuple5[TH, CX, KH, LA, VN]): `158` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 420)
    __obj.asInstanceOf[`158`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `158`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple5[TH, CX, KH, LA, VN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`420`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
