package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`-420`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CA
import typings.countriesAndTimezones.countriesAndTimezonesStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112` extends StObject {
  
  var c: js.Tuple2[US, CA]
  
  var u: `-420`
}
object `112` {
  
  inline def apply(c: js.Tuple2[US, CA]): `112` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -420)
    __obj.asInstanceOf[`112`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `112`] (val x: Self) extends AnyVal {
    
    inline def setC(value: js.Tuple2[US, CA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-420`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
