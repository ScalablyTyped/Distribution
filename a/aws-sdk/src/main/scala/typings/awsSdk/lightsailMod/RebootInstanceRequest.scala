package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootInstanceRequest extends js.Object {
  /**
    * The name of the instance to reboot.
    */
  var instanceName: ResourceName = js.native
}

object RebootInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName): RebootInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootInstanceRequest]
  }
}

