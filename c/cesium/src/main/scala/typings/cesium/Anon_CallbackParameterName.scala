package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackParameterName extends js.Object {
  var callbackParameterName: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[js.Any] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
}

object Anon_CallbackParameterName {
  @scala.inline
  def apply(callbackParameterName: String = null, parameters: js.Any = null, proxy: js.Any = null): Anon_CallbackParameterName = {
    val __obj = js.Dynamic.literal()
    if (callbackParameterName != null) __obj.updateDynamic("callbackParameterName")(callbackParameterName)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[Anon_CallbackParameterName]
  }
}

