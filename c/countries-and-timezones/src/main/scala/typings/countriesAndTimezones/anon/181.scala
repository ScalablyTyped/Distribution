package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `181` extends StObject {
  
  var c: js.Array[ID]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`420`
}
object `181` {
  
  inline def apply(c: js.Array[ID]): `181` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 420)
    __obj.asInstanceOf[`181`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `181`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[ID]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: ID*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`420`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
