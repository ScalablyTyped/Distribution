package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDenver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `124` extends StObject {
  
  var a: AmericaSlashDenver
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `124` {
  
  inline def apply(): `124` = {
    val __obj = js.Dynamic.literal(a = "America/Denver", r = 1)
    __obj.asInstanceOf[`124`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `124`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashDenver): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
