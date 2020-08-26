package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumedLicenseSummary extends js.Object {
  /**
    * Number of licenses consumed by the resource.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.native
  /**
    * Resource type of the resource consuming a license.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.native
}

object ConsumedLicenseSummary {
  @scala.inline
  def apply(): ConsumedLicenseSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumedLicenseSummary]
  }
  @scala.inline
  implicit class ConsumedLicenseSummaryOps[Self <: ConsumedLicenseSummary] (val x: Self) extends AnyVal {
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
    def setConsumedLicenses(value: BoxLong): Self = this.set("ConsumedLicenses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumedLicenses: Self = this.set("ConsumedLicenses", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

