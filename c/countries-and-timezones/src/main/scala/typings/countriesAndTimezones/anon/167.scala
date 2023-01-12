package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `167` extends StObject {
  
  var c: js.Array[BD]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`360`
}
object `167` {
  
  inline def apply(c: js.Array[BD]): `167` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 360)
    __obj.asInstanceOf[`167`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `167`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[BD]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BD*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
