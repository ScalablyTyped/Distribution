package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashJujuy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `89` extends StObject {
  
  var a: AmericaSlashArgentinaSlashJujuy
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `89` {
  
  inline def apply(): `89` = {
    val __obj = js.Dynamic.literal(a = "America/Argentina/Jujuy", r = 1)
    __obj.asInstanceOf[`89`]
  }
  
  extension [Self <: `89`](x: Self) {
    
    inline def setA(value: AmericaSlashArgentinaSlashJujuy): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
