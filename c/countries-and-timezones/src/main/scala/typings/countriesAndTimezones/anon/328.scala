package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `328` extends StObject {
  
  var c: js.Array[BY]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`
}
object `328` {
  
  inline def apply(c: js.Array[BY]): `328` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`328`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `328`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[BY]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BY*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
