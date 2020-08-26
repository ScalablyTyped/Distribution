package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateTopicOptions> */
@js.native
trait CreateTopicOptions extends js.Object {
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.native
  var DuplicateDetectionHistoryTimeWindow: js.UndefOr[String] = js.native
  var EnableBatchedOperations: js.UndefOr[Boolean] = js.native
  var EnablePartitioning: js.UndefOr[Boolean] = js.native
  var MaxSizeInMegabytes: js.UndefOr[Double] = js.native
  var RequiresDuplicateDetection: js.UndefOr[Boolean] = js.native
  var SizeInBytes: js.UndefOr[Boolean] = js.native
  var SupportOrdering: js.UndefOr[Boolean] = js.native
}

object CreateTopicOptions {
  @scala.inline
  def apply(): CreateTopicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTopicOptions]
  }
  @scala.inline
  implicit class CreateTopicOptionsOps[Self <: CreateTopicOptions] (val x: Self) extends AnyVal {
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
    def setDefaultMessageTimeToLive(value: String): Self = this.set("DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMessageTimeToLive: Self = this.set("DefaultMessageTimeToLive", js.undefined)
    @scala.inline
    def setDuplicateDetectionHistoryTimeWindow(value: String): Self = this.set("DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicateDetectionHistoryTimeWindow: Self = this.set("DuplicateDetectionHistoryTimeWindow", js.undefined)
    @scala.inline
    def setEnableBatchedOperations(value: Boolean): Self = this.set("EnableBatchedOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableBatchedOperations: Self = this.set("EnableBatchedOperations", js.undefined)
    @scala.inline
    def setEnablePartitioning(value: Boolean): Self = this.set("EnablePartitioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePartitioning: Self = this.set("EnablePartitioning", js.undefined)
    @scala.inline
    def setMaxSizeInMegabytes(value: Double): Self = this.set("MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSizeInMegabytes: Self = this.set("MaxSizeInMegabytes", js.undefined)
    @scala.inline
    def setRequiresDuplicateDetection(value: Boolean): Self = this.set("RequiresDuplicateDetection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiresDuplicateDetection: Self = this.set("RequiresDuplicateDetection", js.undefined)
    @scala.inline
    def setSizeInBytes(value: Boolean): Self = this.set("SizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInBytes: Self = this.set("SizeInBytes", js.undefined)
    @scala.inline
    def setSupportOrdering(value: Boolean): Self = this.set("SupportOrdering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportOrdering: Self = this.set("SupportOrdering", js.undefined)
  }
  
}

