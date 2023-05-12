package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`525`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.AU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `241` extends StObject {
  
  var c: js.Array[AU]
  
  var u: `525`
}
object `241` {
  
  inline def apply(c: js.Array[AU]): `241` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 525)
    __obj.asInstanceOf[`241`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `241`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[AU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `525`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
