package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAnchorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `419` extends StObject {
  
  var a: AmericaSlashAnchorage
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `419` {
  
  inline def apply(): `419` = {
    val __obj = js.Dynamic.literal(a = "America/Anchorage", r = 1)
    __obj.asInstanceOf[`419`]
  }
  
  extension [Self <: `419`](x: Self) {
    
    inline def setA(value: AmericaSlashAnchorage): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
