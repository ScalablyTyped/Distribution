package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashEaster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `263` extends StObject {
  
  var a: PacificSlashEaster
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `263` {
  
  inline def apply(): `263` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Easter", r = 1)
    __obj.asInstanceOf[`263`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `263`] (val x: Self) extends AnyVal {
    
    inline def setA(value: PacificSlashEaster): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
