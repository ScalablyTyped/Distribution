package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitPrice
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Unit price of usage per kWh (exclusive of GST)
    */
  var unitPrice: String
  
  /**
    * Volume in kWh that this rate applies to.  Only applicable for ‘stepped’ rates where different rates apply for different volumes of usage in a period
    */
  var volume: js.UndefOr[Double] = js.undefined
}
object UnitPrice {
  
  inline def apply(unitPrice: String): UnitPrice = {
    val __obj = js.Dynamic.literal(unitPrice = unitPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitPrice]
  }
  
  extension [Self <: UnitPrice](x: Self) {
    
    inline def setUnitPrice(value: String): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
