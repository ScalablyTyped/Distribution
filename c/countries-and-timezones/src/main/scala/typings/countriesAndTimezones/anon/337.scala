package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.BG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `337` extends StObject {
  
  var c: js.Array[BG]
  
  var d: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`180`
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`
}
object `337` {
  
  inline def apply(c: js.Array[BG]): `337` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 180, u = 120)
    __obj.asInstanceOf[`337`]
  }
  
  extension [Self <: `337`](x: Self) {
    
    inline def setC(value: js.Array[BG]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BG*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`180`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
