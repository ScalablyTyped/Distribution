package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientConfig extends js.Object {
  var asyncResponseTimeout: js.UndefOr[Double] = js.native
  var autoPoll: js.UndefOr[Boolean] = js.native
  var baseUrl: String = js.native
  var interceptors: js.UndefOr[Interceptor | js.Array[Interceptor]] = js.native
  var interval: js.UndefOr[Double] = js.native
  var lockDuration: js.UndefOr[Double] = js.native
  var maxParallelExecutions: js.UndefOr[Double] = js.native
  var maxTasks: js.UndefOr[Double] = js.native
  var use: js.UndefOr[Middleware | js.Array[Middleware]] = js.native
  var workerId: js.UndefOr[String] = js.native
}

object ClientConfig {
  @scala.inline
  def apply(baseUrl: String): ClientConfig = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
  @scala.inline
  implicit class ClientConfigOps[Self <: ClientConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsyncResponseTimeout(value: Double): Self = this.set("asyncResponseTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncResponseTimeout: Self = this.set("asyncResponseTimeout", js.undefined)
    @scala.inline
    def setAutoPoll(value: Boolean): Self = this.set("autoPoll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPoll: Self = this.set("autoPoll", js.undefined)
    @scala.inline
    def setInterceptorsVarargs(value: Interceptor*): Self = this.set("interceptors", js.Array(value :_*))
    @scala.inline
    def setInterceptorsFunction1(value: /* config */ js.Any => js.Any): Self = this.set("interceptors", js.Any.fromFunction1(value))
    @scala.inline
    def setInterceptors(value: Interceptor | js.Array[Interceptor]): Self = this.set("interceptors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterceptors: Self = this.set("interceptors", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setLockDuration(value: Double): Self = this.set("lockDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockDuration: Self = this.set("lockDuration", js.undefined)
    @scala.inline
    def setMaxParallelExecutions(value: Double): Self = this.set("maxParallelExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxParallelExecutions: Self = this.set("maxParallelExecutions", js.undefined)
    @scala.inline
    def setMaxTasks(value: Double): Self = this.set("maxTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTasks: Self = this.set("maxTasks", js.undefined)
    @scala.inline
    def setUseVarargs(value: Middleware*): Self = this.set("use", js.Array(value :_*))
    @scala.inline
    def setUseFunction1(value: /* client */ Client => Unit): Self = this.set("use", js.Any.fromFunction1(value))
    @scala.inline
    def setUse(value: Middleware | js.Array[Middleware]): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
    @scala.inline
    def setWorkerId(value: String): Self = this.set("workerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerId: Self = this.set("workerId", js.undefined)
  }
  
}

