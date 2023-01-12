package typings.cacheManager

import typings.cacheManager.distCachingMod.Cache
import typings.cacheManager.distCachingMod.Store
import typings.cacheManager.distCachingMod.Ttl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMultiCachingMod {
  
  @JSImport("cache-manager/dist/multi-caching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multiCaching[Caches /* <: js.Array[Cache[Store]] */](caches: Caches): MultiCache = ^.asInstanceOf[js.Dynamic].applyDynamic("multiCaching")(caches.asInstanceOf[js.Any]).asInstanceOf[MultiCache]
  
  /* Inlined std.Omit<cache-manager.cache-manager/dist/caching.Cache<cache-manager.cache-manager/dist/caching.Store>, 'store'> */
  trait MultiCache extends StObject {
    
    def del(key: String): js.Promise[Unit]
    @JSName("del")
    var del_Original: js.Function1[/* key */ String, js.Promise[Unit]]
    
    def get[T](key: String): js.Promise[js.UndefOr[T]]
    @JSName("get")
    var get_Original: js.Function1[/* key */ String, js.Promise[js.UndefOr[Any]]]
    
    def reset(): js.Promise[Unit]
    @JSName("reset")
    var reset_Original: js.Function0[js.Promise[Unit]]
    
    def set(key: String, value: Any): js.Promise[Unit]
    def set(key: String, value: Any, ttl: Ttl): js.Promise[Unit]
    @JSName("set")
    var set_Original: js.Function3[/* key */ String, /* value */ Any, /* ttl */ js.UndefOr[Ttl], js.Promise[Unit]]
    
    def wrap[T](key: String, fn: js.Function0[js.Promise[T]]): js.Promise[T]
    def wrap[T](key: String, fn: js.Function0[js.Promise[T]], ttl: Ttl): js.Promise[T]
    @JSName("wrap")
    var wrap_Original: js.Function3[
        /* key */ String, 
        /* fn */ js.Function0[js.Promise[Any]], 
        /* ttl */ js.UndefOr[Ttl], 
        js.Promise[Any]
      ]
  }
  object MultiCache {
    
    inline def apply(
      del: /* key */ String => js.Promise[Unit],
      get: /* key */ String => js.Promise[js.UndefOr[Any]],
      reset: () => js.Promise[Unit],
      set: (/* key */ String, /* value */ Any, /* ttl */ js.UndefOr[Ttl]) => js.Promise[Unit],
      wrap: (/* key */ String, /* fn */ js.Function0[js.Promise[Any]], /* ttl */ js.UndefOr[Ttl]) => js.Promise[Any]
    ): MultiCache = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction3(set), wrap = js.Any.fromFunction3(wrap))
      __obj.asInstanceOf[MultiCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiCache] (val x: Self) extends AnyVal {
      
      inline def setDel(value: /* key */ String => js.Promise[Unit]): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setGet(value: /* key */ String => js.Promise[js.UndefOr[Any]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => js.Promise[Unit]): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSet(value: (/* key */ String, /* value */ Any, /* ttl */ js.UndefOr[Ttl]) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
      
      inline def setWrap(
        value: (/* key */ String, /* fn */ js.Function0[js.Promise[Any]], /* ttl */ js.UndefOr[Ttl]) => js.Promise[Any]
      ): Self = StObject.set(x, "wrap", js.Any.fromFunction3(value))
    }
  }
}
