package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.DECOMMISSIONED
import typings.consumerDataStandards.consumerDataStandardsStrings.FOSSIL
import typings.consumerDataStandards.consumerDataStandardsStrings.GEOTHERMAL
import typings.consumerDataStandards.consumerDataStandardsStrings.HYDRO
import typings.consumerDataStandards.consumerDataStandardsStrings.INACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.RENEWABLE
import typings.consumerDataStandards.consumerDataStandardsStrings.SOLAR_PV
import typings.consumerDataStandards.consumerDataStandardsStrings.STORAGE
import typings.consumerDataStandards.consumerDataStandardsStrings.WIND
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Number of devices in the group of DER devices
    */
  var count: Double
  
  /**
    * Unique identifier for a single DER device or a group of DER devices with the same attributes. Does not align with CDR ID permanence standards
    */
  var deviceIdentifier: Double
  
  /**
    * The name of the device manufacturer. If absent then assumed to be “unknown”
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /**
    * The model number of the device. If absent then assumed to be “unknown”
    */
  var modelNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum output in kVA that is listed in the product specification by the manufacturer. This refers to the capacity of each unit within the device group
    */
  var nominalRatedCapacity: Double
  
  /**
    * Maximum storage capacity in kVAh. This refers to the capacity of each storage module within the device group. Mandatory if type is equal to “STORAGE”
    */
  var nominalStorageCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Code used to indicate the status of the device. This will be used to identify if an inverter is active or inactive or decommissioned
    */
  var status: js.UndefOr[ACTIVE | INACTIVE | DECOMMISSIONED] = js.undefined
  
  /**
    * Used to indicate the primary technology used in the DER device. This field is also used to record for example the battery chemistry, or the type of PV panel. It is also used to record if a battery is contained in an electric vehicle connected in a vehicle-to-grid arrangement. If absent then assumed to be “other”
    */
  var subtype: js.UndefOr[String] = js.undefined
  
  /**
    * Used to indicate the primary technology used in the DER device
    */
  var `type`: FOSSIL | HYDRO | WIND | SOLAR_PV | RENEWABLE | GEOTHERMAL | STORAGE | OTHER
}
object Count {
  
  inline def apply(
    count: Double,
    deviceIdentifier: Double,
    nominalRatedCapacity: Double,
    `type`: FOSSIL | HYDRO | WIND | SOLAR_PV | RENEWABLE | GEOTHERMAL | STORAGE | OTHER
  ): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], deviceIdentifier = deviceIdentifier.asInstanceOf[js.Any], nominalRatedCapacity = nominalRatedCapacity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdentifier(value: Double): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setModelNumber(value: String): Self = StObject.set(x, "modelNumber", value.asInstanceOf[js.Any])
    
    inline def setModelNumberUndefined: Self = StObject.set(x, "modelNumber", js.undefined)
    
    inline def setNominalRatedCapacity(value: Double): Self = StObject.set(x, "nominalRatedCapacity", value.asInstanceOf[js.Any])
    
    inline def setNominalStorageCapacity(value: Double): Self = StObject.set(x, "nominalStorageCapacity", value.asInstanceOf[js.Any])
    
    inline def setNominalStorageCapacityUndefined: Self = StObject.set(x, "nominalStorageCapacity", js.undefined)
    
    inline def setStatus(value: ACTIVE | INACTIVE | DECOMMISSIONED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setType(value: FOSSIL | HYDRO | WIND | SOLAR_PV | RENEWABLE | GEOTHERMAL | STORAGE | OTHER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
