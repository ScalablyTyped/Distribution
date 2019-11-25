package typings.camundaDashExternalDashTaskDashClientDashJs.camundaDashExternalDashTaskDashClientDashJsMod

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
    asyncResponseTimeout: Int | Double = null,
    autoPoll: js.UndefOr[Boolean] = js.undefined,
    interceptors: Interceptor | js.Array[Interceptor] = null,
    interval: Int | Double = null,
    lockDuration: Int | Double = null,
    maxParallelExecutions: Int | Double = null,
    maxTasks: Int | Double = null,
    use: Middleware | js.Array[Middleware] = null,
    workerId: String = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    if (asyncResponseTimeout != null) __obj.updateDynamic("asyncResponseTimeout")(asyncResponseTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPoll)) __obj.updateDynamic("autoPoll")(autoPoll.asInstanceOf[js.Any])
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (lockDuration != null) __obj.updateDynamic("lockDuration")(lockDuration.asInstanceOf[js.Any])
    if (maxParallelExecutions != null) __obj.updateDynamic("maxParallelExecutions")(maxParallelExecutions.asInstanceOf[js.Any])
    if (maxTasks != null) __obj.updateDynamic("maxTasks")(maxTasks.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    if (workerId != null) __obj.updateDynamic("workerId")(workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
}

