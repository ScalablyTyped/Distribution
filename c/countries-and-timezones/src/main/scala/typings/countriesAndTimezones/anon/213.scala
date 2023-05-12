package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashJerusalem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `213` extends StObject {
  
  var a: AsiaSlashJerusalem
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `213` {
  
  inline def apply(): `213` = {
    val __obj = js.Dynamic.literal(a = "Asia/Jerusalem", r = 1)
    __obj.asInstanceOf[`213`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `213`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashJerusalem): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
