package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSao_Paulo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `248` extends StObject {
  
  var a: AmericaSlashSao_Paulo
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `248` {
  
  inline def apply(): `248` = {
    val __obj = js.Dynamic.literal(a = "America/Sao_Paulo", r = 1)
    __obj.asInstanceOf[`248`]
  }
  
  extension [Self <: `248`](x: Self) {
    
    inline def setA(value: AmericaSlashSao_Paulo): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
