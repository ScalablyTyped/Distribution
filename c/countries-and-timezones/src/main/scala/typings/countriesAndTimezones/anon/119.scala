package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-300`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`-360`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `119` extends StObject {
  
  var c: js.Array[CA]
  
  var d: `-300`
  
  var u: `-360`
}
object `119` {
  
  inline def apply(c: js.Array[CA]): `119` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -300, u = -360)
    __obj.asInstanceOf[`119`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `119`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[CA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CA*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-300`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
