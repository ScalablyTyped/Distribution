package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashHalifax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `256` extends StObject {
  
  var a: AmericaSlashHalifax
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `256` {
  
  inline def apply(): `256` = {
    val __obj = js.Dynamic.literal(a = "America/Halifax", r = 1)
    __obj.asInstanceOf[`256`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `256`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashHalifax): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
