package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashCordoba
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `65` extends StObject {
  
  var a: AmericaSlashArgentinaSlashCordoba
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `65` {
  
  inline def apply(): `65` = {
    val __obj = js.Dynamic.literal(a = "America/Argentina/Cordoba", r = 1)
    __obj.asInstanceOf[`65`]
  }
  
  extension [Self <: `65`](x: Self) {
    
    inline def setA(value: AmericaSlashArgentinaSlashCordoba): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
