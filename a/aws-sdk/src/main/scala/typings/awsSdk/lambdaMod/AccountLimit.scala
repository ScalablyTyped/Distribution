package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountLimit extends js.Object {
  /**
    * The maximum size of a function's deployment package and layers when they're extracted.
    */
  var CodeSizeUnzipped: js.UndefOr[Long] = js.native
  /**
    * The maximum size of a deployment package when it's uploaded directly to AWS Lambda. Use Amazon S3 for larger files.
    */
  var CodeSizeZipped: js.UndefOr[Long] = js.native
  /**
    * The maximum number of simultaneous function executions.
    */
  var ConcurrentExecutions: js.UndefOr[Integer] = js.native
  /**
    * The amount of storage space that you can use for all deployment packages and layer archives.
    */
  var TotalCodeSize: js.UndefOr[Long] = js.native
  /**
    * The maximum number of simultaneous function executions, minus the capacity that's reserved for individual functions with PutFunctionConcurrency.
    */
  var UnreservedConcurrentExecutions: js.UndefOr[typings.awsSdk.lambdaMod.UnreservedConcurrentExecutions] = js.native
}

object AccountLimit {
  @scala.inline
  def apply(): AccountLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLimit]
  }
  @scala.inline
  implicit class AccountLimitOps[Self <: AccountLimit] (val x: Self) extends AnyVal {
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
    def setCodeSizeUnzipped(value: Long): Self = this.set("CodeSizeUnzipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeSizeUnzipped: Self = this.set("CodeSizeUnzipped", js.undefined)
    @scala.inline
    def setCodeSizeZipped(value: Long): Self = this.set("CodeSizeZipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeSizeZipped: Self = this.set("CodeSizeZipped", js.undefined)
    @scala.inline
    def setConcurrentExecutions(value: Integer): Self = this.set("ConcurrentExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrentExecutions: Self = this.set("ConcurrentExecutions", js.undefined)
    @scala.inline
    def setTotalCodeSize(value: Long): Self = this.set("TotalCodeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCodeSize: Self = this.set("TotalCodeSize", js.undefined)
    @scala.inline
    def setUnreservedConcurrentExecutions(value: UnreservedConcurrentExecutions): Self = this.set("UnreservedConcurrentExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnreservedConcurrentExecutions: Self = this.set("UnreservedConcurrentExecutions", js.undefined)
  }
  
}

