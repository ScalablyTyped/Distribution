package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.TR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `317` extends StObject {
  
  var c: js.Array[TR]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`
}
object `317` {
  
  inline def apply(c: js.Array[TR]): `317` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`317`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `317`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[TR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: TR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
