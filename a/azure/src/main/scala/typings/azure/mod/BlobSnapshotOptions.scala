package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobSnapshotOptions
  extends StObject
     with GetBlobPropertiesOptions {
  
  var metadata: js.UndefOr[StorageMetadata] = js.undefined
}
object BlobSnapshotOptions {
  
  inline def apply(): BlobSnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobSnapshotOptions]
  }
  
  extension [Self <: BlobSnapshotOptions](x: Self) {
    
    inline def setMetadata(value: StorageMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
