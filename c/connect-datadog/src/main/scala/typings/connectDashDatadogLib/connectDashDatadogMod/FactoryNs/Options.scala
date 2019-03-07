package typings
package connectDashDatadogLib.connectDashDatadogMod.FactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dogstatsd: js.UndefOr[nodeDashDogstatsdLib.nodeDashDogstatsdMod.StatsDClient] = js.undefined
  var method: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[scala.Boolean] = js.undefined
  var protocol: js.UndefOr[scala.Boolean] = js.undefined
  var response_code: js.UndefOr[scala.Boolean] = js.undefined
  var stat: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dogstatsd: nodeDashDogstatsdLib.nodeDashDogstatsdMod.StatsDClient = null,
    method: js.UndefOr[scala.Boolean] = js.undefined,
    path: js.UndefOr[scala.Boolean] = js.undefined,
    protocol: js.UndefOr[scala.Boolean] = js.undefined,
    response_code: js.UndefOr[scala.Boolean] = js.undefined,
    stat: java.lang.String = null,
    tags: js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dogstatsd != null) __obj.updateDynamic("dogstatsd")(dogstatsd)
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(protocol)) __obj.updateDynamic("protocol")(protocol)
    if (!js.isUndefined(response_code)) __obj.updateDynamic("response_code")(response_code)
    if (stat != null) __obj.updateDynamic("stat")(stat)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Options]
  }
}

