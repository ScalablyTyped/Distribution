package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDhaka
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  var a: AsiaSlashDhaka
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `168` {
  
  inline def apply(): `168` = {
    val __obj = js.Dynamic.literal(a = "Asia/Dhaka", r = 1)
    __obj.asInstanceOf[`168`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `168`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashDhaka): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
