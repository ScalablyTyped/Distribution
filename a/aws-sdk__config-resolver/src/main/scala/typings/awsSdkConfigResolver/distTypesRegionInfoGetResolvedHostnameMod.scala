package typings.awsSdkConfigResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRegionInfoGetResolvedHostnameMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionInfo/getResolvedHostname", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getResolvedHostname(resolvedRegion: String, param1: GetResolvedHostnameOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolvedHostname")(resolvedRegion.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  trait GetResolvedHostnameOptions extends StObject {
    
    var partitionHostname: js.UndefOr[String] = js.undefined
    
    var regionHostname: js.UndefOr[String] = js.undefined
  }
  object GetResolvedHostnameOptions {
    
    inline def apply(): GetResolvedHostnameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetResolvedHostnameOptions]
    }
    
    extension [Self <: GetResolvedHostnameOptions](x: Self) {
      
      inline def setPartitionHostname(value: String): Self = StObject.set(x, "partitionHostname", value.asInstanceOf[js.Any])
      
      inline def setPartitionHostnameUndefined: Self = StObject.set(x, "partitionHostname", js.undefined)
      
      inline def setRegionHostname(value: String): Self = StObject.set(x, "regionHostname", value.asInstanceOf[js.Any])
      
      inline def setRegionHostnameUndefined: Self = StObject.set(x, "regionHostname", js.undefined)
    }
  }
}
