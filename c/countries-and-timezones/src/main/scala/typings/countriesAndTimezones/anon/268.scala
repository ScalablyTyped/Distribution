package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashCairo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `268` extends StObject {
  
  var a: AfricaSlashCairo
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `268` {
  
  inline def apply(): `268` = {
    val __obj = js.Dynamic.literal(a = "Africa/Cairo", r = 1)
    __obj.asInstanceOf[`268`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `268`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AfricaSlashCairo): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
