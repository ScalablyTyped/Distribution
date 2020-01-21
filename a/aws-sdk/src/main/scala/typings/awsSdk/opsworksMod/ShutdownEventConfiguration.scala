package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShutdownEventConfiguration extends js.Object {
  /**
    * Whether to enable Elastic Load Balancing connection draining. For more information, see Connection Draining 
    */
  var DelayUntilElbConnectionsDrained: js.UndefOr[Boolean] = js.native
  /**
    * The time, in seconds, that AWS OpsWorks Stacks will wait after triggering a Shutdown event before shutting down an instance.
    */
  var ExecutionTimeout: js.UndefOr[Integer] = js.native
}

object ShutdownEventConfiguration {
  @scala.inline
  def apply(
    DelayUntilElbConnectionsDrained: js.UndefOr[scala.Boolean] = js.undefined,
    ExecutionTimeout: Int | scala.Double = null
  ): ShutdownEventConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DelayUntilElbConnectionsDrained)) __obj.updateDynamic("DelayUntilElbConnectionsDrained")(DelayUntilElbConnectionsDrained.asInstanceOf[js.Any])
    if (ExecutionTimeout != null) __obj.updateDynamic("ExecutionTimeout")(ExecutionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShutdownEventConfiguration]
  }
}

