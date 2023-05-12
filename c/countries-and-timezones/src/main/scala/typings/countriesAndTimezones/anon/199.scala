package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.RU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `199` extends StObject {
  
  var c: js.Array[RU]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`360`
}
object `199` {
  
  inline def apply(c: js.Array[RU]): `199` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 360)
    __obj.asInstanceOf[`199`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `199`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[RU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: RU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
