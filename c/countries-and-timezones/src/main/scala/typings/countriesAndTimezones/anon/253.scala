package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashManaus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `253` extends StObject {
  
  var a: AmericaSlashManaus
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `253` {
  
  inline def apply(): `253` = {
    val __obj = js.Dynamic.literal(a = "America/Manaus", r = 1)
    __obj.asInstanceOf[`253`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `253`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashManaus): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
