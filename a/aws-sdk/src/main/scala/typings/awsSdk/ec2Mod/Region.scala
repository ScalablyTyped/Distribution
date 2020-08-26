package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Region extends js.Object {
  /**
    * The Region service endpoint.
    */
  var Endpoint: js.UndefOr[String] = js.native
  /**
    * The Region opt-in status. The possible values are opt-in-not-required, opted-in, and not-opted-in.
    */
  var OptInStatus: js.UndefOr[String] = js.native
  /**
    * The name of the Region.
    */
  var RegionName: js.UndefOr[String] = js.native
}

object Region {
  @scala.inline
  def apply(): Region = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Region]
  }
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpoint(value: String): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    @scala.inline
    def setOptInStatus(value: String): Self = this.set("OptInStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptInStatus: Self = this.set("OptInStatus", js.undefined)
    @scala.inline
    def setRegionName(value: String): Self = this.set("RegionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionName: Self = this.set("RegionName", js.undefined)
  }
  
}

