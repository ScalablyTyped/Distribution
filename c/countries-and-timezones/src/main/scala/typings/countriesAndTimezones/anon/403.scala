package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPohnpei
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403` extends StObject {
  
  var a: PacificSlashPohnpei
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `403` {
  
  inline def apply(): `403` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Pohnpei", r = 1)
    __obj.asInstanceOf[`403`]
  }
  
  extension [Self <: `403`](x: Self) {
    
    inline def setA(value: PacificSlashPohnpei): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
