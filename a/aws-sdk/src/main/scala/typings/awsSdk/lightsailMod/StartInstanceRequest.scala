package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartInstanceRequest extends js.Object {
  /**
    * The name of the instance (a virtual private server) to start.
    */
  var instanceName: ResourceName = js.native
}

object StartInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName): StartInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInstanceRequest]
  }
}

