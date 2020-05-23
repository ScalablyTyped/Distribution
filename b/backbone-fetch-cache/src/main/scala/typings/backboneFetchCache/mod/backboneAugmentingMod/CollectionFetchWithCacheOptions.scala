package typings.backboneFetchCache.mod.backboneAugmentingMod

import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFetchWithCacheOptions extends ModelFetchWithCacheOptions {
  @JSName("prefillSuccess")
  var prefillSuccess_CollectionFetchWithCacheOptions: js.UndefOr[js.Function1[/* self */ js.Any, Unit]] = js.undefined
}

object CollectionFetchWithCacheOptions {
  @scala.inline
  def apply(
    beforeSend: /* jqxhr */ JQueryXHR => Unit = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    data: js.Any = null,
    error: (/* modelOrCollection */ js.UndefOr[js.Any], /* jqxhr */ js.UndefOr[JQueryXHR], /* options */ js.UndefOr[js.Any]) => Unit = null,
    expires: js.UndefOr[Double] = js.undefined,
    parse: js.Any = null,
    prefill: js.UndefOr[Boolean] = js.undefined,
    prefillExpires: js.UndefOr[Double] = js.undefined,
    prefillSuccess: /* self */ js.Any => Unit = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    success: (/* modelOrCollection */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    url: String = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): CollectionFetchWithCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (!js.isUndefined(prefill)) __obj.updateDynamic("prefill")(prefill.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prefillExpires)) __obj.updateDynamic("prefillExpires")(prefillExpires.get.asInstanceOf[js.Any])
    if (prefillSuccess != null) __obj.updateDynamic("prefillSuccess")(js.Any.fromFunction1(prefillSuccess))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionFetchWithCacheOptions]
  }
}

