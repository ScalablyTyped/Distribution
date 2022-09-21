package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashEdmonton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `254` extends StObject {
  
  var a: AmericaSlashEdmonton
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `254` {
  
  inline def apply(): `254` = {
    val __obj = js.Dynamic.literal(a = "America/Edmonton", r = 1)
    __obj.asInstanceOf[`254`]
  }
  
  extension [Self <: `254`](x: Self) {
    
    inline def setA(value: AmericaSlashEdmonton): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
