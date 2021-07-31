package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssetModelResponse extends StObject {
  
  /**
    * The status of the asset model, which contains a state (DELETING after successfully calling this operation) and any error message.
    */
  var assetModelStatus: AssetModelStatus
}
object DeleteAssetModelResponse {
  
  @scala.inline
  def apply(assetModelStatus: AssetModelStatus): DeleteAssetModelResponse = {
    val __obj = js.Dynamic.literal(assetModelStatus = assetModelStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetModelResponse]
  }
  
  @scala.inline
  implicit class DeleteAssetModelResponseMutableBuilder[Self <: DeleteAssetModelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetModelStatus(value: AssetModelStatus): Self = StObject.set(x, "assetModelStatus", value.asInstanceOf[js.Any])
  }
}
