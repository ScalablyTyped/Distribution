package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends StObject {
  
  /**
    * The available port speeds for the location.
    */
  var availablePortSpeeds: js.UndefOr[AvailablePortSpeeds] = js.native
  
  /**
    * The name of the service provider for the location.
    */
  var availableProviders: js.UndefOr[ProviderList] = js.native
  
  /**
    * The code for the location.
    */
  var locationCode: js.UndefOr[LocationCode] = js.native
  
  /**
    * The name of the location. This includes the name of the colocation partner and the physical site of the building.
    */
  var locationName: js.UndefOr[LocationName] = js.native
  
  /**
    * The AWS Region for the location.
    */
  var region: js.UndefOr[Region] = js.native
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailablePortSpeeds(value: AvailablePortSpeeds): Self = StObject.set(x, "availablePortSpeeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailablePortSpeedsUndefined: Self = StObject.set(x, "availablePortSpeeds", js.undefined)
    
    @scala.inline
    def setAvailablePortSpeedsVarargs(value: PortSpeed*): Self = StObject.set(x, "availablePortSpeeds", js.Array(value :_*))
    
    @scala.inline
    def setAvailableProviders(value: ProviderList): Self = StObject.set(x, "availableProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableProvidersUndefined: Self = StObject.set(x, "availableProviders", js.undefined)
    
    @scala.inline
    def setAvailableProvidersVarargs(value: ProviderName*): Self = StObject.set(x, "availableProviders", js.Array(value :_*))
    
    @scala.inline
    def setLocationCode(value: LocationCode): Self = StObject.set(x, "locationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationCodeUndefined: Self = StObject.set(x, "locationCode", js.undefined)
    
    @scala.inline
    def setLocationName(value: LocationName): Self = StObject.set(x, "locationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNameUndefined: Self = StObject.set(x, "locationName", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
