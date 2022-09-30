package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLisbon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `415` extends StObject {
  
  var a: EuropeSlashLisbon
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `415` {
  
  inline def apply(): `415` = {
    val __obj = js.Dynamic.literal(a = "Europe/Lisbon", r = 1)
    __obj.asInstanceOf[`415`]
  }
  
  extension [Self <: `415`](x: Self) {
    
    inline def setA(value: EuropeSlashLisbon): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
