package typings.consumerDataStandards.anon

import typings.consumerDataStandards.consumerDataStandardsStrings.DAYS
import typings.consumerDataStandards.consumerDataStandardsStrings.KVA
import typings.consumerDataStandards.consumerDataStandardsStrings.KVAR
import typings.consumerDataStandards.consumerDataStandardsStrings.KVARH
import typings.consumerDataStandards.consumerDataStandardsStrings.KW
import typings.consumerDataStandards.consumerDataStandardsStrings.KWH
import typings.consumerDataStandards.consumerDataStandardsStrings.METER
import typings.consumerDataStandards.consumerDataStandardsStrings.MONTH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitPrice extends StObject {
  
  var measureUnit: js.UndefOr[KWH | KVA | KVAR | KVARH | KW | DAYS | METER | MONTH] = js.undefined
  
  var unitPrice: String
  
  var volume: js.UndefOr[Double] = js.undefined
}
object UnitPrice {
  
  inline def apply(unitPrice: String): UnitPrice = {
    val __obj = js.Dynamic.literal(unitPrice = unitPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitPrice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnitPrice] (val x: Self) extends AnyVal {
    
    inline def setMeasureUnit(value: KWH | KVA | KVAR | KVARH | KW | DAYS | METER | MONTH): Self = StObject.set(x, "measureUnit", value.asInstanceOf[js.Any])
    
    inline def setMeasureUnitUndefined: Self = StObject.set(x, "measureUnit", js.undefined)
    
    inline def setUnitPrice(value: String): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
