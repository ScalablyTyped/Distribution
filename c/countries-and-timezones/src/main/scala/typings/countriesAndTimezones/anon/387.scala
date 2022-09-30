package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesInts.`600`
import typings.countriesAndTimezones.countriesAndTimezonesStrings.GU
import typings.countriesAndTimezones.countriesAndTimezonesStrings.MP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `387` extends StObject {
  
  var c: js.Tuple2[GU, MP]
  
  var u: `600`
}
object `387` {
  
  inline def apply(c: js.Tuple2[GU, MP]): `387` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 600)
    __obj.asInstanceOf[`387`]
  }
  
  extension [Self <: `387`](x: Self) {
    
    inline def setC(value: js.Tuple2[GU, MP]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `600`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
