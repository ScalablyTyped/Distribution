package typings.azureMsalCommon

import typings.azureMsalCommon.distUtilsConstantsMod.RegionDiscoveryOutcomes
import typings.azureMsalCommon.distUtilsConstantsMod.RegionDiscoverySources
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthorityRegionDiscoveryMetadataMod {
  
  trait RegionDiscoveryMetadata extends StObject {
    
    var region_outcome: js.UndefOr[RegionDiscoveryOutcomes] = js.undefined
    
    var region_source: js.UndefOr[RegionDiscoverySources] = js.undefined
    
    var region_used: js.UndefOr[String] = js.undefined
  }
  object RegionDiscoveryMetadata {
    
    inline def apply(): RegionDiscoveryMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegionDiscoveryMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegionDiscoveryMetadata] (val x: Self) extends AnyVal {
      
      inline def setRegion_outcome(value: RegionDiscoveryOutcomes): Self = StObject.set(x, "region_outcome", value.asInstanceOf[js.Any])
      
      inline def setRegion_outcomeUndefined: Self = StObject.set(x, "region_outcome", js.undefined)
      
      inline def setRegion_source(value: RegionDiscoverySources): Self = StObject.set(x, "region_source", value.asInstanceOf[js.Any])
      
      inline def setRegion_sourceUndefined: Self = StObject.set(x, "region_source", js.undefined)
      
      inline def setRegion_used(value: String): Self = StObject.set(x, "region_used", value.asInstanceOf[js.Any])
      
      inline def setRegion_usedUndefined: Self = StObject.set(x, "region_used", js.undefined)
    }
  }
}
