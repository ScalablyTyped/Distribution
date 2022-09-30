package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRio_Branco
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  var a: AmericaSlashRio_Branco
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `113` {
  
  inline def apply(): `113` = {
    val __obj = js.Dynamic.literal(a = "America/Rio_Branco", r = 1)
    __obj.asInstanceOf[`113`]
  }
  
  extension [Self <: `113`](x: Self) {
    
    inline def setA(value: AmericaSlashRio_Branco): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
