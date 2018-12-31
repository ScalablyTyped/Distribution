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
  extends backboneLib.backboneMod.BackboneNs.ModelFetchOptions {
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

