package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyBlobOptions
  extends StObject
     with BlobSnapshotOptions {
  
  var sourceAccessConditions: StorageAccessCondition
  
  var sourceLeaseId: js.UndefOr[String] = js.undefined
}
object CopyBlobOptions {
  
  inline def apply(sourceAccessConditions: StorageAccessCondition): CopyBlobOptions = {
    val __obj = js.Dynamic.literal(sourceAccessConditions = sourceAccessConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyBlobOptions]
  }
  
  extension [Self <: CopyBlobOptions](x: Self) {
    
    inline def setSourceAccessConditions(value: StorageAccessCondition): Self = StObject.set(x, "sourceAccessConditions", value.asInstanceOf[js.Any])
    
    inline def setSourceLeaseId(value: String): Self = StObject.set(x, "sourceLeaseId", value.asInstanceOf[js.Any])
    
    inline def setSourceLeaseIdUndefined: Self = StObject.set(x, "sourceLeaseId", js.undefined)
  }
}
