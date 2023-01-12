package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BF
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CI
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GH
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GN
import typings.countriesAndTimezones.countriesAndTimezonesStrings.ML
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MR
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SH
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SL
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SN
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait C extends StObject {
  
  var c: js.Tuple11[CI, BF, GH, GM, GN, ML, MR, SH, SL, SN, TG]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`
}
object C {
  
  inline def apply(c: js.Tuple11[CI, BF, GH, GM, GN, ML, MR, SH, SL, SN, TG]): C = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 0)
    __obj.asInstanceOf[C]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: C] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple11[CI, BF, GH, GM, GN, ML, MR, SH, SL, SN, TG]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`0`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
