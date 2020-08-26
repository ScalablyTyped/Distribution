package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateHostsResult extends js.Object {
  /**
    * The ID of the allocated Dedicated Host. This is used to launch an instance onto a specific host.
    */
  var HostIds: js.UndefOr[ResponseHostIdList] = js.native
}

object AllocateHostsResult {
  @scala.inline
  def apply(): AllocateHostsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateHostsResult]
  }
  @scala.inline
  implicit class AllocateHostsResultOps[Self <: AllocateHostsResult] (val x: Self) extends AnyVal {
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
    def setHostIdsVarargs(value: String*): Self = this.set("HostIds", js.Array(value :_*))
    @scala.inline
    def setHostIds(value: ResponseHostIdList): Self = this.set("HostIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostIds: Self = this.set("HostIds", js.undefined)
  }
  
}

