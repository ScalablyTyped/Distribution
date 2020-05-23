package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends js.Object {
  var asyncResponseTimeout: js.UndefOr[Double] = js.undefined
  var autoPoll: js.UndefOr[Boolean] = js.undefined
  var baseUrl: String
  var interceptors: js.UndefOr[Interceptor | js.Array[Interceptor]] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var lockDuration: js.UndefOr[Double] = js.undefined
  var maxParallelExecutions: js.UndefOr[Double] = js.undefined
  var maxTasks: js.UndefOr[Double] = js.undefined
  var use: js.UndefOr[Middleware | js.Array[Middleware]] = js.undefined
  var workerId: js.UndefOr[String] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(
    baseUrl: String,
    asyncResponseTimeout: js.UndefOr[Double] = js.undefined,
    autoPoll: js.UndefOr[Boolean] = js.undefined,
    interceptors: Interceptor | js.Array[Interceptor] = null,
    interval: js.UndefOr[Double] = js.undefined,
    lockDuration: js.UndefOr[Double] = js.undefined,
    maxParallelExecutions: js.UndefOr[Double] = js.undefined,
    maxTasks: js.UndefOr[Double] = js.undefined,
    use: Middleware | js.Array[Middleware] = null,
    workerId: String = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncResponseTimeout)) __obj.updateDynamic("asyncResponseTimeout")(asyncResponseTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPoll)) __obj.updateDynamic("autoPoll")(autoPoll.get.asInstanceOf[js.Any])
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockDuration)) __obj.updateDynamic("lockDuration")(lockDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxParallelExecutions)) __obj.updateDynamic("maxParallelExecutions")(maxParallelExecutions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTasks)) __obj.updateDynamic("maxTasks")(maxTasks.get.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    if (workerId != null) __obj.updateDynamic("workerId")(workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
}

