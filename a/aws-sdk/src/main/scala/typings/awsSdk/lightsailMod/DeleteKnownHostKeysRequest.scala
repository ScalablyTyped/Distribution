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
}

