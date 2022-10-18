package typings.backboneFetchCache

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelFetchOptions
import typings.backbone.mod.ModelSetOptions
import typings.backboneFetchCache.mod.Static
import typings.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object BackboneFetchCache {
    
    /* augmented module */
    object backboneMod {
      
      @JSImport("backbone", JSImport.Namespace)
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("backbone", "fetchCache")
      @js.native
      def fetchCache: Static = js.native
      inline def fetchCache_=(x: Static): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fetchCache")(x.asInstanceOf[js.Any])
      
      trait CollectionFetchWithCacheOptions
        extends StObject
           with typings.backboneFetchCache.mod.backboneAugmentingMod.ModelFetchWithCacheOptions {
        
        @JSName("prefillSuccess")
        var prefillSuccess_CollectionFetchWithCacheOptions: js.UndefOr[js.Function1[/* self */ Any, Unit]] = js.undefined
      }
      object CollectionFetchWithCacheOptions {
        
        inline def apply(): CollectionFetchWithCacheOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[CollectionFetchWithCacheOptions]
        }
        
        extension [Self <: CollectionFetchWithCacheOptions](x: Self) {
          
          inline def setPrefillSuccess(value: /* self */ Any => Unit): Self = StObject.set(x, "prefillSuccess", js.Any.fromFunction1(value))
          
          inline def setPrefillSuccessUndefined: Self = StObject.set(x, "prefillSuccess", js.undefined)
        }
      }
      
      @js.native
      trait CollectionWithCache extends Collection[Model[Any, ModelSetOptions, Any]] {
        
        def fetch(options: typings.backboneFetchCache.mod.backboneAugmentingMod.CollectionFetchWithCacheOptions): JQueryXHR = js.native
      }
      
      /**
        * The most used API hook for Backbone Fetch Cache is the Model and
        * Collection #.fetch() method. Here are the options you can pass into that
        * method to get behaviour particular to Backbone Fetch Cache.
        */
      trait ModelFetchWithCacheOptions
        extends StObject
           with ModelFetchOptions {
        
        /**
          * Cache values expire after 5 minutes by default. You can adjust this
          * by passing expires: <seconds> to the fetch call. Set to false to
          * never expire.
          */
        var expires: js.UndefOr[Double] = js.undefined
        
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
        var prefill: js.UndefOr[Boolean] = js.undefined
        
        var prefillExpires: js.UndefOr[Double] = js.undefined
        
        var prefillSuccess: js.UndefOr[js.Function3[/* self */ Any, /* attributes */ Any, /* opts */ this.type, Unit]] = js.undefined
      }
      object ModelFetchWithCacheOptions {
        
        inline def apply(): ModelFetchWithCacheOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ModelFetchWithCacheOptions]
        }
        
        extension [Self <: ModelFetchWithCacheOptions](x: Self) {
          
          inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
          
          inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
          
          inline def setPrefill(value: Boolean): Self = StObject.set(x, "prefill", value.asInstanceOf[js.Any])
          
          inline def setPrefillExpires(value: Double): Self = StObject.set(x, "prefillExpires", value.asInstanceOf[js.Any])
          
          inline def setPrefillExpiresUndefined: Self = StObject.set(x, "prefillExpires", js.undefined)
          
          inline def setPrefillSuccess(value: (/* self */ Any, /* attributes */ Any, ModelFetchWithCacheOptions) => Unit): Self = StObject.set(x, "prefillSuccess", js.Any.fromFunction3(value))
          
          inline def setPrefillSuccessUndefined: Self = StObject.set(x, "prefillSuccess", js.undefined)
          
          inline def setPrefillUndefined: Self = StObject.set(x, "prefill", js.undefined)
        }
      }
      
      @js.native
      trait ModelWithCache extends Model[Any, ModelSetOptions, Any] {
        
        def fetch(options: typings.backboneFetchCache.mod.backboneAugmentingMod.ModelFetchWithCacheOptions): JQueryXHR = js.native
      }
    }
  }
}
