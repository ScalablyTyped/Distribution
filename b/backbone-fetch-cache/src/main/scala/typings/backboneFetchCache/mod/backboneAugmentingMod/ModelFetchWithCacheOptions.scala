package typings.backboneFetchCache.mod.backboneAugmentingMod

import typings.backbone.mod.Parseable
import typings.backbone.mod.PersistenceOptions
import typings.backbone.mod.Silenceable
import typings.backbone.mod.Validable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The most used API hook for Backbone Fetch Cache is the Model and
  * Collection #.fetch() method. Here are the options you can pass into that
  * method to get behaviour particular to Backbone Fetch Cache.
  */
@js.native
trait ModelFetchWithCacheOptions
  extends PersistenceOptions
     with Silenceable
     with Validable
     with Parseable {
  /**
    * Calls to modelInstance.fetch or collectionInstance.fetch will be
    * fulfilled from the cache (if possible) when cache: true is set in
    * the options hash.
    */
  var cache: js.UndefOr[Boolean] = js.native
  var context: js.UndefOr[js.Any] = js.native
  /**
    * Cache values expire after 5 minutes by default. You can adjust this
    * by passing expires: <seconds> to the fetch call. Set to false to
    * never expire.
    */
  var expires: js.UndefOr[Double] = js.native
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
  var prefill: js.UndefOr[Boolean] = js.native
  var prefillExpires: js.UndefOr[Double] = js.native
  var prefillSuccess: js.UndefOr[
    js.Function3[/* self */ js.Any, /* attributes */ js.Any, /* opts */ this.type, Unit]
  ] = js.native
}

object ModelFetchWithCacheOptions {
  @scala.inline
  def apply(): ModelFetchWithCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelFetchWithCacheOptions]
  }
  @scala.inline
  implicit class ModelFetchWithCacheOptionsOps[Self <: ModelFetchWithCacheOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setPrefill(value: Boolean): Self = this.set("prefill", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefill: Self = this.set("prefill", js.undefined)
    @scala.inline
    def setPrefillExpires(value: Double): Self = this.set("prefillExpires", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefillExpires: Self = this.set("prefillExpires", js.undefined)
    @scala.inline
    def setPrefillSuccess(value: (/* self */ js.Any, /* attributes */ js.Any, ModelFetchWithCacheOptions) => Unit): Self = this.set("prefillSuccess", js.Any.fromFunction3(value))
    @scala.inline
    def deletePrefillSuccess: Self = this.set("prefillSuccess", js.undefined)
  }
  
}

