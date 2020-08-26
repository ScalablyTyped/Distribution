package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIngestionResponse extends js.Object {
  /**
    * Information about the ingestion.
    */
  var Ingestion: js.UndefOr[typings.awsSdk.quicksightMod.Ingestion] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[java.lang.String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object DescribeIngestionResponse {
  @scala.inline
  def apply(): DescribeIngestionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIngestionResponse]
  }
  @scala.inline
  implicit class DescribeIngestionResponseOps[Self <: DescribeIngestionResponse] (val x: Self) extends AnyVal {
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
    def setIngestion(value: Ingestion): Self = this.set("Ingestion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngestion: Self = this.set("Ingestion", js.undefined)
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

