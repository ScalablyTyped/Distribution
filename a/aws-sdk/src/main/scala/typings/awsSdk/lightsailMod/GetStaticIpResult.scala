package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStaticIpResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the requested static IP.
    */
  var staticIp: js.UndefOr[StaticIp] = js.native
}

object GetStaticIpResult {
  @scala.inline
  def apply(staticIp: StaticIp = null): GetStaticIpResult = {
    val __obj = js.Dynamic.literal()
    if (staticIp != null) __obj.updateDynamic("staticIp")(staticIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStaticIpResult]
  }
}

