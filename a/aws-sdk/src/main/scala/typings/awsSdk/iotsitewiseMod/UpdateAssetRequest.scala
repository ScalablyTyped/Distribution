package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssetRequest extends StObject {
  
  /**
    * The ID of the asset to update.
    */
  var assetId: ID
  
  /**
    * A unique, friendly name for the asset.
    */
  var assetName: Name
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
}
object UpdateAssetRequest {
  
  @scala.inline
  def apply(assetId: ID, assetName: Name): UpdateAssetRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], assetName = assetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetRequest]
  }
  
  @scala.inline
  implicit class UpdateAssetRequestMutableBuilder[Self <: UpdateAssetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetName(value: Name): Self = StObject.set(x, "assetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
