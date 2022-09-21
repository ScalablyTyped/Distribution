package typings.connectRedis

import typings.express.mod.RequestHandler
import typings.expressSession.mod.SessionData
import typings.expressSession.mod.SessionOptions
import typings.expressSession.mod.Store
import typings.ioredis.mod.Cluster
import typings.ioredis.mod.Redis
import typings.std.JSON
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    options: js.Function1[
      /* options */ js.UndefOr[SessionOptions], 
      RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
    ]
  ): RedisStore = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RedisStore]
  
  @JSImport("connect-redis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Client = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ Any) | Redis | Cluster
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined  */ @js.native
  trait RedisStore extends Store {
    
    var client: Client = js.native
  }
  
  trait RedisStoreOptions extends StObject {
    
    var client: js.UndefOr[Client] = js.undefined
    
    var db: js.UndefOr[Double] = js.undefined
    
    var disableTTL: js.UndefOr[Boolean] = js.undefined
    
    var disableTouch: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var logErrors: js.UndefOr[Boolean | (js.Function1[/* error */ String, Unit])] = js.undefined
    
    var pass: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var scanCount: js.UndefOr[Double] = js.undefined
    
    var serializer: js.UndefOr[Serializer | JSON] = js.undefined
    
    var socket: js.UndefOr[String] = js.undefined
    
    var ttl: js.UndefOr[
        Double | String | (js.Function3[/* store */ RedisStore, /* sess */ SessionData, /* sid */ String, Double])
      ] = js.undefined
    
    var unref: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object RedisStoreOptions {
    
    inline def apply(): RedisStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisStoreOptions]
    }
    
    extension [Self <: RedisStoreOptions](x: Self) {
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setDb(value: Double): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      inline def setDisableTTL(value: Boolean): Self = StObject.set(x, "disableTTL", value.asInstanceOf[js.Any])
      
      inline def setDisableTTLUndefined: Self = StObject.set(x, "disableTTL", js.undefined)
      
      inline def setDisableTouch(value: Boolean): Self = StObject.set(x, "disableTouch", value.asInstanceOf[js.Any])
      
      inline def setDisableTouchUndefined: Self = StObject.set(x, "disableTouch", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLogErrors(value: Boolean | (js.Function1[/* error */ String, Unit])): Self = StObject.set(x, "logErrors", value.asInstanceOf[js.Any])
      
      inline def setLogErrorsFunction1(value: /* error */ String => Unit): Self = StObject.set(x, "logErrors", js.Any.fromFunction1(value))
      
      inline def setLogErrorsUndefined: Self = StObject.set(x, "logErrors", js.undefined)
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setScanCount(value: Double): Self = StObject.set(x, "scanCount", value.asInstanceOf[js.Any])
      
      inline def setScanCountUndefined: Self = StObject.set(x, "scanCount", js.undefined)
      
      inline def setSerializer(value: Serializer | JSON): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
      
      inline def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
      
      inline def setSocket(value: String): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      inline def setTtl(
        value: Double | String | (js.Function3[/* store */ RedisStore, /* sess */ SessionData, /* sid */ String, Double])
      ): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlFunction3(value: (/* store */ RedisStore, /* sess */ SessionData, /* sid */ String) => Double): Self = StObject.set(x, "ttl", js.Any.fromFunction3(value))
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUnref(value: Boolean): Self = StObject.set(x, "unref", value.asInstanceOf[js.Any])
      
      inline def setUnrefUndefined: Self = StObject.set(x, "unref", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Serializer extends StObject {
    
    var parse: js.Function
    
    var stringify: js.Function
  }
  object Serializer {
    
    inline def apply(parse: js.Function, stringify: js.Function): Serializer = {
      val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any], stringify = stringify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Serializer]
    }
    
    extension [Self <: Serializer](x: Self) {
      
      inline def setParse(value: js.Function): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setStringify(value: js.Function): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    }
  }
}
