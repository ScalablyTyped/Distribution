package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-300`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CA
import typings.countriesAndTimezones.countriesAndTimezonesStrings.KY
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109` extends StObject {
  
  var c: js.Tuple3[PA, CA, KY]
  
  var u: `-300`
}
object `109` {
  
  inline def apply(c: js.Tuple3[PA, CA, KY]): `109` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -300)
    __obj.asInstanceOf[`109`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `109`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple3[PA, CA, KY]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
