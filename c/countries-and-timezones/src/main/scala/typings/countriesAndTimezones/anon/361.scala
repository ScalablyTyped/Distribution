package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.MV
import typings.countriesAndTimezones.countriesAndTimezonesStrings.TF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `361` extends StObject {
  
  var c: js.Tuple2[MV, TF]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesInts.`300`
}
object `361` {
  
  inline def apply(c: js.Tuple2[MV, TF]): `361` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 300)
    __obj.asInstanceOf[`361`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `361`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[MV, TF]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
