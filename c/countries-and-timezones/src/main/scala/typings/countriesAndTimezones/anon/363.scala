package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashJamaica
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `363` extends StObject {
  
  var a: AmericaSlashJamaica
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `363` {
  
  inline def apply(): `363` = {
    val __obj = js.Dynamic.literal(a = "America/Jamaica", r = 1)
    __obj.asInstanceOf[`363`]
  }
  
  extension [Self <: `363`](x: Self) {
    
    inline def setA(value: AmericaSlashJamaica): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
