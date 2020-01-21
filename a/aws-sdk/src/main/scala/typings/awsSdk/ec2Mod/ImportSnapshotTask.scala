package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSnapshotTask extends js.Object {
  /**
    * A description of the import snapshot task.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the import snapshot task.
    */
  var ImportTaskId: js.UndefOr[String] = js.native
  /**
    * Describes an import snapshot task.
    */
  var SnapshotTaskDetail: js.UndefOr[typings.awsSdk.ec2Mod.SnapshotTaskDetail] = js.native
  /**
    * The tags for the import snapshot task.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ImportSnapshotTask {
  @scala.inline
  def apply(
    Description: String = null,
    ImportTaskId: String = null,
    SnapshotTaskDetail: SnapshotTaskDetail = null,
    Tags: TagList = null
  ): ImportSnapshotTask = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ImportTaskId != null) __obj.updateDynamic("ImportTaskId")(ImportTaskId.asInstanceOf[js.Any])
    if (SnapshotTaskDetail != null) __obj.updateDynamic("SnapshotTaskDetail")(SnapshotTaskDetail.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSnapshotTask]
  }
}

