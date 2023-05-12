package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`480`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.BN
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  var c: js.Tuple2[MY, BN]
  
  var u: `480`
}
object `191` {
  
  inline def apply(c: js.Tuple2[MY, BN]): `191` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 480)
    __obj.asInstanceOf[`191`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `191`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[MY, BN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
