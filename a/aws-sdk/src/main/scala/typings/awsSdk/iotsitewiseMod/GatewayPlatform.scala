package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayPlatform extends js.Object {
  /**
    * A gateway that runs on AWS IoT Greengrass.
    */
  var greengrass: Greengrass = js.native
}

object GatewayPlatform {
  @scala.inline
  def apply(greengrass: Greengrass): GatewayPlatform = {
    val __obj = js.Dynamic.literal(greengrass = greengrass.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayPlatform]
  }
}

