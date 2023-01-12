package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashCatamarca
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AR extends StObject {
  
  var a: AmericaSlashArgentinaSlashCatamarca
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object AR {
  
  inline def apply(): AR = {
    val __obj = js.Dynamic.literal(a = "America/Argentina/Catamarca", r = 1)
    __obj.asInstanceOf[AR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AR] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashArgentinaSlashCatamarca): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
