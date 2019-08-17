package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAccountUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AccountUsage extends js.Object {
  /**
    * <p>The number of your account's existing functions per region.</p>
    */
  var FunctionCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>Total size, in bytes, of the account's deployment packages per region.</p>
    */
  var TotalCodeSize: js.UndefOr[Double] = js.undefined
}

object _AccountUsage {
  @scala.inline
  def apply(FunctionCount: Int | Double = null, TotalCodeSize: Int | Double = null): _AccountUsage = {
    val __obj = js.Dynamic.literal()
    if (FunctionCount != null) __obj.updateDynamic("FunctionCount")(FunctionCount.asInstanceOf[js.Any])
    if (TotalCodeSize != null) __obj.updateDynamic("TotalCodeSize")(TotalCodeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AccountUsage]
  }
}

