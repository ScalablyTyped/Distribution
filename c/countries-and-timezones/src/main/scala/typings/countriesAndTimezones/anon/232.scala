package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashSydney
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `232` extends StObject {
  
  var a: AustraliaSlashSydney
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `232` {
  
  inline def apply(): `232` = {
    val __obj = js.Dynamic.literal(a = "Australia/Sydney", r = 1)
    __obj.asInstanceOf[`232`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `232`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AustraliaSlashSydney): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
