package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSnapshotLimitsResult extends StObject {
  
  /**
    * A SnapshotLimits object that contains the manual snapshot limits for the specified directory.
    */
  var SnapshotLimits: js.UndefOr[typings.awsSdk.directoryserviceMod.SnapshotLimits] = js.native
}
object GetSnapshotLimitsResult {
  
  @scala.inline
  def apply(): GetSnapshotLimitsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotLimitsResult]
  }
  
  @scala.inline
  implicit class GetSnapshotLimitsResultMutableBuilder[Self <: GetSnapshotLimitsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotLimits(value: SnapshotLimits): Self = StObject.set(x, "SnapshotLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotLimitsUndefined: Self = StObject.set(x, "SnapshotLimits", js.undefined)
  }
}
