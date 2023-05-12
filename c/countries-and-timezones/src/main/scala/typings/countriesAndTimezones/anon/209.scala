package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`480`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MY
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `209` extends StObject {
  
  var c: js.Tuple2[SG, MY]
  
  var u: `480`
}
object `209` {
  
  inline def apply(c: js.Tuple2[SG, MY]): `209` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 480)
    __obj.asInstanceOf[`209`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `209`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[SG, MY]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
