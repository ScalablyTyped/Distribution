package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSantiago
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `259` extends StObject {
  
  var a: AmericaSlashSantiago
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `259` {
  
  inline def apply(): `259` = {
    val __obj = js.Dynamic.literal(a = "America/Santiago", r = 1)
    __obj.asInstanceOf[`259`]
  }
  
  extension [Self <: `259`](x: Self) {
    
    inline def setA(value: AmericaSlashSantiago): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
