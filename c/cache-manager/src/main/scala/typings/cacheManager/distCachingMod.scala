package typings.cacheManager

import typings.cacheManager.cacheManagerStrings.memory
import typings.cacheManager.distStoresMemoryMod.MemoryCache
import typings.cacheManager.distStoresMemoryMod.MemoryConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCachingMod {
  
  @JSImport("cache-manager/dist/caching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def caching[S /* <: Store */](store: S): js.Promise[Cache[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cache[S]]]
  inline def caching[S /* <: Store */, T /* <: js.Object */](factory: FactoryStore[S, T]): js.Promise[Cache[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(factory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cache[S]]]
  inline def caching[S /* <: Store */, T /* <: js.Object */](factory: FactoryStore[S, T], args: FactoryConfig[T]): js.Promise[Cache[S]] = (^.asInstanceOf[js.Dynamic].applyDynamic("caching")(factory.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Cache[S]]]
  
  inline def caching_memory(name: memory): js.Promise[MemoryCache] = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MemoryCache]]
  inline def caching_memory(name: memory, args: MemoryConfig): js.Promise[MemoryCache] = (^.asInstanceOf[js.Dynamic].applyDynamic("caching")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MemoryCache]]
  
  @js.native
  trait Cache[S /* <: Store */] extends StObject {
    
    def del(key: String): js.Promise[Unit] = js.native
    
    def get[T](key: String): js.Promise[js.UndefOr[T]] = js.native
    
    def reset(): js.Promise[Unit] = js.native
    
    def set(key: String, value: Any): js.Promise[Unit] = js.native
    def set(key: String, value: Any, ttl: Ttl): js.Promise[Unit] = js.native
    
    var store: S = js.native
    
    def wrap[T](key: String, fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  }
  
  type CachingConfig[T] = MemoryConfig | StoreConfig | FactoryConfig[T]
  
  trait Config extends StObject {
    
    var isCacheable: js.UndefOr[js.Function1[/* val */ Any, Boolean]] = js.undefined
    
    var ttl: js.UndefOr[Ttl] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setIsCacheable(value: /* val */ Any => Boolean): Self = StObject.set(x, "isCacheable", js.Any.fromFunction1(value))
      
      inline def setIsCacheableUndefined: Self = StObject.set(x, "isCacheable", js.undefined)
      
      inline def setTtl(value: Ttl): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  type FactoryConfig[T] = T & Config
  
  type FactoryStore[S /* <: Store */, T /* <: js.Object */] = js.Function1[/* config */ js.UndefOr[FactoryConfig[T]], S | js.Promise[S]]
  
  @js.native
  trait Store
    extends StObject
       with _Stores[Any, Any] {
    
    def del(key: String): js.Promise[Unit] = js.native
    
    def get[T](key: String): js.Promise[js.UndefOr[T]] = js.native
    
    def keys(): js.Promise[js.Array[String]] = js.native
    def keys(pattern: String): js.Promise[js.Array[String]] = js.native
    
    def mdel(args: String*): js.Promise[Unit] = js.native
    
    def mget(args: String*): js.Promise[js.Array[Any]] = js.native
    
    def mset(args: js.Array[js.Tuple2[String, Any]]): js.Promise[Unit] = js.native
    def mset(args: js.Array[js.Tuple2[String, Any]], ttl: Ttl): js.Promise[Unit] = js.native
    
    def reset(): js.Promise[Unit] = js.native
    
    def set[T](key: String, data: T): js.Promise[Unit] = js.native
    def set[T](key: String, data: T, ttl: Ttl): js.Promise[Unit] = js.native
    
    def ttl(key: String): js.Promise[Double] = js.native
  }
  
  type StoreConfig = Config
  
  /* Rewritten from type alias, can be one of: 
    - typings.cacheManager.cacheManagerStrings.memory
    - typings.cacheManager.distCachingMod.Store
    - typings.cacheManager.distCachingMod.FactoryStore[S, T]
  */
  type Stores[S /* <: Store */, T /* <: js.Object */] = (_Stores[S, T]) | (FactoryStore[S, T])
  
  type Ttl = Double
  
  trait _Stores[S /* <: Store */, T /* <: js.Object */] extends StObject
}
