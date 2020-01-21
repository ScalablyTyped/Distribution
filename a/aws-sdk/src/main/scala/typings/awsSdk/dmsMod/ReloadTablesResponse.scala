package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReloadTablesResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
}

object ReloadTablesResponse {
  @scala.inline
  def apply(ReplicationTaskArn: String = null): ReloadTablesResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTaskArn != null) __obj.updateDynamic("ReplicationTaskArn")(ReplicationTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReloadTablesResponse]
  }
}

