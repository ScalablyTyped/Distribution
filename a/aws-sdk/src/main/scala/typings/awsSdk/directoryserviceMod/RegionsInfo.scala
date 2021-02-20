package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionsInfo extends StObject {
  
  /**
    * Lists the Regions where the directory has been replicated, excluding the primary Region.
    */
  var AdditionalRegions: js.UndefOr[typings.awsSdk.directoryserviceMod.AdditionalRegions] = js.native
  
  /**
    * The Region from where the AWS Managed Microsoft AD directory was originally created.
    */
  var PrimaryRegion: js.UndefOr[RegionName] = js.native
}
object RegionsInfo {
  
  @scala.inline
  def apply(): RegionsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionsInfo]
  }
  
  @scala.inline
  implicit class RegionsInfoMutableBuilder[Self <: RegionsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalRegions(value: AdditionalRegions): Self = StObject.set(x, "AdditionalRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalRegionsUndefined: Self = StObject.set(x, "AdditionalRegions", js.undefined)
    
    @scala.inline
    def setAdditionalRegionsVarargs(value: RegionName*): Self = StObject.set(x, "AdditionalRegions", js.Array(value :_*))
    
    @scala.inline
    def setPrimaryRegion(value: RegionName): Self = StObject.set(x, "PrimaryRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryRegionUndefined: Self = StObject.set(x, "PrimaryRegion", js.undefined)
  }
}
