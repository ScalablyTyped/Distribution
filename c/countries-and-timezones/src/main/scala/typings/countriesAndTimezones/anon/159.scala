package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.RU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `159` extends StObject {
  
  var c: js.Array[RU]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`420`
}
object `159` {
  
  inline def apply(c: js.Array[RU]): `159` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 420)
    __obj.asInstanceOf[`159`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `159`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[RU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: RU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`420`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
