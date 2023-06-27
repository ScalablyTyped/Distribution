package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkRates
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of feed in rates
    */
  var rates: js.Array[UnitPrice]
}
object DictkRates {
  
  inline def apply(rates: js.Array[UnitPrice]): DictkRates = {
    val __obj = js.Dynamic.literal(rates = rates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkRates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkRates] (val x: Self) extends AnyVal {
    
    inline def setRates(value: js.Array[UnitPrice]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    
    inline def setRatesVarargs(value: UnitPrice*): Self = StObject.set(x, "rates", js.Array(value*))
  }
}
