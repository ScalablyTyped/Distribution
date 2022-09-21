package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashShanghai
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `163` extends StObject {
  
  var a: AsiaSlashShanghai
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `163` {
  
  inline def apply(): `163` = {
    val __obj = js.Dynamic.literal(a = "Asia/Shanghai", r = 1)
    __obj.asInstanceOf[`163`]
  }
  
  extension [Self <: `163`](x: Self) {
    
    inline def setA(value: AsiaSlashShanghai): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
