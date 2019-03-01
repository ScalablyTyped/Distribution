package typings
package backboneDashFetchDashCacheLib.backboneDashFetchDashCacheMod.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFetchWithCacheOptions extends ModelFetchWithCacheOptions {
  @JSName("prefillSuccess")
  var prefillSuccess_CollectionFetchWithCacheOptions: js.UndefOr[js.Function1[/* self */ js.Any, scala.Unit]] = js.undefined
}

object CollectionFetchWithCacheOptions {
  @scala.inline
  def apply(
    beforeSend: js.Function1[/* jqxhr */ jqueryLib.JQueryXHR, scala.Unit] = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    context: js.Any = null,
    data: js.Any = null,
    error: js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* jqxhr */ js.UndefOr[jqueryLib.JQueryXHR], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    expires: scala.Int | scala.Double = null,
    parse: js.Any = null,
    prefill: js.UndefOr[scala.Boolean] = js.undefined,
    prefillExpires: scala.Int | scala.Double = null,
    prefillSuccess: js.Function1[/* self */ js.Any, scala.Unit] = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* response */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    url: java.lang.String = null,
    validate: js.UndefOr[scala.Boolean] = js.undefined
  ): CollectionFetchWithCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (context != null) __obj.updateDynamic("context")(context)
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (!js.isUndefined(prefill)) __obj.updateDynamic("prefill")(prefill)
    if (prefillExpires != null) __obj.updateDynamic("prefillExpires")(prefillExpires.asInstanceOf[js.Any])
    if (prefillSuccess != null) __obj.updateDynamic("prefillSuccess")(prefillSuccess)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (success != null) __obj.updateDynamic("success")(success)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[CollectionFetchWithCacheOptions]
  }
}

