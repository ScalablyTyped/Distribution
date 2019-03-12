package typings
package bunyanDashSeqLib.bunyanDashSeqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  var batchSizeLimit: js.UndefOr[scala.Double] = js.undefined
  var eventSizeLimit: js.UndefOr[scala.Double] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var maxBatchingTime: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ stdLib.Error, scala.Unit]] = js.undefined
  var reemitErrorEvents: js.UndefOr[scala.Boolean] = js.undefined
  var serverUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    apiKey: java.lang.String = null,
    batchSizeLimit: scala.Int | scala.Double = null,
    eventSizeLimit: scala.Int | scala.Double = null,
    level: java.lang.String = null,
    maxBatchingTime: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onError: /* e */ stdLib.Error => scala.Unit = null,
    reemitErrorEvents: js.UndefOr[scala.Boolean] = js.undefined,
    serverUrl: java.lang.String = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (batchSizeLimit != null) __obj.updateDynamic("batchSizeLimit")(batchSizeLimit.asInstanceOf[js.Any])
    if (eventSizeLimit != null) __obj.updateDynamic("eventSizeLimit")(eventSizeLimit.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level)
    if (maxBatchingTime != null) __obj.updateDynamic("maxBatchingTime")(maxBatchingTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (!js.isUndefined(reemitErrorEvents)) __obj.updateDynamic("reemitErrorEvents")(reemitErrorEvents)
    if (serverUrl != null) __obj.updateDynamic("serverUrl")(serverUrl)
    __obj.asInstanceOf[Configuration]
  }
}

