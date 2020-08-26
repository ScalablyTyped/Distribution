package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancePortStatesResult extends js.Object {
  /**
    * An array of objects that describe the firewall port states for the specified instance.
    */
  var portStates: js.UndefOr[InstancePortStateList] = js.native
}

object GetInstancePortStatesResult {
  @scala.inline
  def apply(): GetInstancePortStatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstancePortStatesResult]
  }
  @scala.inline
  implicit class GetInstancePortStatesResultOps[Self <: GetInstancePortStatesResult] (val x: Self) extends AnyVal {
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
    def setPortStatesVarargs(value: InstancePortState*): Self = this.set("portStates", js.Array(value :_*))
    @scala.inline
    def setPortStates(value: InstancePortStateList): Self = this.set("portStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortStates: Self = this.set("portStates", js.undefined)
  }
  
}

