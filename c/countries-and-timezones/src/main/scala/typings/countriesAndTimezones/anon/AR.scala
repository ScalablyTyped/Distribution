package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashCatamarca
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AR extends StObject {
  
  var a: AmericaSlashArgentinaSlashCatamarca
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object AR {
  
  inline def apply(): AR = {
    val __obj = js.Dynamic.literal(a = "America/Argentina/Catamarca", r = 1)
    __obj.asInstanceOf[AR]
  }
  
  extension [Self <: AR](x: Self) {
    
    inline def setA(value: AmericaSlashArgentinaSlashCatamarca): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
