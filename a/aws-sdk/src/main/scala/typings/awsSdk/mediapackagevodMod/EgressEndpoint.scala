package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EgressEndpoint extends StObject {
  
  /**
    * The ID of the PackagingConfiguration being applied to the Asset.
    */
  var PackagingConfigurationId: js.UndefOr[string] = js.undefined
  
  /**
    * The current processing status of the asset used for the packaging configuration. The status can be either QUEUED, PROCESSING, PLAYABLE, or FAILED. Status information won't be available for most assets ingested before 2021-09-30.
    */
  var Status: js.UndefOr[string] = js.undefined
  
  /**
    * The URL of the parent manifest for the repackaged Asset.
    */
  var Url: js.UndefOr[string] = js.undefined
}
object EgressEndpoint {
  
  inline def apply(): EgressEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressEndpoint]
  }
  
  extension [Self <: EgressEndpoint](x: Self) {
    
    inline def setPackagingConfigurationId(value: string): Self = StObject.set(x, "PackagingConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setPackagingConfigurationIdUndefined: Self = StObject.set(x, "PackagingConfigurationId", js.undefined)
    
    inline def setStatus(value: string): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
