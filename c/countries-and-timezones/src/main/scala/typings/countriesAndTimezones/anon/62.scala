package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPanama
import typings.countriesAndTimezones.countriesAndTimezonesStrings.KY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  var a: AmericaSlashPanama
  
  var c: js.Array[KY]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `62` {
  
  inline def apply(c: js.Array[KY]): `62` = {
    val __obj = js.Dynamic.literal(a = "America/Panama", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`62`]
  }
  
  extension [Self <: `62`](x: Self) {
    
    inline def setA(value: AmericaSlashPanama): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[KY]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: KY*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
