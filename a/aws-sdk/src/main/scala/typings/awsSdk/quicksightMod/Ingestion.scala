package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ingestion extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typings.awsSdk.quicksightMod.Arn = js.native
  /**
    * The time that this ingestion started.
    */
  var CreatedTime: timestamp = js.native
  /**
    * Error information for this ingestion.
    */
  var ErrorInfo: js.UndefOr[typings.awsSdk.quicksightMod.ErrorInfo] = js.native
  /**
    * Ingestion ID.
    */
  var IngestionId: js.UndefOr[typings.awsSdk.quicksightMod.IngestionId] = js.native
  /**
    * The size of the data ingested, in bytes.
    */
  var IngestionSizeInBytes: js.UndefOr[long] = js.native
  /**
    * Ingestion status.
    */
  var IngestionStatus: typings.awsSdk.quicksightMod.IngestionStatus = js.native
  /**
    * The time that this ingestion took, measured in seconds.
    */
  var IngestionTimeInSeconds: js.UndefOr[long] = js.native
  var QueueInfo: js.UndefOr[typings.awsSdk.quicksightMod.QueueInfo] = js.native
  /**
    * Event source for this ingestion.
    */
  var RequestSource: js.UndefOr[IngestionRequestSource] = js.native
  /**
    * Type of this ingestion.
    */
  var RequestType: js.UndefOr[IngestionRequestType] = js.native
  var RowInfo: js.UndefOr[typings.awsSdk.quicksightMod.RowInfo] = js.native
}

object Ingestion {
  @scala.inline
  def apply(Arn: Arn, CreatedTime: timestamp, IngestionStatus: IngestionStatus): Ingestion = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], IngestionStatus = IngestionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ingestion]
  }
  @scala.inline
  implicit class IngestionOps[Self <: Ingestion] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedTime(value: timestamp): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setIngestionStatus(value: IngestionStatus): Self = this.set("IngestionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorInfo(value: ErrorInfo): Self = this.set("ErrorInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorInfo: Self = this.set("ErrorInfo", js.undefined)
    @scala.inline
    def setIngestionId(value: IngestionId): Self = this.set("IngestionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngestionId: Self = this.set("IngestionId", js.undefined)
    @scala.inline
    def setIngestionSizeInBytes(value: long): Self = this.set("IngestionSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngestionSizeInBytes: Self = this.set("IngestionSizeInBytes", js.undefined)
    @scala.inline
    def setIngestionTimeInSeconds(value: long): Self = this.set("IngestionTimeInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngestionTimeInSeconds: Self = this.set("IngestionTimeInSeconds", js.undefined)
    @scala.inline
    def setQueueInfo(value: QueueInfo): Self = this.set("QueueInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueInfo: Self = this.set("QueueInfo", js.undefined)
    @scala.inline
    def setRequestSource(value: IngestionRequestSource): Self = this.set("RequestSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestSource: Self = this.set("RequestSource", js.undefined)
    @scala.inline
    def setRequestType(value: IngestionRequestType): Self = this.set("RequestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("RequestType", js.undefined)
    @scala.inline
    def setRowInfo(value: RowInfo): Self = this.set("RowInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowInfo: Self = this.set("RowInfo", js.undefined)
  }
  
}

