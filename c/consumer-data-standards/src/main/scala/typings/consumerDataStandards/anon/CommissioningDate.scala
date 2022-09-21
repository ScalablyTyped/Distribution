package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.DECOMMISSIONED
import typings.consumerDataStandards.consumerDataStandardsStrings.INACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.INVERTER
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommissioningDate
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The date that the DER installation is commissioned
    */
  var commissioningDate: String
  
  /**
    * AC Connection ID as defined in the DER register.  Does not align with CDR ID permanence standards
    */
  var connectionIdentifier: Double
  
  /**
    * Number of AC Connections in the group. For the suite of AC Connections to be considered as a group, all of the AC Connections included must have the same attributes
    */
  var count: Double
  
  var derDevices: js.Array[Count]
  
  /**
    * Indicates whether the DER device is connected via an inverter (and what category of inverter it is) or not (e.g. rotating machine). If absent, assume equipment type to be “OTHER”.
    */
  var equipmentType: js.UndefOr[INVERTER | OTHER] = js.undefined
  
  /**
    * The rated AC output power that is listed in the product specified by the manufacturer. Mandatory if equipmentType is INVERTER
    */
  var inverterDeviceCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The inverter model number. Mandatory if equipmentType is INVERTER
    */
  var inverterModelNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The inverter series. Mandatory if equipmentType is INVERTER
    */
  var inverterSeries: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the inverter manufacturer. Mandatory if equipmentType is INVERTER
    */
  var manufacturerName: js.UndefOr[String] = js.undefined
  
  /**
    * Code used to indicate the status of the Inverter. This will be used to identify if an inverter is active or inactive or decommissioned
    */
  var status: ACTIVE | INACTIVE | DECOMMISSIONED
}
object CommissioningDate {
  
  inline def apply(
    commissioningDate: String,
    connectionIdentifier: Double,
    count: Double,
    derDevices: js.Array[Count],
    status: ACTIVE | INACTIVE | DECOMMISSIONED
  ): CommissioningDate = {
    val __obj = js.Dynamic.literal(commissioningDate = commissioningDate.asInstanceOf[js.Any], connectionIdentifier = connectionIdentifier.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], derDevices = derDevices.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommissioningDate]
  }
  
  extension [Self <: CommissioningDate](x: Self) {
    
    inline def setCommissioningDate(value: String): Self = StObject.set(x, "commissioningDate", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdentifier(value: Double): Self = StObject.set(x, "connectionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDerDevices(value: js.Array[Count]): Self = StObject.set(x, "derDevices", value.asInstanceOf[js.Any])
    
    inline def setDerDevicesVarargs(value: Count*): Self = StObject.set(x, "derDevices", js.Array(value*))
    
    inline def setEquipmentType(value: INVERTER | OTHER): Self = StObject.set(x, "equipmentType", value.asInstanceOf[js.Any])
    
    inline def setEquipmentTypeUndefined: Self = StObject.set(x, "equipmentType", js.undefined)
    
    inline def setInverterDeviceCapacity(value: Double): Self = StObject.set(x, "inverterDeviceCapacity", value.asInstanceOf[js.Any])
    
    inline def setInverterDeviceCapacityUndefined: Self = StObject.set(x, "inverterDeviceCapacity", js.undefined)
    
    inline def setInverterModelNumber(value: String): Self = StObject.set(x, "inverterModelNumber", value.asInstanceOf[js.Any])
    
    inline def setInverterModelNumberUndefined: Self = StObject.set(x, "inverterModelNumber", js.undefined)
    
    inline def setInverterSeries(value: String): Self = StObject.set(x, "inverterSeries", value.asInstanceOf[js.Any])
    
    inline def setInverterSeriesUndefined: Self = StObject.set(x, "inverterSeries", js.undefined)
    
    inline def setManufacturerName(value: String): Self = StObject.set(x, "manufacturerName", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNameUndefined: Self = StObject.set(x, "manufacturerName", js.undefined)
    
    inline def setStatus(value: ACTIVE | INACTIVE | DECOMMISSIONED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
