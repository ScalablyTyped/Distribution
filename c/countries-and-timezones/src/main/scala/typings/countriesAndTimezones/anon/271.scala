package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `271` extends StObject {
  
  var a: EtcSlashGMT
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `271` {
  
  inline def apply(): `271` = {
    val __obj = js.Dynamic.literal(a = "Etc/GMT", r = 1)
    __obj.asInstanceOf[`271`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `271`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EtcSlashGMT): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
