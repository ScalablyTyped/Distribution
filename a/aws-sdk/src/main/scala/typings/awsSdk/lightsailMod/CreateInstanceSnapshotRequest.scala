package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceSnapshotRequest extends js.Object {
  /**
    * The Lightsail instance on which to base your snapshot.
    */
  var instanceName: ResourceName = js.native
  /**
    * The name for your new snapshot.
    */
  var instanceSnapshotName: ResourceName = js.native
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateInstanceSnapshotRequest {
  @scala.inline
  def apply(instanceName: ResourceName, instanceSnapshotName: ResourceName, tags: TagList = null): CreateInstanceSnapshotRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], instanceSnapshotName = instanceSnapshotName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceSnapshotRequest]
  }
}

