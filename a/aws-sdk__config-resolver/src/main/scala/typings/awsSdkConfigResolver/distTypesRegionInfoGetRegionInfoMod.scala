package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.distTypesRegionInfoPartitionHashMod.PartitionHash
import typings.awsSdkConfigResolver.distTypesRegionInfoRegionHashMod.RegionHash
import typings.awsSdkTypes.distTypesUtilMod.RegionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRegionInfoGetRegionInfoMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionInfo/getRegionInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRegionInfo(region: String, param1: GetRegionInfoOptions): RegionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegionInfo")(region.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[RegionInfo]
  
  trait GetRegionInfoOptions extends StObject {
    
    var partitionHash: PartitionHash
    
    var regionHash: RegionHash
    
    var signingService: String
    
    var useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var useFipsEndpoint: js.UndefOr[Boolean] = js.undefined
  }
  object GetRegionInfoOptions {
    
    inline def apply(partitionHash: PartitionHash, regionHash: RegionHash, signingService: String): GetRegionInfoOptions = {
      val __obj = js.Dynamic.literal(partitionHash = partitionHash.asInstanceOf[js.Any], regionHash = regionHash.asInstanceOf[js.Any], signingService = signingService.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRegionInfoOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetRegionInfoOptions] (val x: Self) extends AnyVal {
      
      inline def setPartitionHash(value: PartitionHash): Self = StObject.set(x, "partitionHash", value.asInstanceOf[js.Any])
      
      inline def setRegionHash(value: RegionHash): Self = StObject.set(x, "regionHash", value.asInstanceOf[js.Any])
      
      inline def setSigningService(value: String): Self = StObject.set(x, "signingService", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpoint(value: Boolean): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
      
      inline def setUseFipsEndpoint(value: Boolean): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
    }
  }
}
