package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelIngestionResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the data ingestion.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * An ID for the ingestion.
    */
  var IngestionId: js.UndefOr[typings.awsSdk.quicksightMod.IngestionId] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[java.lang.String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object CancelIngestionResponse {
  @scala.inline
  def apply(): CancelIngestionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelIngestionResponse]
  }
  @scala.inline
  implicit class CancelIngestionResponseOps[Self <: CancelIngestionResponse] (val x: Self) extends AnyVal {
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
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setIngestionId(value: IngestionId): Self = this.set("IngestionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngestionId: Self = this.set("IngestionId", js.undefined)
    @scala.inline
    def setRequestId(value: java.lang.String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

