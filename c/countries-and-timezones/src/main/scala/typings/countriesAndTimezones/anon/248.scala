package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashMelbourne
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `248` extends StObject {
  
  var a: AustraliaSlashMelbourne
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `248` {
  
  inline def apply(): `248` = {
    val __obj = js.Dynamic.literal(a = "Australia/Melbourne", r = 1)
    __obj.asInstanceOf[`248`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `248`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AustraliaSlashMelbourne): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
