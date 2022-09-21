package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSingapore
import typings.countriesAndTimezones.countriesAndTimezonesStrings.SG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `418` extends StObject {
  
  var a: AsiaSlashSingapore
  
  var c: js.Array[SG]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`
}
object `418` {
  
  inline def apply(c: js.Array[SG]): `418` = {
    val __obj = js.Dynamic.literal(a = "Asia/Singapore", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`418`]
  }
  
  extension [Self <: `418`](x: Self) {
    
    inline def setA(value: AsiaSlashSingapore): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[SG]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: SG*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesNumbers.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
