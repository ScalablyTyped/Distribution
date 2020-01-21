package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMountTargetRequest extends js.Object {
  /**
    * The ID of the mount target to delete (String).
    */
  var MountTargetId: typings.awsSdk.efsMod.MountTargetId = js.native
}

object DeleteMountTargetRequest {
  @scala.inline
  def apply(MountTargetId: MountTargetId): DeleteMountTargetRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMountTargetRequest]
  }
}

