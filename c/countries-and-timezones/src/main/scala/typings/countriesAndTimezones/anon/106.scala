package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashToronto
import typings.countriesAndTimezones.countriesAndTimezonesStrings.BS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `106` extends StObject {
  
  var a: AmericaSlashToronto
  
  var c: js.Array[BS]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `106` {
  
  inline def apply(c: js.Array[BS]): `106` = {
    val __obj = js.Dynamic.literal(a = "America/Toronto", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`106`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `106`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AmericaSlashToronto): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[BS]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BS*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
