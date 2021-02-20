package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotLimits extends StObject {
  
  /**
    * The current number of manual snapshots of the directory.
    */
  var ManualSnapshotsCurrentCount: js.UndefOr[Limit] = js.native
  
  /**
    * The maximum number of manual snapshots allowed.
    */
  var ManualSnapshotsLimit: js.UndefOr[Limit] = js.native
  
  /**
    * Indicates if the manual snapshot limit has been reached.
    */
  var ManualSnapshotsLimitReached: js.UndefOr[typings.awsSdk.directoryserviceMod.ManualSnapshotsLimitReached] = js.native
}
object SnapshotLimits {
  
  @scala.inline
  def apply(): SnapshotLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotLimits]
  }
  
  @scala.inline
  implicit class SnapshotLimitsMutableBuilder[Self <: SnapshotLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManualSnapshotsCurrentCount(value: Limit): Self = StObject.set(x, "ManualSnapshotsCurrentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualSnapshotsCurrentCountUndefined: Self = StObject.set(x, "ManualSnapshotsCurrentCount", js.undefined)
    
    @scala.inline
    def setManualSnapshotsLimit(value: Limit): Self = StObject.set(x, "ManualSnapshotsLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualSnapshotsLimitReached(value: ManualSnapshotsLimitReached): Self = StObject.set(x, "ManualSnapshotsLimitReached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualSnapshotsLimitReachedUndefined: Self = StObject.set(x, "ManualSnapshotsLimitReached", js.undefined)
    
    @scala.inline
    def setManualSnapshotsLimitUndefined: Self = StObject.set(x, "ManualSnapshotsLimit", js.undefined)
  }
}
