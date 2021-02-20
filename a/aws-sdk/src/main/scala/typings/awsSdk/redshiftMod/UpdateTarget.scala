package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTarget extends StObject {
  
  /**
    * The cluster version for the new maintenance track.
    */
  var DatabaseVersion: js.UndefOr[String] = js.native
  
  /**
    * The name of the new maintenance track.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  
  /**
    * A list of operations supported by the maintenance track.
    */
  var SupportedOperations: js.UndefOr[SupportedOperationList] = js.native
}
object UpdateTarget {
  
  @scala.inline
  def apply(): UpdateTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTarget]
  }
  
  @scala.inline
  implicit class UpdateTargetMutableBuilder[Self <: UpdateTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseVersion(value: String): Self = StObject.set(x, "DatabaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseVersionUndefined: Self = StObject.set(x, "DatabaseVersion", js.undefined)
    
    @scala.inline
    def setMaintenanceTrackName(value: String): Self = StObject.set(x, "MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceTrackNameUndefined: Self = StObject.set(x, "MaintenanceTrackName", js.undefined)
    
    @scala.inline
    def setSupportedOperations(value: SupportedOperationList): Self = StObject.set(x, "SupportedOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedOperationsUndefined: Self = StObject.set(x, "SupportedOperations", js.undefined)
    
    @scala.inline
    def setSupportedOperationsVarargs(value: SupportedOperation*): Self = StObject.set(x, "SupportedOperations", js.Array(value :_*))
  }
}
