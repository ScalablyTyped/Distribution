package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
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

trait MeasureUnit
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The measurement unit of rate. Assumed to be KWH if absent
    */
  var measureUnit: js.UndefOr[KWH | KVA | KVAR | KVARH | KW | DAYS | METER | MONTH] = js.undefined
  
  /**
    * Unit price of usage per  measure unit (exclusive of GST)
    */
  var unitPrice: String
  
  /**
    * Volume in kWh that this rate applies to.  Only applicable for ‘stepped’ rates where different rates apply for different volumes of usage in a period
    */
  var volume: js.UndefOr[Double] = js.undefined
}
object MeasureUnit {
  
  inline def apply(unitPrice: String): MeasureUnit = {
    val __obj = js.Dynamic.literal(unitPrice = unitPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureUnit]
  }
  
  extension [Self <: MeasureUnit](x: Self) {
    
    inline def setMeasureUnit(value: KWH | KVA | KVAR | KVARH | KW | DAYS | METER | MONTH): Self = StObject.set(x, "measureUnit", value.asInstanceOf[js.Any])
    
    inline def setMeasureUnitUndefined: Self = StObject.set(x, "measureUnit", js.undefined)
    
    inline def setUnitPrice(value: String): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
