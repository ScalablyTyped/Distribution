package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchModifyClusterSnapshotsOutputMessage extends StObject {
  
  /**
    * A list of any errors returned.
    */
  var Errors: js.UndefOr[BatchSnapshotOperationErrors] = js.undefined
  
  /**
    * A list of the snapshots that were modified.
    */
  var Resources: js.UndefOr[SnapshotIdentifierList] = js.undefined
}
object BatchModifyClusterSnapshotsOutputMessage {
  
  inline def apply(): BatchModifyClusterSnapshotsOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchModifyClusterSnapshotsOutputMessage]
  }
  
  extension [Self <: BatchModifyClusterSnapshotsOutputMessage](x: Self) {
    
    inline def setErrors(value: BatchSnapshotOperationErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: SnapshotErrorMessage*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    inline def setResources(value: SnapshotIdentifierList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "Resources", js.Array(value :_*))
  }
}
