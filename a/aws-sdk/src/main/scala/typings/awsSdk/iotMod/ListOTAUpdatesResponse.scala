package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOTAUpdatesResponse extends js.Object {
  /**
    * A token to use to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of OTA update jobs.
    */
  var otaUpdates: js.UndefOr[OTAUpdatesSummary] = js.native
}

object ListOTAUpdatesResponse {
  @scala.inline
  def apply(): ListOTAUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOTAUpdatesResponse]
  }
  @scala.inline
  implicit class ListOTAUpdatesResponseOps[Self <: ListOTAUpdatesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setOtaUpdatesVarargs(value: OTAUpdateSummary*): Self = this.set("otaUpdates", js.Array(value :_*))
    @scala.inline
    def setOtaUpdates(value: OTAUpdatesSummary): Self = this.set("otaUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtaUpdates: Self = this.set("otaUpdates", js.undefined)
  }
  
}

