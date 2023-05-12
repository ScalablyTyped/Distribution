package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSantiago
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `262` extends StObject {
  
  var a: AmericaSlashSantiago
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `262` {
  
  inline def apply(): `262` = {
    val __obj = js.Dynamic.literal(a = "America/Santiago", r = 1)
    __obj.asInstanceOf[`262`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `262`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashSantiago): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
