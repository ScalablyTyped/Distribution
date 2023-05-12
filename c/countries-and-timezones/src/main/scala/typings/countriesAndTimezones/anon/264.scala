package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashHavana
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `264` extends StObject {
  
  var a: AmericaSlashHavana
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `264` {
  
  inline def apply(): `264` = {
    val __obj = js.Dynamic.literal(a = "America/Havana", r = 1)
    __obj.asInstanceOf[`264`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `264`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashHavana): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
