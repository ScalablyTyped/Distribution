package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDetroit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `424` extends StObject {
  
  var a: AmericaSlashDetroit
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `424` {
  
  inline def apply(): `424` = {
    val __obj = js.Dynamic.literal(a = "America/Detroit", r = 1)
    __obj.asInstanceOf[`424`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `424`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashDetroit): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
