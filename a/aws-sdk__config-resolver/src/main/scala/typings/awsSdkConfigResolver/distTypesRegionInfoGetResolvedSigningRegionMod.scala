package typings.awsSdkConfigResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRegionInfoGetResolvedSigningRegionMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionInfo/getResolvedSigningRegion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getResolvedSigningRegion(hostname: String, hasSigningRegionRegionRegexUseFipsEndpoint: GetResolvedSigningRegionOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolvedSigningRegion")(hostname.asInstanceOf[js.Any], hasSigningRegionRegionRegexUseFipsEndpoint.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  trait GetResolvedSigningRegionOptions extends StObject {
    
    var regionRegex: String
    
    var signingRegion: js.UndefOr[String] = js.undefined
    
    var useFipsEndpoint: Boolean
  }
  object GetResolvedSigningRegionOptions {
    
    inline def apply(regionRegex: String, useFipsEndpoint: Boolean): GetResolvedSigningRegionOptions = {
      val __obj = js.Dynamic.literal(regionRegex = regionRegex.asInstanceOf[js.Any], useFipsEndpoint = useFipsEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResolvedSigningRegionOptions]
    }
    
    extension [Self <: GetResolvedSigningRegionOptions](x: Self) {
      
      inline def setRegionRegex(value: String): Self = StObject.set(x, "regionRegex", value.asInstanceOf[js.Any])
      
      inline def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      inline def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
      
      inline def setUseFipsEndpoint(value: Boolean): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
    }
  }
}
