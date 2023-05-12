package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`660`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.FM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `389` extends StObject {
  
  var c: js.Tuple2[SB, FM]
  
  var u: `660`
}
object `389` {
  
  inline def apply(c: js.Tuple2[SB, FM]): `389` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 660)
    __obj.asInstanceOf[`389`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `389`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[SB, FM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
