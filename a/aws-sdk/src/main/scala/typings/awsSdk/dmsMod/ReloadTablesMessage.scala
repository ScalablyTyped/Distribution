package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReloadTablesMessage extends js.Object {
  /**
    * Options for reload. Specify data-reload to reload the data and re-validate it if validation is enabled. Specify validate-only to re-validate the table. This option applies only when validation is enabled for the task.  Valid values: data-reload, validate-only Default value is data-reload.
    */
  var ReloadOption: js.UndefOr[ReloadOptionValue] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: String = js.native
  /**
    * The name and schema of the table to be reloaded. 
    */
  var TablesToReload: TableListToReload = js.native
}

object ReloadTablesMessage {
  @scala.inline
  def apply(ReplicationTaskArn: String, TablesToReload: TableListToReload): ReloadTablesMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any], TablesToReload = TablesToReload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReloadTablesMessage]
  }
  @scala.inline
  implicit class ReloadTablesMessageOps[Self <: ReloadTablesMessage] (val x: Self) extends AnyVal {
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
    def setTablesToReloadVarargs(value: TableToReload*): Self = this.set("TablesToReload", js.Array(value :_*))
    @scala.inline
    def setTablesToReload(value: TableListToReload): Self = this.set("TablesToReload", value.asInstanceOf[js.Any])
    @scala.inline
    def setReloadOption(value: ReloadOptionValue): Self = this.set("ReloadOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReloadOption: Self = this.set("ReloadOption", js.undefined)
  }
  
}

