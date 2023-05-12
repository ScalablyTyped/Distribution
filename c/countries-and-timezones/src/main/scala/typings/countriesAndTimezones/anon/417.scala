package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashWarsaw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `417` extends StObject {
  
  var a: EuropeSlashWarsaw
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `417` {
  
  inline def apply(): `417` = {
    val __obj = js.Dynamic.literal(a = "Europe/Warsaw", r = 1)
    __obj.asInstanceOf[`417`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `417`] (val x: Self) extends AnyVal {
    
    inline def setA(value: EuropeSlashWarsaw): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
