package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashKanton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `380` extends StObject {
  
  var a: PacificSlashKanton
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `380` {
  
  inline def apply(): `380` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Kanton", r = 1)
    __obj.asInstanceOf[`380`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `380`] (val x: Self) extends AnyVal {
    
    inline def setA(value: PacificSlashKanton): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
