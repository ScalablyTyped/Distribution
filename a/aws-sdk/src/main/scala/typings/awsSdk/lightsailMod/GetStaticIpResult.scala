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
  def apply(): GetStaticIpResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStaticIpResult]
  }
  @scala.inline
  implicit class GetStaticIpResultOps[Self <: GetStaticIpResult] (val x: Self) extends AnyVal {
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
    def setStaticIp(value: StaticIp): Self = this.set("staticIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticIp: Self = this.set("staticIp", js.undefined)
  }
  
}

