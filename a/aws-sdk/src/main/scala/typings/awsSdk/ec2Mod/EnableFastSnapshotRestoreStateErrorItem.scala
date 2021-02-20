package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableFastSnapshotRestoreStateErrorItem extends StObject {
  
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The error.
    */
  var Error: js.UndefOr[EnableFastSnapshotRestoreStateError] = js.native
}
object EnableFastSnapshotRestoreStateErrorItem {
  
  @scala.inline
  def apply(): EnableFastSnapshotRestoreStateErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableFastSnapshotRestoreStateErrorItem]
  }
  
  @scala.inline
  implicit class EnableFastSnapshotRestoreStateErrorItemMutableBuilder[Self <: EnableFastSnapshotRestoreStateErrorItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setError(value: EnableFastSnapshotRestoreStateError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
  }
}
