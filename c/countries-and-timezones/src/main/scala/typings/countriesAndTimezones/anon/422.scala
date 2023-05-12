package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAnchorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422` extends StObject {
  
  var a: AmericaSlashAnchorage
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `422` {
  
  inline def apply(): `422` = {
    val __obj = js.Dynamic.literal(a = "America/Anchorage", r = 1)
    __obj.asInstanceOf[`422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `422`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashAnchorage): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
