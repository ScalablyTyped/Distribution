package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashReykjavik
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `350` extends StObject {
  
  var a: AtlanticSlashReykjavik
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `350` {
  
  inline def apply(): `350` = {
    val __obj = js.Dynamic.literal(a = "Atlantic/Reykjavik", r = 1)
    __obj.asInstanceOf[`350`]
  }
  
  extension [Self <: `350`](x: Self) {
    
    inline def setA(value: AtlanticSlashReykjavik): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
