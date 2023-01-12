package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashUrumqi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `183` extends StObject {
  
  var a: AsiaSlashUrumqi
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `183` {
  
  inline def apply(): `183` = {
    val __obj = js.Dynamic.literal(a = "Asia/Urumqi", r = 1)
    __obj.asInstanceOf[`183`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `183`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashUrumqi): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
