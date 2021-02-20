package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSnapshotScheduleOutput extends StObject {
  
  /**
    * The volume which snapshot schedule was deleted.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
}
object DeleteSnapshotScheduleOutput {
  
  @scala.inline
  def apply(): DeleteSnapshotScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSnapshotScheduleOutput]
  }
  
  @scala.inline
  implicit class DeleteSnapshotScheduleOutputMutableBuilder[Self <: DeleteSnapshotScheduleOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
  }
}
