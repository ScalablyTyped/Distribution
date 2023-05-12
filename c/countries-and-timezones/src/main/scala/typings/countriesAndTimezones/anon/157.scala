package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `157` extends StObject {
  
  var c: js.Array[AZ]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`240`
}
object `157` {
  
  inline def apply(c: js.Array[AZ]): `157` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 240)
    __obj.asInstanceOf[`157`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `157`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[AZ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AZ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
