package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKolkata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160` extends StObject {
  
  var a: AsiaSlashKolkata
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `160` {
  
  inline def apply(): `160` = {
    val __obj = js.Dynamic.literal(a = "Asia/Kolkata", r = 1)
    __obj.asInstanceOf[`160`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `160`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashKolkata): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
