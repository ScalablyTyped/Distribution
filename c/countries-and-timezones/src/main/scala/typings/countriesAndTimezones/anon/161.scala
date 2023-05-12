package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.KG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `161` extends StObject {
  
  var c: js.Array[KG]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`360`
}
object `161` {
  
  inline def apply(c: js.Array[KG]): `161` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 360)
    __obj.asInstanceOf[`161`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `161`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[KG]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: KG*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
