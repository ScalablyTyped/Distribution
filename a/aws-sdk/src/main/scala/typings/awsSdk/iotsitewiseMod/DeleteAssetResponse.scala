package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssetResponse extends StObject {
  
  /**
    * The status of the asset, which contains a state (DELETING after successfully calling this operation) and any error message.
    */
  var assetStatus: AssetStatus
}
object DeleteAssetResponse {
  
  @scala.inline
  def apply(assetStatus: AssetStatus): DeleteAssetResponse = {
    val __obj = js.Dynamic.literal(assetStatus = assetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetResponse]
  }
  
  @scala.inline
  implicit class DeleteAssetResponseMutableBuilder[Self <: DeleteAssetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetStatus(value: AssetStatus): Self = StObject.set(x, "assetStatus", value.asInstanceOf[js.Any])
  }
}
