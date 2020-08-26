package typings.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  /**
    * The TargetID is a 12-character identifier of the ACCOUNT for which the control was created. (This must be the current account.) 
    */
  var Id: js.UndefOr[TargetId] = js.native
  /**
    * The target type is always an ACCOUNT.
    */
  var Type: TargetType = js.native
}

object Target {
  @scala.inline
  def apply(Type: TargetType): Target = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
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
    def setType(value: TargetType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: TargetId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

