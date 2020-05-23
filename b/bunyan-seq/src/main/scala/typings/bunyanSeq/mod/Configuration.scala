package typings.bunyanSeq.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var batchSizeLimit: js.UndefOr[Double] = js.undefined
  var eventSizeLimit: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var maxBatchingTime: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
  var reemitErrorEvents: js.UndefOr[Boolean] = js.undefined
  var serverUrl: js.UndefOr[String] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    apiKey: String = null,
    batchSizeLimit: js.UndefOr[Double] = js.undefined,
    eventSizeLimit: js.UndefOr[Double] = js.undefined,
    level: String = null,
    maxBatchingTime: js.UndefOr[Double] = js.undefined,
    name: String = null,
    onError: /* e */ Error => Unit = null,
    reemitErrorEvents: js.UndefOr[Boolean] = js.undefined,
    serverUrl: String = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (!js.isUndefined(batchSizeLimit)) __obj.updateDynamic("batchSizeLimit")(batchSizeLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(eventSizeLimit)) __obj.updateDynamic("eventSizeLimit")(eventSizeLimit.get.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBatchingTime)) __obj.updateDynamic("maxBatchingTime")(maxBatchingTime.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (!js.isUndefined(reemitErrorEvents)) __obj.updateDynamic("reemitErrorEvents")(reemitErrorEvents.get.asInstanceOf[js.Any])
    if (serverUrl != null) __obj.updateDynamic("serverUrl")(serverUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

