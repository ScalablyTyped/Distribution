package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceResponse extends js.Object {
  /**
    * A complex type that contains information about a specified instance.
    */
  var Instance: js.UndefOr[typings.awsSdk.servicediscoveryMod.Instance] = js.native
}

object GetInstanceResponse {
  @scala.inline
  def apply(): GetInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceResponse]
  }
  @scala.inline
  implicit class GetInstanceResponseOps[Self <: GetInstanceResponse] (val x: Self) extends AnyVal {
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
    def setInstance(value: Instance): Self = this.set("Instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("Instance", js.undefined)
  }
  
}

