package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCloudFormationStackRequest extends js.Object {
  /**
    * An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one instance entry at a time in this array. You will get an invalid parameter error if you pass more than one instance entry in this array.
    */
  var instances: InstanceEntryList = js.native
}

object CreateCloudFormationStackRequest {
  @scala.inline
  def apply(instances: InstanceEntryList): CreateCloudFormationStackRequest = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCloudFormationStackRequest]
  }
}

