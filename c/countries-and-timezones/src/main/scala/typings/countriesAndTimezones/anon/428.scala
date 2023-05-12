package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashLos_Angeles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `428` extends StObject {
  
  var a: AmericaSlashLos_Angeles
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `428` {
  
  inline def apply(): `428` = {
    val __obj = js.Dynamic.literal(a = "America/Los_Angeles", r = 1)
    __obj.asInstanceOf[`428`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `428`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashLos_Angeles): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
