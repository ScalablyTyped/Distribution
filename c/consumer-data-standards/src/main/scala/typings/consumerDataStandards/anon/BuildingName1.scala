package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingName1
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Building/Property name 1
    */
  var buildingName1: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Building/Property name 2
    */
  var buildingName2: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier for an address as defined by Australia Post.  Also known as Delivery Point Identifier
    */
  var dpid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unit number (including suffix, if applicable)
    */
  var flatUnitNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of flat or unit for the address
    */
  var flatUnitType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Floor or level number (including alpha characters)
    */
  var floorLevelNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of floor or level for the address
    */
  var floorLevelType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Full name of locality
    */
  var localityName: String
  
  /**
    * Allotment number for the address
    */
  var lotNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Postal delivery number if the address is a postal delivery type
    */
  var postalDeliveryNumber: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Postal delivery number prefix related to the postal delivery number
    */
  var postalDeliveryNumberPrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Postal delivery number suffix related to the postal delivery number
    */
  var postalDeliveryNumberSuffix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Postal delivery type. (eg. PO BOX). Valid enumeration defined by Australia Post PAF code file
    */
  var postalDeliveryType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Postcode for the locality
    */
  var postcode: String
  
  /**
    * State in which the address belongs. Valid enumeration defined by Australia Post PAF code file [State Type Abbreviation](https://auspost.com.au/content/dam/auspost_corp/media/documents/australia-post-data-guide.pdf). NSW, QLD, VIC, NT, WA, SA, TAS, ACT, AAT
    */
  var state: String
  
  /**
    * The name of the street
    */
  var streetName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The street type suffix. Valid enumeration defined by Australia Post PAF code file
    */
  var streetSuffix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The street type. Valid enumeration defined by Australia Post PAF code file
    */
  var streetType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Thoroughfare number for a property (first number in a property ranged address)
    */
  var thoroughfareNumber1: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Suffix for the thoroughfare number. Only relevant is thoroughfareNumber1 is populated
    */
  var thoroughfareNumber1Suffix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Second thoroughfare number (only used if the property has a ranged address eg 23-25)
    */
  var thoroughfareNumber2: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Suffix for the second thoroughfare number. Only relevant is thoroughfareNumber2 is populated
    */
  var thoroughfareNumber2Suffix: js.UndefOr[String | Null] = js.undefined
}
object BuildingName1 {
  
  inline def apply(localityName: String, postcode: String, state: String): BuildingName1 = {
    val __obj = js.Dynamic.literal(localityName = localityName.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingName1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildingName1] (val x: Self) extends AnyVal {
    
    inline def setBuildingName1(value: String): Self = StObject.set(x, "buildingName1", value.asInstanceOf[js.Any])
    
    inline def setBuildingName1Null: Self = StObject.set(x, "buildingName1", null)
    
    inline def setBuildingName1Undefined: Self = StObject.set(x, "buildingName1", js.undefined)
    
    inline def setBuildingName2(value: String): Self = StObject.set(x, "buildingName2", value.asInstanceOf[js.Any])
    
    inline def setBuildingName2Null: Self = StObject.set(x, "buildingName2", null)
    
    inline def setBuildingName2Undefined: Self = StObject.set(x, "buildingName2", js.undefined)
    
    inline def setDpid(value: String): Self = StObject.set(x, "dpid", value.asInstanceOf[js.Any])
    
    inline def setDpidNull: Self = StObject.set(x, "dpid", null)
    
    inline def setDpidUndefined: Self = StObject.set(x, "dpid", js.undefined)
    
    inline def setFlatUnitNumber(value: String): Self = StObject.set(x, "flatUnitNumber", value.asInstanceOf[js.Any])
    
    inline def setFlatUnitNumberNull: Self = StObject.set(x, "flatUnitNumber", null)
    
    inline def setFlatUnitNumberUndefined: Self = StObject.set(x, "flatUnitNumber", js.undefined)
    
    inline def setFlatUnitType(value: String): Self = StObject.set(x, "flatUnitType", value.asInstanceOf[js.Any])
    
    inline def setFlatUnitTypeNull: Self = StObject.set(x, "flatUnitType", null)
    
    inline def setFlatUnitTypeUndefined: Self = StObject.set(x, "flatUnitType", js.undefined)
    
    inline def setFloorLevelNumber(value: String): Self = StObject.set(x, "floorLevelNumber", value.asInstanceOf[js.Any])
    
    inline def setFloorLevelNumberNull: Self = StObject.set(x, "floorLevelNumber", null)
    
    inline def setFloorLevelNumberUndefined: Self = StObject.set(x, "floorLevelNumber", js.undefined)
    
    inline def setFloorLevelType(value: String): Self = StObject.set(x, "floorLevelType", value.asInstanceOf[js.Any])
    
    inline def setFloorLevelTypeNull: Self = StObject.set(x, "floorLevelType", null)
    
    inline def setFloorLevelTypeUndefined: Self = StObject.set(x, "floorLevelType", js.undefined)
    
    inline def setLocalityName(value: String): Self = StObject.set(x, "localityName", value.asInstanceOf[js.Any])
    
    inline def setLotNumber(value: String): Self = StObject.set(x, "lotNumber", value.asInstanceOf[js.Any])
    
    inline def setLotNumberNull: Self = StObject.set(x, "lotNumber", null)
    
    inline def setLotNumberUndefined: Self = StObject.set(x, "lotNumber", js.undefined)
    
    inline def setPostalDeliveryNumber(value: Double): Self = StObject.set(x, "postalDeliveryNumber", value.asInstanceOf[js.Any])
    
    inline def setPostalDeliveryNumberNull: Self = StObject.set(x, "postalDeliveryNumber", null)
    
    inline def setPostalDeliveryNumberPrefix(value: String): Self = StObject.set(x, "postalDeliveryNumberPrefix", value.asInstanceOf[js.Any])
    
    inline def setPostalDeliveryNumberPrefixNull: Self = StObject.set(x, "postalDeliveryNumberPrefix", null)
    
    inline def setPostalDeliveryNumberPrefixUndefined: Self = StObject.set(x, "postalDeliveryNumberPrefix", js.undefined)
    
    inline def setPostalDeliveryNumberSuffix(value: String): Self = StObject.set(x, "postalDeliveryNumberSuffix", value.asInstanceOf[js.Any])
    
    inline def setPostalDeliveryNumberSuffixNull: Self = StObject.set(x, "postalDeliveryNumberSuffix", null)
    
    inline def setPostalDeliveryNumberSuffixUndefined: Self = StObject.set(x, "postalDeliveryNumberSuffix", js.undefined)
    
    inline def setPostalDeliveryNumberUndefined: Self = StObject.set(x, "postalDeliveryNumber", js.undefined)
    
    inline def setPostalDeliveryType(value: String): Self = StObject.set(x, "postalDeliveryType", value.asInstanceOf[js.Any])
    
    inline def setPostalDeliveryTypeNull: Self = StObject.set(x, "postalDeliveryType", null)
    
    inline def setPostalDeliveryTypeUndefined: Self = StObject.set(x, "postalDeliveryType", js.undefined)
    
    inline def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStreetName(value: String): Self = StObject.set(x, "streetName", value.asInstanceOf[js.Any])
    
    inline def setStreetNameNull: Self = StObject.set(x, "streetName", null)
    
    inline def setStreetNameUndefined: Self = StObject.set(x, "streetName", js.undefined)
    
    inline def setStreetSuffix(value: String): Self = StObject.set(x, "streetSuffix", value.asInstanceOf[js.Any])
    
    inline def setStreetSuffixNull: Self = StObject.set(x, "streetSuffix", null)
    
    inline def setStreetSuffixUndefined: Self = StObject.set(x, "streetSuffix", js.undefined)
    
    inline def setStreetType(value: String): Self = StObject.set(x, "streetType", value.asInstanceOf[js.Any])
    
    inline def setStreetTypeNull: Self = StObject.set(x, "streetType", null)
    
    inline def setStreetTypeUndefined: Self = StObject.set(x, "streetType", js.undefined)
    
    inline def setThoroughfareNumber1(value: Double): Self = StObject.set(x, "thoroughfareNumber1", value.asInstanceOf[js.Any])
    
    inline def setThoroughfareNumber1Null: Self = StObject.set(x, "thoroughfareNumber1", null)
    
    inline def setThoroughfareNumber1Suffix(value: String): Self = StObject.set(x, "thoroughfareNumber1Suffix", value.asInstanceOf[js.Any])
    
    inline def setThoroughfareNumber1SuffixNull: Self = StObject.set(x, "thoroughfareNumber1Suffix", null)
    
    inline def setThoroughfareNumber1SuffixUndefined: Self = StObject.set(x, "thoroughfareNumber1Suffix", js.undefined)
    
    inline def setThoroughfareNumber1Undefined: Self = StObject.set(x, "thoroughfareNumber1", js.undefined)
    
    inline def setThoroughfareNumber2(value: Double): Self = StObject.set(x, "thoroughfareNumber2", value.asInstanceOf[js.Any])
    
    inline def setThoroughfareNumber2Null: Self = StObject.set(x, "thoroughfareNumber2", null)
    
    inline def setThoroughfareNumber2Suffix(value: String): Self = StObject.set(x, "thoroughfareNumber2Suffix", value.asInstanceOf[js.Any])
    
    inline def setThoroughfareNumber2SuffixNull: Self = StObject.set(x, "thoroughfareNumber2Suffix", null)
    
    inline def setThoroughfareNumber2SuffixUndefined: Self = StObject.set(x, "thoroughfareNumber2Suffix", js.undefined)
    
    inline def setThoroughfareNumber2Undefined: Self = StObject.set(x, "thoroughfareNumber2", js.undefined)
  }
}
