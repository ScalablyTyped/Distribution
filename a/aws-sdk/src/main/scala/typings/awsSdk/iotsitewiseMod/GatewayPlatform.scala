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
  @scala.inline
  implicit class GatewayPlatformOps[Self <: GatewayPlatform] (val x: Self) extends AnyVal {
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
    def setGreengrass(value: Greengrass): Self = this.set("greengrass", value.asInstanceOf[js.Any])
  }
  
}

