package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.CC
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `222` extends StObject {
  
  var c: js.Tuple2[MM, CC]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`390`
}
object `222` {
  
  inline def apply(c: js.Tuple2[MM, CC]): `222` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 390)
    __obj.asInstanceOf[`222`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `222`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[MM, CC]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`390`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
