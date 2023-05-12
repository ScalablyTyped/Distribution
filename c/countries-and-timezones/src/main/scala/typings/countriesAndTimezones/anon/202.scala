package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BH
import typings.countriesAndTimezones.countriesAndTimezonesStrings.QA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202` extends StObject {
  
  var c: js.Tuple2[QA, BH]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`
}
object `202` {
  
  inline def apply(c: js.Tuple2[QA, BH]): `202` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`202`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[QA, BH]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
