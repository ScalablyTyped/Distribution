package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionsInfo extends StObject {
  
  /**
    * Lists the Regions where the directory has been replicated, excluding the primary Region.
    */
  var AdditionalRegions: js.UndefOr[typings.awsSdk.directoryserviceMod.AdditionalRegions] = js.undefined
  
  /**
    * The Region where the Managed Microsoft AD directory was originally created.
    */
  var PrimaryRegion: js.UndefOr[RegionName] = js.undefined
}
object RegionsInfo {
  
  inline def apply(): RegionsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionsInfo]
  }
  
  extension [Self <: RegionsInfo](x: Self) {
    
    inline def setAdditionalRegions(value: AdditionalRegions): Self = StObject.set(x, "AdditionalRegions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalRegionsUndefined: Self = StObject.set(x, "AdditionalRegions", js.undefined)
    
    inline def setAdditionalRegionsVarargs(value: RegionName*): Self = StObject.set(x, "AdditionalRegions", js.Array(value*))
    
    inline def setPrimaryRegion(value: RegionName): Self = StObject.set(x, "PrimaryRegion", value.asInstanceOf[js.Any])
    
    inline def setPrimaryRegionUndefined: Self = StObject.set(x, "PrimaryRegion", js.undefined)
  }
}
