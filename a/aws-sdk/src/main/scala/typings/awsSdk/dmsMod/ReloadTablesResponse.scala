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
  def apply(): ReloadTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadTablesResponse]
  }
  @scala.inline
  implicit class ReloadTablesResponseOps[Self <: ReloadTablesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReplicationTaskArn(value: String): Self = this.set("ReplicationTaskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationTaskArn: Self = this.set("ReplicationTaskArn", js.undefined)
  }
  
}

