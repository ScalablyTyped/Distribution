package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteMigrationResponse extends js.Object {
  var ReplicationGroup: js.UndefOr[typings.awsSdk.elasticacheMod.ReplicationGroup] = js.native
}

object CompleteMigrationResponse {
  @scala.inline
  def apply(): CompleteMigrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteMigrationResponse]
  }
  @scala.inline
  implicit class CompleteMigrationResponseOps[Self <: CompleteMigrationResponse] (val x: Self) extends AnyVal {
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
    def setReplicationGroup(value: ReplicationGroup): Self = this.set("ReplicationGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationGroup: Self = this.set("ReplicationGroup", js.undefined)
  }
  
}

