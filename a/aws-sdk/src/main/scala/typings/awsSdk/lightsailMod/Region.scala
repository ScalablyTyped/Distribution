package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Region extends StObject {
  
  /**
    * The Availability Zones. Follows the format us-east-2a (case-sensitive).
    */
  var availabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  
  /**
    * The continent code (e.g., NA, meaning North America).
    */
  var continentCode: js.UndefOr[String] = js.native
  
  /**
    * The description of the AWS Region (e.g., This region is recommended to serve users in the eastern United States and eastern Canada).
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The display name (e.g., Ohio).
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The region name (e.g., us-east-2).
    */
  var name: js.UndefOr[RegionName] = js.native
  
  /**
    * The Availability Zones for databases. Follows the format us-east-2a (case-sensitive).
    */
  var relationalDatabaseAvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
}
object Region {
  
  @scala.inline
  def apply(): Region = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setContinentCode(value: String): Self = StObject.set(x, "continentCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinentCodeUndefined: Self = StObject.set(x, "continentCode", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: RegionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "relationalDatabaseAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseAvailabilityZonesUndefined: Self = StObject.set(x, "relationalDatabaseAvailabilityZones", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "relationalDatabaseAvailabilityZones", js.Array(value :_*))
  }
}
