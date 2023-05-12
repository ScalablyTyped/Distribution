package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashUTC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `297` extends StObject {
  
  var a: EtcSlashUTC
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `297` {
  
  inline def apply(): `297` = {
    val __obj = js.Dynamic.literal(a = "Etc/UTC", r = 1)
    __obj.asInstanceOf[`297`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `297`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EtcSlashUTC): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
