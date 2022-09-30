package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNew_York
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422` extends StObject {
  
  var a: AmericaSlashNew_York
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `422` {
  
  inline def apply(): `422` = {
    val __obj = js.Dynamic.literal(a = "America/New_York", r = 1)
    __obj.asInstanceOf[`422`]
  }
  
  extension [Self <: `422`](x: Self) {
    
    inline def setA(value: AmericaSlashNew_York): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
