package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OTAUpdateSummary extends js.Object {
  /**
    * The date when the OTA update was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.native
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.native
}

object OTAUpdateSummary {
  @scala.inline
  def apply(): OTAUpdateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OTAUpdateSummary]
  }
  @scala.inline
  implicit class OTAUpdateSummaryOps[Self <: OTAUpdateSummary] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: DateType): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setOtaUpdateArn(value: OTAUpdateArn): Self = this.set("otaUpdateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtaUpdateArn: Self = this.set("otaUpdateArn", js.undefined)
    @scala.inline
    def setOtaUpdateId(value: OTAUpdateId): Self = this.set("otaUpdateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtaUpdateId: Self = this.set("otaUpdateId", js.undefined)
  }
  
}

