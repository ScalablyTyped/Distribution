package typings.azureDashMobileDashServicesDashClient.MicrosoftNs.WindowsAzureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeApiOptions extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[js.Object] = js.undefined
}

object InvokeApiOptions {
  @scala.inline
  def apply(
    body: js.Any = null,
    headers: js.Object = null,
    method: String = null,
    parameters: js.Object = null
  ): InvokeApiOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[InvokeApiOptions]
  }
}

