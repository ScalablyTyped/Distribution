package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashLos_Angeles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `425` extends StObject {
  
  var a: AmericaSlashLos_Angeles
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `425` {
  
  inline def apply(): `425` = {
    val __obj = js.Dynamic.literal(a = "America/Los_Angeles", r = 1)
    __obj.asInstanceOf[`425`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `425`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashLos_Angeles): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
