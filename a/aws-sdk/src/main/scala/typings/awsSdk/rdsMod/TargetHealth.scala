package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetHealth extends js.Object {
  /**
    * A description of the health of the RDS Proxy target. If the State is AVAILABLE, a description is not included.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The reason for the current health State of the RDS Proxy target.
    */
  var Reason: js.UndefOr[TargetHealthReason] = js.native
  /**
    * The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical lifecycle example for the states of an RDS Proxy target:   registering &gt; unavailable &gt; available &gt; unavailable &gt; available 
    */
  var State: js.UndefOr[TargetState] = js.native
}

object TargetHealth {
  @scala.inline
  def apply(): TargetHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHealth]
  }
  @scala.inline
  implicit class TargetHealthOps[Self <: TargetHealth] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setReason(value: TargetHealthReason): Self = this.set("Reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
    @scala.inline
    def setState(value: TargetState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

