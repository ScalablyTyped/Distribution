package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMazatlan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `371` extends StObject {
  
  var a: AmericaSlashMazatlan
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `371` {
  
  inline def apply(): `371` = {
    val __obj = js.Dynamic.literal(a = "America/Mazatlan", r = 1)
    __obj.asInstanceOf[`371`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `371`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashMazatlan): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
