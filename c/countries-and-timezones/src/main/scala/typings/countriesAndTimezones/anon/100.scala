package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashMendoza
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  var a: AmericaSlashArgentinaSlashMendoza
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `100` {
  
  inline def apply(): `100` = {
    val __obj = js.Dynamic.literal(a = "America/Argentina/Mendoza", r = 1)
    __obj.asInstanceOf[`100`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `100`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashArgentinaSlashMendoza): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
