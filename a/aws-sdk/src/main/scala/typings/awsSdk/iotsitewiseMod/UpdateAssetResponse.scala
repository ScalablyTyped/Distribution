package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssetResponse extends StObject {
  
  /**
    * The status of the asset, which contains a state (UPDATING after successfully calling this operation) and any error message.
    */
  var assetStatus: AssetStatus
}
object UpdateAssetResponse {
  
  @scala.inline
  def apply(assetStatus: AssetStatus): UpdateAssetResponse = {
    val __obj = js.Dynamic.literal(assetStatus = assetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetResponse]
  }
  
  @scala.inline
  implicit class UpdateAssetResponseMutableBuilder[Self <: UpdateAssetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetStatus(value: AssetStatus): Self = StObject.set(x, "assetStatus", value.asInstanceOf[js.Any])
  }
}
