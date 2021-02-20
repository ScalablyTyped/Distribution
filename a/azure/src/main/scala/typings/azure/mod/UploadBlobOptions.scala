package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadBlobOptions extends SetBlobPropertiesOptions {
  
  var metadata: js.UndefOr[StorageMetadata] = js.native
  
  var parallelOperationThreadCount: js.UndefOr[Double] = js.native
  
  var speedSummary: js.UndefOr[SpeedSummary] = js.native
  
  var storeBlobContentMD5: js.UndefOr[Boolean] = js.native
  
  var useTransactionalMD5: js.UndefOr[Boolean] = js.native
}
object UploadBlobOptions {
  
  @scala.inline
  def apply(): UploadBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadBlobOptions]
  }
  
  @scala.inline
  implicit class UploadBlobOptionsMutableBuilder[Self <: UploadBlobOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: StorageMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setParallelOperationThreadCount(value: Double): Self = StObject.set(x, "parallelOperationThreadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelOperationThreadCountUndefined: Self = StObject.set(x, "parallelOperationThreadCount", js.undefined)
    
    @scala.inline
    def setSpeedSummary(value: SpeedSummary): Self = StObject.set(x, "speedSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedSummaryUndefined: Self = StObject.set(x, "speedSummary", js.undefined)
    
    @scala.inline
    def setStoreBlobContentMD5(value: Boolean): Self = StObject.set(x, "storeBlobContentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreBlobContentMD5Undefined: Self = StObject.set(x, "storeBlobContentMD5", js.undefined)
    
    @scala.inline
    def setUseTransactionalMD5(value: Boolean): Self = StObject.set(x, "useTransactionalMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTransactionalMD5Undefined: Self = StObject.set(x, "useTransactionalMD5", js.undefined)
  }
}
