package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUsage extends js.Object {
  /**
    * The number of Lambda functions.
    */
  var FunctionCount: js.UndefOr[Long] = js.native
  /**
    * The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
    */
  var TotalCodeSize: js.UndefOr[Long] = js.native
}

object AccountUsage {
  @scala.inline
  def apply(FunctionCount: js.UndefOr[Long] = js.undefined, TotalCodeSize: js.UndefOr[Long] = js.undefined): AccountUsage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FunctionCount)) __obj.updateDynamic("FunctionCount")(FunctionCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCodeSize)) __obj.updateDynamic("TotalCodeSize")(TotalCodeSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountUsage]
  }
}

