package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAssetResponse extends js.Object {
  
  /**
    * The status of the asset, which contains a state (UPDATING after successfully calling this operation) and any error message.
    */
  var assetStatus: AssetStatus = js.native
}
object UpdateAssetResponse {
  
  @scala.inline
  def apply(assetStatus: AssetStatus): UpdateAssetResponse = {
    val __obj = js.Dynamic.literal(assetStatus = assetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetResponse]
  }
  
  @scala.inline
  implicit class UpdateAssetResponseOps[Self <: UpdateAssetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssetStatus(value: AssetStatus): Self = this.set("assetStatus", value.asInstanceOf[js.Any])
  }
}
