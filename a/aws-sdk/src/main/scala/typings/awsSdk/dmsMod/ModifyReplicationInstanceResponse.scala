package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReplicationInstanceResponse extends js.Object {
  /**
    * The modified replication instance.
    */
  var ReplicationInstance: js.UndefOr[typings.awsSdk.dmsMod.ReplicationInstance] = js.native
}

object ModifyReplicationInstanceResponse {
  @scala.inline
  def apply(): ModifyReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationInstanceResponse]
  }
  @scala.inline
  implicit class ModifyReplicationInstanceResponseOps[Self <: ModifyReplicationInstanceResponse] (val x: Self) extends AnyVal {
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
    def setReplicationInstance(value: ReplicationInstance): Self = this.set("ReplicationInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstance: Self = this.set("ReplicationInstance", js.undefined)
  }
  
}

