package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashJamaica
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `366` extends StObject {
  
  var a: AmericaSlashJamaica
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `366` {
  
  inline def apply(): `366` = {
    val __obj = js.Dynamic.literal(a = "America/Jamaica", r = 1)
    __obj.asInstanceOf[`366`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `366`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashJamaica): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
