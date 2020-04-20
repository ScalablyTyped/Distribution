package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancePortStatesRequest extends js.Object {
  /**
    * The name of the instance.
    */
  var instanceName: ResourceName = js.native
}

object GetInstancePortStatesRequest {
  @scala.inline
  def apply(instanceName: ResourceName): GetInstancePortStatesRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstancePortStatesRequest]
  }
}

