package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.IO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `355` extends StObject {
  
  var c: js.Array[IO]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`360`
}
object `355` {
  
  inline def apply(c: js.Array[IO]): `355` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 360)
    __obj.asInstanceOf[`355`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `355`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[IO]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: IO*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
