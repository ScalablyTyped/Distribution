package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExistingObjectReplication extends js.Object {
  /**
    * 
    */
  var Status: ExistingObjectReplicationStatus = js.native
}

object ExistingObjectReplication {
  @scala.inline
  def apply(Status: ExistingObjectReplicationStatus): ExistingObjectReplication = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingObjectReplication]
  }
  @scala.inline
  implicit class ExistingObjectReplicationOps[Self <: ExistingObjectReplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatus(value: ExistingObjectReplicationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

