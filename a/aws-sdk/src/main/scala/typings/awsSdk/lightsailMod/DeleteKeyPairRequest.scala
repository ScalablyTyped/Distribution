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
}

