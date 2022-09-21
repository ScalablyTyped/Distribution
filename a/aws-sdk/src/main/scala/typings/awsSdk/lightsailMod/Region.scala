package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  /**
    * The Availability Zones. Follows the format us-east-2a (case-sensitive).
    */
  var availabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  
  /**
    * The continent code (e.g., NA, meaning North America).
    */
  var continentCode: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the AWS Region (e.g., This region is recommended to serve users in the eastern United States and eastern Canada).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The display name (e.g., Ohio).
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The region name (e.g., us-east-2).
    */
  var name: js.UndefOr[RegionName] = js.undefined
  
  /**
    * The Availability Zones for databases. Follows the format us-east-2a (case-sensitive).
    */
  var relationalDatabaseAvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
}
object Region {
  
  inline def apply(): Region = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Region]
  }
  
  extension [Self <: Region](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "availabilityZones", js.Array(value*))
    
    inline def setContinentCode(value: String): Self = StObject.set(x, "continentCode", value.asInstanceOf[js.Any])
    
    inline def setContinentCodeUndefined: Self = StObject.set(x, "continentCode", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: RegionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRelationalDatabaseAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "relationalDatabaseAvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabaseAvailabilityZonesUndefined: Self = StObject.set(x, "relationalDatabaseAvailabilityZones", js.undefined)
    
    inline def setRelationalDatabaseAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "relationalDatabaseAvailabilityZones", js.Array(value*))
  }
}
