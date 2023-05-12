package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-180`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.UY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `103` extends StObject {
  
  var c: js.Array[UY]
  
  var u: `-180`
}
object `103` {
  
  inline def apply(c: js.Array[UY]): `103` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -180)
    __obj.asInstanceOf[`103`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `103`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[UY]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: UY*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
