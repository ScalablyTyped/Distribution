package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashHong_Kong
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `353` extends StObject {
  
  var a: AsiaSlashHong_Kong
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `353` {
  
  inline def apply(): `353` = {
    val __obj = js.Dynamic.literal(a = "Asia/Hong_Kong", r = 1)
    __obj.asInstanceOf[`353`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `353`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashHong_Kong): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
