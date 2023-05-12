package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.FR
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `332` extends StObject {
  
  var c: js.Tuple2[FR, MC]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`
}
object `332` {
  
  inline def apply(c: js.Tuple2[FR, MC]): `332` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`332`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `332`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[FR, MC]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
