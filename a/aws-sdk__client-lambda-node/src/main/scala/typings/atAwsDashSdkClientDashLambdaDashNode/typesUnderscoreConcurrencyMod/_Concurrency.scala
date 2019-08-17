package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreConcurrencyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Concurrency extends js.Object {
  /**
    * <p>The number of concurrent executions reserved for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
    */
  var ReservedConcurrentExecutions: js.UndefOr[Double] = js.undefined
}

object _Concurrency {
  @scala.inline
  def apply(ReservedConcurrentExecutions: Int | Double = null): _Concurrency = {
    val __obj = js.Dynamic.literal()
    if (ReservedConcurrentExecutions != null) __obj.updateDynamic("ReservedConcurrentExecutions")(ReservedConcurrentExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Concurrency]
  }
}

