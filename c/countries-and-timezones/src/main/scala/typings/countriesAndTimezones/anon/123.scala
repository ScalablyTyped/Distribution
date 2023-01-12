package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-150`
import typings.countriesAndTimezones.countriesAndTimezonesInts.`-90`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123` extends StObject {
  
  var c: js.Array[CA]
  
  var d: `-90`
  
  var u: `-150`
}
object `123` {
  
  inline def apply(c: js.Array[CA]): `123` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -90, u = -150)
    __obj.asInstanceOf[`123`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `123`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[CA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CA*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-90`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-150`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
