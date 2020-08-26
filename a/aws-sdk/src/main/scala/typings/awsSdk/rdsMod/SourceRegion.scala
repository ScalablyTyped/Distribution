package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceRegion extends js.Object {
  /**
    * The endpoint for the source AWS Region endpoint.
    */
  var Endpoint: js.UndefOr[String] = js.native
  /**
    * The name of the source AWS Region.
    */
  var RegionName: js.UndefOr[String] = js.native
  /**
    * The status of the source AWS Region.
    */
  var Status: js.UndefOr[String] = js.native
}

object SourceRegion {
  @scala.inline
  def apply(): SourceRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceRegion]
  }
  @scala.inline
  implicit class SourceRegionOps[Self <: SourceRegion] (val x: Self) extends AnyVal {
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
    def setRegionName(value: String): Self = this.set("RegionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionName: Self = this.set("RegionName", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

