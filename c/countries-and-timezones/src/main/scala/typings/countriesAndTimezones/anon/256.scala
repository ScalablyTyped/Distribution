package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashVancouver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `256` extends StObject {
  
  var a: AmericaSlashVancouver
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `256` {
  
  inline def apply(): `256` = {
    val __obj = js.Dynamic.literal(a = "America/Vancouver", r = 1)
    __obj.asInstanceOf[`256`]
  }
  
  extension [Self <: `256`](x: Self) {
    
    inline def setA(value: AmericaSlashVancouver): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
