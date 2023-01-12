package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-510`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `394` extends StObject {
  
  var c: js.Array[PF]
  
  var u: `-510`
}
object `394` {
  
  inline def apply(c: js.Array[PF]): `394` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -510)
    __obj.asInstanceOf[`394`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `394`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[PF]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PF*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-510`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
