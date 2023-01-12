package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkspaceBundleRequest extends StObject {
  
  /**
    * The identifier of the bundle.
    */
  var BundleId: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.BundleId] = js.undefined
}
object DeleteWorkspaceBundleRequest {
  
  inline def apply(): DeleteWorkspaceBundleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteWorkspaceBundleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWorkspaceBundleRequest] (val x: Self) extends AnyVal {
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
  }
}
