package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetDetails extends js.Object {
  
  var S3SnapshotAsset: js.UndefOr[typings.awsSdk.dataexchangeMod.S3SnapshotAsset] = js.native
}
object AssetDetails {
  
  @scala.inline
  def apply(): AssetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetDetails]
  }
  
  @scala.inline
  implicit class AssetDetailsOps[Self <: AssetDetails] (val x: Self) extends AnyVal {
    
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
    def setS3SnapshotAsset(value: S3SnapshotAsset): Self = this.set("S3SnapshotAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3SnapshotAsset: Self = this.set("S3SnapshotAsset", js.undefined)
  }
}
