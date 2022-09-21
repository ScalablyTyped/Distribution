package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSeoul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `417` extends StObject {
  
  var a: AsiaSlashSeoul
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `417` {
  
  inline def apply(): `417` = {
    val __obj = js.Dynamic.literal(a = "Asia/Seoul", r = 1)
    __obj.asInstanceOf[`417`]
  }
  
  extension [Self <: `417`](x: Self) {
    
    inline def setA(value: AsiaSlashSeoul): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
