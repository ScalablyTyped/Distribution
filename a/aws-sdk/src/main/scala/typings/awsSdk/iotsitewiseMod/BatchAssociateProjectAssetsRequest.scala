package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateProjectAssetsRequest extends StObject {
  
  /**
    * The IDs of the assets to be associated to the project.
    */
  var assetIds: IDs
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID of the project to which to associate the assets.
    */
  var projectId: ID
}
object BatchAssociateProjectAssetsRequest {
  
  inline def apply(assetIds: IDs, projectId: ID): BatchAssociateProjectAssetsRequest = {
    val __obj = js.Dynamic.literal(assetIds = assetIds.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateProjectAssetsRequest]
  }
  
  extension [Self <: BatchAssociateProjectAssetsRequest](x: Self) {
    
    inline def setAssetIds(value: IDs): Self = StObject.set(x, "assetIds", value.asInstanceOf[js.Any])
    
    inline def setAssetIdsVarargs(value: ID*): Self = StObject.set(x, "assetIds", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setProjectId(value: ID): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
