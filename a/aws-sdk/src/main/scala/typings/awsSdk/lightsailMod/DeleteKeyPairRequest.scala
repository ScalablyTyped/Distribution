package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteKeyPairRequest extends js.Object {
  /**
    * The name of the key pair to delete.
    */
  var keyPairName: ResourceName = js.native
}

object DeleteKeyPairRequest {
  @scala.inline
  def apply(keyPairName: ResourceName): DeleteKeyPairRequest = {
    val __obj = js.Dynamic.literal(keyPairName = keyPairName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKeyPairRequest]
  }
  @scala.inline
  implicit class DeleteKeyPairRequestOps[Self <: DeleteKeyPairRequest] (val x: Self) extends AnyVal {
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
    def setKeyPairName(value: ResourceName): Self = this.set("keyPairName", value.asInstanceOf[js.Any])
  }
  
}

