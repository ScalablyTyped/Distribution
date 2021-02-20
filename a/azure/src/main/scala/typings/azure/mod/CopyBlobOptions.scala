package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyBlobOptions extends BlobSnapshotOptions {
  
  var sourceAccessConditions: StorageAccessCondition = js.native
  
  var sourceLeaseId: js.UndefOr[String] = js.native
}
object CopyBlobOptions {
  
  @scala.inline
  def apply(sourceAccessConditions: StorageAccessCondition): CopyBlobOptions = {
    val __obj = js.Dynamic.literal(sourceAccessConditions = sourceAccessConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyBlobOptions]
  }
  
  @scala.inline
  implicit class CopyBlobOptionsMutableBuilder[Self <: CopyBlobOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceAccessConditions(value: StorageAccessCondition): Self = StObject.set(x, "sourceAccessConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLeaseId(value: String): Self = StObject.set(x, "sourceLeaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLeaseIdUndefined: Self = StObject.set(x, "sourceLeaseId", js.undefined)
  }
}
