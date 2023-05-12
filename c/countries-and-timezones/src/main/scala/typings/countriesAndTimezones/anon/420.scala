package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSeoul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `420` extends StObject {
  
  var a: AsiaSlashSeoul
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `420` {
  
  inline def apply(): `420` = {
    val __obj = js.Dynamic.literal(a = "Asia/Seoul", r = 1)
    __obj.asInstanceOf[`420`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `420`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashSeoul): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
