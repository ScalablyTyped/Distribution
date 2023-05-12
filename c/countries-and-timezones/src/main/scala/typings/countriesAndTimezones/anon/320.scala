package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashKyiv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `320` extends StObject {
  
  var a: EuropeSlashKyiv
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `320` {
  
  inline def apply(): `320` = {
    val __obj = js.Dynamic.literal(a = "Europe/Kyiv", r = 1)
    __obj.asInstanceOf[`320`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `320`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashKyiv): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
