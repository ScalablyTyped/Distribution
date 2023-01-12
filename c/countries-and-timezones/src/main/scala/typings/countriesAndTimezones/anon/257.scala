package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRegina
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `257` extends StObject {
  
  var a: AmericaSlashRegina
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `257` {
  
  inline def apply(): `257` = {
    val __obj = js.Dynamic.literal(a = "America/Regina", r = 1)
    __obj.asInstanceOf[`257`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `257`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashRegina): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
