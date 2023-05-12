package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAshgabat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `154` extends StObject {
  
  var a: AsiaSlashAshgabat
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `154` {
  
  inline def apply(): `154` = {
    val __obj = js.Dynamic.literal(a = "Asia/Ashgabat", r = 1)
    __obj.asInstanceOf[`154`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `154`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashAshgabat): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
