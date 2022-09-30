package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashManaus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `249` extends StObject {
  
  var a: AmericaSlashManaus
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `249` {
  
  inline def apply(): `249` = {
    val __obj = js.Dynamic.literal(a = "America/Manaus", r = 1)
    __obj.asInstanceOf[`249`]
  }
  
  extension [Self <: `249`](x: Self) {
    
    inline def setA(value: AmericaSlashManaus): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
