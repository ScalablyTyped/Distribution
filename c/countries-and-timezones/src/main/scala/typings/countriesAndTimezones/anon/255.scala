package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Johns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `255` extends StObject {
  
  var a: AmericaSlashSt_Johns
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `255` {
  
  inline def apply(): `255` = {
    val __obj = js.Dynamic.literal(a = "America/St_Johns", r = 1)
    __obj.asInstanceOf[`255`]
  }
  
  extension [Self <: `255`](x: Self) {
    
    inline def setA(value: AmericaSlashSt_Johns): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
