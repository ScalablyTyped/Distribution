package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationInstanceTaskLog extends js.Object {
  /**
    * The size, in bytes, of the replication task log.
    */
  var ReplicationInstanceTaskLogSize: js.UndefOr[Long] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
  /**
    * The name of the replication task.
    */
  var ReplicationTaskName: js.UndefOr[String] = js.native
}

object ReplicationInstanceTaskLog {
  @scala.inline
  def apply(
    ReplicationInstanceTaskLogSize: js.UndefOr[Long] = js.undefined,
    ReplicationTaskArn: String = null,
    ReplicationTaskName: String = null
  ): ReplicationInstanceTaskLog = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ReplicationInstanceTaskLogSize)) __obj.updateDynamic("ReplicationInstanceTaskLogSize")(ReplicationInstanceTaskLogSize.get.asInstanceOf[js.Any])
    if (ReplicationTaskArn != null) __obj.updateDynamic("ReplicationTaskArn")(ReplicationTaskArn.asInstanceOf[js.Any])
    if (ReplicationTaskName != null) __obj.updateDynamic("ReplicationTaskName")(ReplicationTaskName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationInstanceTaskLog]
  }
}

