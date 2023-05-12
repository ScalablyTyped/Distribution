package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIqaluit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  var a: AmericaSlashIqaluit
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `110` {
  
  inline def apply(): `110` = {
    val __obj = js.Dynamic.literal(a = "America/Iqaluit", r = 1)
    __obj.asInstanceOf[`110`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `110`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashIqaluit): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
