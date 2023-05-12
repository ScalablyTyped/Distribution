package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRio_Branco
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  var a: AmericaSlashRio_Branco
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `115` {
  
  inline def apply(): `115` = {
    val __obj = js.Dynamic.literal(a = "America/Rio_Branco", r = 1)
    __obj.asInstanceOf[`115`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `115`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashRio_Branco): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
