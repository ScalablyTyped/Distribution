package typings.countriesAndTimezones.anon

import typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashQatar
import typings.countriesAndTimezones.countriesAndTimezonesStrings.BH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `156` extends StObject {
  
  var a: AsiaSlashQatar
  
  var c: js.Array[BH]
  
  var r: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `156` {
  
  inline def apply(c: js.Array[BH]): `156` = {
    val __obj = js.Dynamic.literal(a = "Asia/Qatar", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`156`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `156`] (val x: Self) extends AnyVal {
    
    inline def setA(value: AsiaSlashQatar): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[BH]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BH*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typings.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
