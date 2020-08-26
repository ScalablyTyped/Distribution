package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnshareTarget extends js.Object {
  /**
    * Identifier of the directory consumer account.
    */
  var Id: TargetId = js.native
  /**
    * Type of identifier to be used in the Id field.
    */
  var Type: TargetType = js.native
}

object UnshareTarget {
  @scala.inline
  def apply(Id: TargetId, Type: TargetType): UnshareTarget = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshareTarget]
  }
  @scala.inline
  implicit class UnshareTargetOps[Self <: UnshareTarget] (val x: Self) extends AnyVal {
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
    def setId(value: TargetId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TargetType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

