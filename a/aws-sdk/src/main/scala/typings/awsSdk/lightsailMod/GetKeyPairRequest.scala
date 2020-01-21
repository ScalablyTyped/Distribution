package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyPairRequest extends js.Object {
  /**
    * The name of the key pair for which you are requesting information.
    */
  var keyPairName: ResourceName = js.native
}

object GetKeyPairRequest {
  @scala.inline
  def apply(keyPairName: ResourceName): GetKeyPairRequest = {
    val __obj = js.Dynamic.literal(keyPairName = keyPairName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetKeyPairRequest]
  }
}

