package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`720`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.KI
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MH
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TV
import typings.countriesAndTimezones.countriesAndTimezonesStrings.UM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.WF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `413` extends StObject {
  
  var c: js.Tuple5[KI, MH, TV, UM, WF]
  
  var u: `720`
}
object `413` {
  
  inline def apply(c: js.Tuple5[KI, MH, TV, UM, WF]): `413` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 720)
    __obj.asInstanceOf[`413`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `413`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple5[KI, MH, TV, UM, WF]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `720`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
