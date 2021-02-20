package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EgressEndpoint extends StObject {
  
  /**
    * The ID of the PackagingConfiguration being applied to the Asset.
    */
  var PackagingConfigurationId: js.UndefOr[string] = js.native
  
  /**
    * The URL of the parent manifest for the repackaged Asset.
    */
  var Url: js.UndefOr[string] = js.native
}
object EgressEndpoint {
  
  @scala.inline
  def apply(): EgressEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressEndpoint]
  }
  
  @scala.inline
  implicit class EgressEndpointMutableBuilder[Self <: EgressEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackagingConfigurationId(value: string): Self = StObject.set(x, "PackagingConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagingConfigurationIdUndefined: Self = StObject.set(x, "PackagingConfigurationId", js.undefined)
    
    @scala.inline
    def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
