package typings
package backboneDashFetchDashCacheLib.backboneDashFetchDashCacheMod.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The most used API hook for Backbone Fetch Cache is the Model and
  * Collection #.fetch() method. Here are the options you can pass into that
  * method to get behaviour particular to Backbone Fetch Cache.
  */
trait ModelFetchWithCacheOptions
  extends backboneLib.backboneMod.ModelFetchOptions {
  /**
    * Calls to modelInstance.fetch or collectionInstance.fetch will be
    * fulfilled from the cache (if possible) when cache: true is set in
    * the options hash.
    */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * Cache values expire after 5 minutes by default. You can adjust this
    * by passing expires: <seconds> to the fetch call. Set to false to
    * never expire.
    */
  var expires: js.UndefOr[scala.Double] = js.undefined
  /**
    * This option allows the model/collection to be populated from the
    * cache immediately and then be updated once the call to fetch has
    * completed. The initial cache hit calls the prefillSuccess callback
    * and then the AJAX success/error callbacks are called as normal when
    * the request is complete. This allows the page to render something
    * immediately and then update it after the request completes. (Note:
    * the prefillSuccess callback will not fire if the data is not found
    * in the cache.)
    *
    * prefill and prefillExpires options can be used with the promises
    * interface like so (note: the progress event will not fire if the
    * data is not found in the cache.).
    *
    * prefillExpires affects prefill in the following ways:
    *
    * 1. If the cache doesn't hold the requested data, just fetch it
    *  (usual behaviour)
    * 2. If the cache holds an expired version of the requested data, just
    *  fetch it (usual behaviour)
    * 3. If the cache holds requested data that is neither expired nor
    *  prefill expired, just return it and don't do a fetch / prefill
    *  callback (usual cache behavior, unusual prefill behaviour)
    * 4. If the cache holds requested data that isn't expired but is
    *  prefill expired, use the prefill callback and do a fetch (usual
    *  prefill behaviour)
    */
  var prefill: js.UndefOr[scala.Boolean] = js.undefined
  var prefillExpires: js.UndefOr[scala.Double] = js.undefined
  var prefillSuccess: js.UndefOr[
    js.Function3[
      /* self */ js.Any, 
      /* attributes */ js.Any, 
      /* opts */ ModelFetchWithCacheOptions, 
      scala.Unit
    ]
  ] = js.undefined
}

object ModelFetchWithCacheOptions {
  @scala.inline
  def apply(
    beforeSend: /* jqxhr */ jqueryLib.JQueryXHR => scala.Unit = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    context: js.Any = null,
    data: js.Any = null,
    error: (/* modelOrCollection */ js.UndefOr[js.Any], /* jqxhr */ js.UndefOr[jqueryLib.JQueryXHR], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    expires: scala.Int | scala.Double = null,
    parse: js.Any = null,
    prefill: js.UndefOr[scala.Boolean] = js.undefined,
    prefillExpires: scala.Int | scala.Double = null,
    prefillSuccess: (/* self */ js.Any, /* attributes */ js.Any, /* opts */ ModelFetchWithCacheOptions) => scala.Unit = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    success: (/* modelOrCollection */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    url: java.lang.String = null,
    validate: js.UndefOr[scala.Boolean] = js.undefined
  ): ModelFetchWithCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (context != null) __obj.updateDynamic("context")(context)
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (!js.isUndefined(prefill)) __obj.updateDynamic("prefill")(prefill)
    if (prefillExpires != null) __obj.updateDynamic("prefillExpires")(prefillExpires.asInstanceOf[js.Any])
    if (prefillSuccess != null) __obj.updateDynamic("prefillSuccess")(js.Any.fromFunction3(prefillSuccess))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[ModelFetchWithCacheOptions]
  }
}

