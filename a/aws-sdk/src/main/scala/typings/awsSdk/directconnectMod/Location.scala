package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  /**
    * The available MAC Security (MACsec) port speeds for the location.
    */
  var availableMacSecPortSpeeds: js.UndefOr[AvailableMacSecPortSpeeds] = js.undefined
  
  /**
    * The available port speeds for the location.
    */
  var availablePortSpeeds: js.UndefOr[AvailablePortSpeeds] = js.undefined
  
  /**
    * The name of the service provider for the location.
    */
  var availableProviders: js.UndefOr[ProviderList] = js.undefined
  
  /**
    * The code for the location.
    */
  var locationCode: js.UndefOr[LocationCode] = js.undefined
  
  /**
    * The name of the location. This includes the name of the colocation partner and the physical site of the building.
    */
  var locationName: js.UndefOr[LocationName] = js.undefined
  
  /**
    * The Amazon Web Services Region for the location.
    */
  var region: js.UndefOr[Region] = js.undefined
}
object Location {
  
  inline def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setAvailableMacSecPortSpeeds(value: AvailableMacSecPortSpeeds): Self = StObject.set(x, "availableMacSecPortSpeeds", value.asInstanceOf[js.Any])
    
    inline def setAvailableMacSecPortSpeedsUndefined: Self = StObject.set(x, "availableMacSecPortSpeeds", js.undefined)
    
    inline def setAvailableMacSecPortSpeedsVarargs(value: PortSpeed*): Self = StObject.set(x, "availableMacSecPortSpeeds", js.Array(value*))
    
    inline def setAvailablePortSpeeds(value: AvailablePortSpeeds): Self = StObject.set(x, "availablePortSpeeds", value.asInstanceOf[js.Any])
    
    inline def setAvailablePortSpeedsUndefined: Self = StObject.set(x, "availablePortSpeeds", js.undefined)
    
    inline def setAvailablePortSpeedsVarargs(value: PortSpeed*): Self = StObject.set(x, "availablePortSpeeds", js.Array(value*))
    
    inline def setAvailableProviders(value: ProviderList): Self = StObject.set(x, "availableProviders", value.asInstanceOf[js.Any])
    
    inline def setAvailableProvidersUndefined: Self = StObject.set(x, "availableProviders", js.undefined)
    
    inline def setAvailableProvidersVarargs(value: ProviderName*): Self = StObject.set(x, "availableProviders", js.Array(value*))
    
    inline def setLocationCode(value: LocationCode): Self = StObject.set(x, "locationCode", value.asInstanceOf[js.Any])
    
    inline def setLocationCodeUndefined: Self = StObject.set(x, "locationCode", js.undefined)
    
    inline def setLocationName(value: LocationName): Self = StObject.set(x, "locationName", value.asInstanceOf[js.Any])
    
    inline def setLocationNameUndefined: Self = StObject.set(x, "locationName", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
