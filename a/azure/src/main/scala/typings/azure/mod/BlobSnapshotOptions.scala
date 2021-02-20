package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobSnapshotOptions extends GetBlobPropertiesOptions {
  
  var metadata: js.UndefOr[StorageMetadata] = js.native
}
object BlobSnapshotOptions {
  
  @scala.inline
  def apply(): BlobSnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobSnapshotOptions]
  }
  
  @scala.inline
  implicit class BlobSnapshotOptionsMutableBuilder[Self <: BlobSnapshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: StorageMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
