package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotLimitsRequest extends js.Object {
  /**
    * Contains the identifier of the directory to obtain the limits for.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object GetSnapshotLimitsRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): GetSnapshotLimitsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotLimitsRequest]
  }
}

