package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTaipei
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `416` extends StObject {
  
  var a: AsiaSlashTaipei
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `416` {
  
  inline def apply(): `416` = {
    val __obj = js.Dynamic.literal(a = "Asia/Taipei", r = 1)
    __obj.asInstanceOf[`416`]
  }
  
  extension [Self <: `416`](x: Self) {
    
    inline def setA(value: AsiaSlashTaipei): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
