package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashWhitehorse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `258` extends StObject {
  
  var a: AmericaSlashWhitehorse
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `258` {
  
  inline def apply(): `258` = {
    val __obj = js.Dynamic.literal(a = "America/Whitehorse", r = 1)
    __obj.asInstanceOf[`258`]
  }
  
  extension [Self <: `258`](x: Self) {
    
    inline def setA(value: AmericaSlashWhitehorse): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
