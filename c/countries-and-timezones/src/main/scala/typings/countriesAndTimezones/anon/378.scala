package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`660`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.PG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `378` extends StObject {
  
  var c: js.Array[PG]
  
  var u: `660`
}
object `378` {
  
  inline def apply(c: js.Array[PG]): `378` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 660)
    __obj.asInstanceOf[`378`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `378`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[PG]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PG*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
