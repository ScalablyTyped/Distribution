package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNoronha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `247` extends StObject {
  
  var a: AmericaSlashNoronha
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `247` {
  
  inline def apply(): `247` = {
    val __obj = js.Dynamic.literal(a = "America/Noronha", r = 1)
    __obj.asInstanceOf[`247`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `247`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashNoronha): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
