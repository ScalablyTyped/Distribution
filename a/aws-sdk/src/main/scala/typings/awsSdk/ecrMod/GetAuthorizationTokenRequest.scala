package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAuthorizationTokenRequest extends StObject {
  
  /**
    * A list of AWS account IDs that are associated with the registries for which to get AuthorizationData objects. If you do not specify a registry, the default registry is assumed.
    */
  var registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList] = js.native
}
object GetAuthorizationTokenRequest {
  
  @scala.inline
  def apply(): GetAuthorizationTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizationTokenRequest]
  }
  
  @scala.inline
  implicit class GetAuthorizationTokenRequestMutableBuilder[Self <: GetAuthorizationTokenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryIds(value: GetAuthorizationTokenRegistryIdList): Self = StObject.set(x, "registryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdsUndefined: Self = StObject.set(x, "registryIds", js.undefined)
    
    @scala.inline
    def setRegistryIdsVarargs(value: RegistryId*): Self = StObject.set(x, "registryIds", js.Array(value :_*))
  }
}
