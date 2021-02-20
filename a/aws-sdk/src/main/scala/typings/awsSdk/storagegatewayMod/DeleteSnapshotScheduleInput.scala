package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSnapshotScheduleInput extends StObject {
  
  /**
    * The volume which snapshot schedule to delete.
    */
  var VolumeARN: typings.awsSdk.storagegatewayMod.VolumeARN = js.native
}
object DeleteSnapshotScheduleInput {
  
  @scala.inline
  def apply(VolumeARN: VolumeARN): DeleteSnapshotScheduleInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotScheduleInput]
  }
  
  @scala.inline
  implicit class DeleteSnapshotScheduleInputMutableBuilder[Self <: DeleteSnapshotScheduleInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
  }
}
