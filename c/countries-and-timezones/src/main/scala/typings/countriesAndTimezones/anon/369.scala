package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashTripoli
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `369` extends StObject {
  
  var a: AfricaSlashTripoli
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `369` {
  
  inline def apply(): `369` = {
    val __obj = js.Dynamic.literal(a = "Africa/Tripoli", r = 1)
    __obj.asInstanceOf[`369`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `369`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AfricaSlashTripoli): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
