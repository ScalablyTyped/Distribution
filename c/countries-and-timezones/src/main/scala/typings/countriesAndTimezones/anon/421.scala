package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashChicago
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `421` extends StObject {
  
  var a: AmericaSlashChicago
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `421` {
  
  inline def apply(): `421` = {
    val __obj = js.Dynamic.literal(a = "America/Chicago", r = 1)
    __obj.asInstanceOf[`421`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `421`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashChicago): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
