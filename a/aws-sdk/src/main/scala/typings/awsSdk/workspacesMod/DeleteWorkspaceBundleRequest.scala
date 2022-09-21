package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkspaceBundleRequest extends StObject {
  
  /**
    * The identifier of the bundle.
    */
  var BundleId: js.UndefOr[typings.awsSdk.workspacesMod.BundleId] = js.undefined
}
object DeleteWorkspaceBundleRequest {
  
  inline def apply(): DeleteWorkspaceBundleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteWorkspaceBundleRequest]
  }
  
  extension [Self <: DeleteWorkspaceBundleRequest](x: Self) {
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
  }
}
