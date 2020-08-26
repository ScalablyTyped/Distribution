package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBInstanceReadReplicaResult extends js.Object {
  var DBInstance: js.UndefOr[typings.awsSdk.rdsMod.DBInstance] = js.native
}

object CreateDBInstanceReadReplicaResult {
  @scala.inline
  def apply(): CreateDBInstanceReadReplicaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBInstanceReadReplicaResult]
  }
  @scala.inline
  implicit class CreateDBInstanceReadReplicaResultOps[Self <: CreateDBInstanceReadReplicaResult] (val x: Self) extends AnyVal {
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
    def setDBInstance(value: DBInstance): Self = this.set("DBInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstance: Self = this.set("DBInstance", js.undefined)
  }
  
}

