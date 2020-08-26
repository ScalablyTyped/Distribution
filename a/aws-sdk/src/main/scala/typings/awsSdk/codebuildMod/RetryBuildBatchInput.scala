package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryBuildBatchInput extends js.Object {
  /**
    * Specifies the identifier of the batch build to restart.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  /**
    * A unique, case sensitive identifier you provide to ensure the idempotency of the RetryBuildBatch request. The token is included in the RetryBuildBatch request and is valid for five minutes. If you repeat the RetryBuildBatch request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
    */
  var idempotencyToken: js.UndefOr[String] = js.native
  /**
    * Specifies the type of retry to perform.
    */
  var retryType: js.UndefOr[RetryBuildBatchType] = js.native
}

object RetryBuildBatchInput {
  @scala.inline
  def apply(): RetryBuildBatchInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryBuildBatchInput]
  }
  @scala.inline
  implicit class RetryBuildBatchInputOps[Self <: RetryBuildBatchInput] (val x: Self) extends AnyVal {
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
    def setId(value: NonEmptyString): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdempotencyToken(value: String): Self = this.set("idempotencyToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdempotencyToken: Self = this.set("idempotencyToken", js.undefined)
    @scala.inline
    def setRetryType(value: RetryBuildBatchType): Self = this.set("retryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryType: Self = this.set("retryType", js.undefined)
  }
  
}

