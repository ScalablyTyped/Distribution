package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.SY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `169` extends StObject {
  
  var c: js.Array[SY]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`
}
object `169` {
  
  inline def apply(c: js.Array[SY]): `169` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`169`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `169`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Array[SY]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: SY*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
