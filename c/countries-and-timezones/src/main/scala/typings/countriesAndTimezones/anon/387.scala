package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-360`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.EC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `387` extends StObject {
  
  var c: js.Array[EC]
  
  var u: `-360`
}
object `387` {
  
  inline def apply(c: js.Array[EC]): `387` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -360)
    __obj.asInstanceOf[`387`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `387`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[EC]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: EC*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
