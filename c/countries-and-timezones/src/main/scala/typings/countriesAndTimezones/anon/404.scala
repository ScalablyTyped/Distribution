package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-660`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.AS
import typings.countriesAndTimezones.countriesAndTimezonesStrings.UM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404` extends StObject {
  
  var c: js.Tuple2[AS, UM]
  
  var u: `-660`
}
object `404` {
  
  inline def apply(c: js.Tuple2[AS, UM]): `404` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -660)
    __obj.asInstanceOf[`404`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `404`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[AS, UM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
