package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteKnownHostKeysRequest extends js.Object {
  /**
    * The name of the instance for which you want to reset the host key or certificate.
    */
  var instanceName: ResourceName = js.native
}

object DeleteKnownHostKeysRequest {
  @scala.inline
  def apply(instanceName: ResourceName): DeleteKnownHostKeysRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKnownHostKeysRequest]
  }
  @scala.inline
  implicit class DeleteKnownHostKeysRequestOps[Self <: DeleteKnownHostKeysRequest] (val x: Self) extends AnyVal {
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
    def setInstanceName(value: ResourceName): Self = this.set("instanceName", value.asInstanceOf[js.Any])
  }
  
}

