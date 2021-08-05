package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteClusterSnapshotsResult extends StObject {
  
  /**
    * A list of any errors returned.
    */
  var Errors: js.UndefOr[BatchSnapshotOperationErrorList] = js.undefined
  
  /**
    * A list of the snapshot identifiers that were deleted. 
    */
  var Resources: js.UndefOr[SnapshotIdentifierList] = js.undefined
}
object BatchDeleteClusterSnapshotsResult {
  
  inline def apply(): BatchDeleteClusterSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteClusterSnapshotsResult]
  }
  
  extension [Self <: BatchDeleteClusterSnapshotsResult](x: Self) {
    
    inline def setErrors(value: BatchSnapshotOperationErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: SnapshotErrorMessage*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    inline def setResources(value: SnapshotIdentifierList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "Resources", js.Array(value :_*))
  }
}
