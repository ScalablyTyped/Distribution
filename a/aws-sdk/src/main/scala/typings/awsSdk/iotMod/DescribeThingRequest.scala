package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeThingRequest extends js.Object {
  /**
    * The name of the thing.
    */
  var thingName: ThingName = js.native
}

object DescribeThingRequest {
  @scala.inline
  def apply(thingName: ThingName): DescribeThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingRequest]
  }
}

