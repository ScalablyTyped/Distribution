package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateAssetsRequest extends StObject {
  
  /**
    * The ID of the parent asset from which to disassociate the child asset.
    */
  var assetId: ID = js.native
  
  /**
    * The ID of the child asset to disassociate.
    */
  var childAssetId: ID = js.native
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * The ID of a hierarchy in the parent asset's model. Hierarchies allow different groupings of assets to be formed that all come from the same asset model. You can use the hierarchy ID to identify the correct asset to disassociate. For more information, see Asset hierarchies in the AWS IoT SiteWise User Guide.
    */
  var hierarchyId: ID = js.native
}
object DisassociateAssetsRequest {
  
  @scala.inline
  def apply(assetId: ID, childAssetId: ID, hierarchyId: ID): DisassociateAssetsRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], childAssetId = childAssetId.asInstanceOf[js.Any], hierarchyId = hierarchyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateAssetsRequest]
  }
  
  @scala.inline
  implicit class DisassociateAssetsRequestMutableBuilder[Self <: DisassociateAssetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildAssetId(value: ID): Self = StObject.set(x, "childAssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setHierarchyId(value: ID): Self = StObject.set(x, "hierarchyId", value.asInstanceOf[js.Any])
  }
}
