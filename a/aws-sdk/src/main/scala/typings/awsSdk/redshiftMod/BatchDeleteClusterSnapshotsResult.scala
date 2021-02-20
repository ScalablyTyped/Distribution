package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteClusterSnapshotsResult extends StObject {
  
  /**
    * A list of any errors returned.
    */
  var Errors: js.UndefOr[BatchSnapshotOperationErrorList] = js.native
  
  /**
    * A list of the snapshot identifiers that were deleted. 
    */
  var Resources: js.UndefOr[SnapshotIdentifierList] = js.native
}
object BatchDeleteClusterSnapshotsResult {
  
  @scala.inline
  def apply(): BatchDeleteClusterSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteClusterSnapshotsResult]
  }
  
  @scala.inline
  implicit class BatchDeleteClusterSnapshotsResultMutableBuilder[Self <: BatchDeleteClusterSnapshotsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: BatchSnapshotOperationErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SnapshotErrorMessage*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: SnapshotIdentifierList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = StObject.set(x, "Resources", js.Array(value :_*))
  }
}
