package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashWinnipeg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118` extends StObject {
  
  var a: AmericaSlashWinnipeg
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `118` {
  
  inline def apply(): `118` = {
    val __obj = js.Dynamic.literal(a = "America/Winnipeg", r = 1)
    __obj.asInstanceOf[`118`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `118`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashWinnipeg): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
