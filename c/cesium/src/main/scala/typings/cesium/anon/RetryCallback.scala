package typings.cesium.anon

import typings.cesium.mod.DefaultProxy
import typings.cesium.mod.Resource
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryCallback extends js.Object {
  var callbackParameterName: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var proxy: js.UndefOr[DefaultProxy] = js.native
  var queryParameters: js.UndefOr[js.Any] = js.native
  var request: js.UndefOr[typings.std.Request] = js.native
  var retryAttempts: js.UndefOr[Double] = js.native
  var retryCallback: js.UndefOr[typings.cesium.mod.Resource.RetryCallback] = js.native
  var templateValues: js.UndefOr[js.Any] = js.native
  var url: String = js.native
}

object RetryCallback {
  @scala.inline
  def apply(url: String): RetryCallback = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryCallback]
  }
  @scala.inline
  implicit class RetryCallbackOps[Self <: RetryCallback] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackParameterName(value: String): Self = this.set("callbackParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackParameterName: Self = this.set("callbackParameterName", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setProxy(value: DefaultProxy): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setQueryParameters(value: js.Any): Self = this.set("queryParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParameters: Self = this.set("queryParameters", js.undefined)
    @scala.inline
    def setRequest(value: typings.std.Request): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setRetryAttempts(value: Double): Self = this.set("retryAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryAttempts: Self = this.set("retryAttempts", js.undefined)
    @scala.inline
    def setRetryCallback(value: (/* resource */ Resource, /* error */ Error) => Unit): Self = this.set("retryCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRetryCallback: Self = this.set("retryCallback", js.undefined)
    @scala.inline
    def setTemplateValues(value: js.Any): Self = this.set("templateValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateValues: Self = this.set("templateValues", js.undefined)
  }
  
}

