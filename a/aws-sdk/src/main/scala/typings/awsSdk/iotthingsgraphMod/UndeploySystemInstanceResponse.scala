package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndeploySystemInstanceResponse extends js.Object {
  /**
    * An object that contains summary information about the system instance that was removed from its target.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.native
}

object UndeploySystemInstanceResponse {
  @scala.inline
  def apply(): UndeploySystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeploySystemInstanceResponse]
  }
  @scala.inline
  implicit class UndeploySystemInstanceResponseOps[Self <: UndeploySystemInstanceResponse] (val x: Self) extends AnyVal {
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
    def setSummary(value: SystemInstanceSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
  
}

