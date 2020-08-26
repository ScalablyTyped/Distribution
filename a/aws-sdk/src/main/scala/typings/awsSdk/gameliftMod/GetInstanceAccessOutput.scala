package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceAccessOutput extends js.Object {
  /**
    * The connection information for a fleet instance, including IP address and access credentials.
    */
  var InstanceAccess: js.UndefOr[typings.awsSdk.gameliftMod.InstanceAccess] = js.native
}

object GetInstanceAccessOutput {
  @scala.inline
  def apply(): GetInstanceAccessOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceAccessOutput]
  }
  @scala.inline
  implicit class GetInstanceAccessOutputOps[Self <: GetInstanceAccessOutput] (val x: Self) extends AnyVal {
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
    def setInstanceAccess(value: InstanceAccess): Self = this.set("InstanceAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceAccess: Self = this.set("InstanceAccess", js.undefined)
  }
  
}

