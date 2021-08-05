package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetDetails extends StObject {
  
  var S3SnapshotAsset: js.UndefOr[typings.awsSdk.dataexchangeMod.S3SnapshotAsset] = js.undefined
}
object AssetDetails {
  
  inline def apply(): AssetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetDetails]
  }
  
  extension [Self <: AssetDetails](x: Self) {
    
    inline def setS3SnapshotAsset(value: S3SnapshotAsset): Self = StObject.set(x, "S3SnapshotAsset", value.asInstanceOf[js.Any])
    
    inline def setS3SnapshotAssetUndefined: Self = StObject.set(x, "S3SnapshotAsset", js.undefined)
  }
}
