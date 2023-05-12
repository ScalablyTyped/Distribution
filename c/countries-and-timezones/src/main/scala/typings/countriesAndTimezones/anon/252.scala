package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSao_Paulo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `252` extends StObject {
  
  var a: AmericaSlashSao_Paulo
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `252` {
  
  inline def apply(): `252` = {
    val __obj = js.Dynamic.literal(a = "America/Sao_Paulo", r = 1)
    __obj.asInstanceOf[`252`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `252`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashSao_Paulo): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
