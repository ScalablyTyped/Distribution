package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashUTC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `294` extends StObject {
  
  var a: EtcSlashUTC
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `294` {
  
  inline def apply(): `294` = {
    val __obj = js.Dynamic.literal(a = "Etc/UTC", r = 1)
    __obj.asInstanceOf[`294`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `294`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EtcSlashUTC): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
