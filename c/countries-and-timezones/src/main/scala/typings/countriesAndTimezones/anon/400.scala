package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`720`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.NR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400` extends StObject {
  
  var c: js.Array[NR]
  
  var u: `720`
}
object `400` {
  
  inline def apply(c: js.Array[NR]): `400` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 720)
    __obj.asInstanceOf[`400`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `400`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[NR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: NR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `720`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
