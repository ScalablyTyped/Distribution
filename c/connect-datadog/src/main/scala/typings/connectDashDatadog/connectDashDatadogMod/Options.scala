package typings.connectDashDatadog.connectDashDatadogMod

import typings.nodeDashDogstatsd.nodeDashDogstatsdMod.StatsDClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var base_url: js.UndefOr[Boolean] = js.undefined
  var dogstatsd: js.UndefOr[StatsDClient] = js.undefined
  var method: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[Boolean] = js.undefined
  var protocol: js.UndefOr[Boolean] = js.undefined
  var response_code: js.UndefOr[Boolean] = js.undefined
  var stat: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    base_url: js.UndefOr[Boolean] = js.undefined,
    dogstatsd: StatsDClient = null,
    method: js.UndefOr[Boolean] = js.undefined,
    path: js.UndefOr[Boolean] = js.undefined,
    protocol: js.UndefOr[Boolean] = js.undefined,
    response_code: js.UndefOr[Boolean] = js.undefined,
    stat: String = null,
    tags: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base_url)) __obj.updateDynamic("base_url")(base_url)
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

