package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPuerto_Rico
import typings.countriesAndTimezones.countriesAndTimezonesStrings.KN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `127` extends StObject {
  
  var a: AmericaSlashPuerto_Rico
  
  var c: js.Array[KN]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `127` {
  
  inline def apply(c: js.Array[KN]): `127` = {
    val __obj = js.Dynamic.literal(a = "America/Puerto_Rico", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`127`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `127`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashPuerto_Rico): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[KN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: KN*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
