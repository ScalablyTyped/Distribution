package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.distTypesRegionInfoGetRegionInfoMod.GetRegionInfoOptions
import typings.awsSdkTypes.distTypesUtilMod.RegionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRegionInfoMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRegionInfo(
    region: String,
    hasUseFipsEndpointUseDualstackEndpointSigningServiceRegionHashPartitionHash: GetRegionInfoOptions
  ): RegionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegionInfo")(region.asInstanceOf[js.Any], hasUseFipsEndpointUseDualstackEndpointSigningServiceRegionHashPartitionHash.asInstanceOf[js.Any])).asInstanceOf[RegionInfo]
}
