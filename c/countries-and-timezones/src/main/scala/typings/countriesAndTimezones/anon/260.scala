package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashEaster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `260` extends StObject {
  
  var a: PacificSlashEaster
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `260` {
  
  inline def apply(): `260` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Easter", r = 1)
    __obj.asInstanceOf[`260`]
  }
  
  extension [Self <: `260`](x: Self) {
    
    inline def setA(value: PacificSlashEaster): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
