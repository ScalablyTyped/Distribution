package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesNumbers.`-420`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.CA
import typings.countriesAndTimezones.countriesAndTimezonesStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  var c: js.Tuple2[US, CA]
  
  var u: `-420`
}
object `110` {
  
  inline def apply(c: js.Tuple2[US, CA]): `110` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -420)
    __obj.asInstanceOf[`110`]
  }
  
  extension [Self <: `110`](x: Self) {
    
    inline def setC(value: js.Tuple2[US, CA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-420`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
