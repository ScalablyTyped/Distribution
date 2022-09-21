package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.MM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `218` extends StObject {
  
  var c: js.Array[MM]
  
  var u: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`390`
}
object `218` {
  
  inline def apply(c: js.Array[MM]): `218` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 390)
    __obj.asInstanceOf[`218`]
  }
  
  extension [Self <: `218`](x: Self) {
    
    inline def setC(value: js.Array[MM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`390`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
