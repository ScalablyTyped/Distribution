package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashKwajalein
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `365` extends StObject {
  
  var a: PacificSlashKwajalein
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `365` {
  
  inline def apply(): `365` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Kwajalein", r = 1)
    __obj.asInstanceOf[`365`]
  }
  
  extension [Self <: `365`](x: Self) {
    
    inline def setA(value: PacificSlashKwajalein): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
