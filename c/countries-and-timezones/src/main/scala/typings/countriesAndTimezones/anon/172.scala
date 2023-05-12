package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AE
import typings.countriesAndTimezones.countriesAndTimezonesStrings.OM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.RE
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SC
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `172` extends StObject {
  
  var c: js.Tuple5[AE, OM, RE, SC, TF]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`240`
}
object `172` {
  
  inline def apply(c: js.Tuple5[AE, OM, RE, SC, TF]): `172` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 240)
    __obj.asInstanceOf[`172`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `172`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple5[AE, OM, RE, SC, TF]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
