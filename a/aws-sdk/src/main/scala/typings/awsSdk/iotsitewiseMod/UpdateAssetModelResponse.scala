package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAssetModelResponse extends StObject {
  
  /**
    * The status of the asset model, which contains a state (UPDATING after successfully calling this operation) and any error message.
    */
  var assetModelStatus: AssetModelStatus = js.native
}
object UpdateAssetModelResponse {
  
  @scala.inline
  def apply(assetModelStatus: AssetModelStatus): UpdateAssetModelResponse = {
    val __obj = js.Dynamic.literal(assetModelStatus = assetModelStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetModelResponse]
  }
  
  @scala.inline
  implicit class UpdateAssetModelResponseMutableBuilder[Self <: UpdateAssetModelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetModelStatus(value: AssetModelStatus): Self = StObject.set(x, "assetModelStatus", value.asInstanceOf[js.Any])
  }
}
