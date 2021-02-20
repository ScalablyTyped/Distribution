package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetDetails extends StObject {
  
  var S3SnapshotAsset: js.UndefOr[typings.awsSdk.dataexchangeMod.S3SnapshotAsset] = js.native
}
object AssetDetails {
  
  @scala.inline
  def apply(): AssetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetDetails]
  }
  
  @scala.inline
  implicit class AssetDetailsMutableBuilder[Self <: AssetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3SnapshotAsset(value: S3SnapshotAsset): Self = StObject.set(x, "S3SnapshotAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3SnapshotAssetUndefined: Self = StObject.set(x, "S3SnapshotAsset", js.undefined)
  }
}
