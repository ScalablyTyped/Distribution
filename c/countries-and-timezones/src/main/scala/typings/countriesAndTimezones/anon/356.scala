package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.HM
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `356` extends StObject {
  
  var c: js.Tuple2[TF, HM]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`300`
}
object `356` {
  
  inline def apply(c: js.Tuple2[TF, HM]): `356` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 300)
    __obj.asInstanceOf[`356`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `356`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[TF, HM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
