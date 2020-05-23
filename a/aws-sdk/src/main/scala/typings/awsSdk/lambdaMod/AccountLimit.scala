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
  def apply(
    CodeSizeUnzipped: js.UndefOr[Long] = js.undefined,
    CodeSizeZipped: js.UndefOr[Long] = js.undefined,
    ConcurrentExecutions: js.UndefOr[Integer] = js.undefined,
    TotalCodeSize: js.UndefOr[Long] = js.undefined,
    UnreservedConcurrentExecutions: js.UndefOr[UnreservedConcurrentExecutions] = js.undefined
  ): AccountLimit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CodeSizeUnzipped)) __obj.updateDynamic("CodeSizeUnzipped")(CodeSizeUnzipped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CodeSizeZipped)) __obj.updateDynamic("CodeSizeZipped")(CodeSizeZipped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ConcurrentExecutions)) __obj.updateDynamic("ConcurrentExecutions")(ConcurrentExecutions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCodeSize)) __obj.updateDynamic("TotalCodeSize")(TotalCodeSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(UnreservedConcurrentExecutions)) __obj.updateDynamic("UnreservedConcurrentExecutions")(UnreservedConcurrentExecutions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLimit]
  }
}

