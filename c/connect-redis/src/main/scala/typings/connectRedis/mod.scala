package typings.connectRedis

import org.scalablytyped.runtime.Instantiable1
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.mod.SessionData
import typings.expressSession.mod.SessionOptions
import typings.expressSession.mod.Store
import typings.ioredis.mod.Redis
import typings.redis.mod.RedisClient
import typings.std.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-redis", JSImport.Namespace)
  @js.native
  def apply(
    options: js.Function1[
      /* options */ js.UndefOr[SessionOptions], 
      RequestHandler[ParamsDictionary, _, _, Query]
    ]
  ): RedisStore = js.native
  
  @js.native
  trait RedisStore
    extends Store
       with Instantiable1[/* options */ RedisStoreOptions, RedisStore] {
    
    var client: RedisClient | Redis = js.native
  }
  
  @js.native
  trait RedisStoreOptions extends StObject {
    
    var client: js.UndefOr[RedisClient | Redis] = js.native
    
    var db: js.UndefOr[Double] = js.native
    
    var disableTTL: js.UndefOr[Boolean] = js.native
    
    var disableTouch: js.UndefOr[Boolean] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var logErrors: js.UndefOr[Boolean | (js.Function1[/* error */ String, Unit])] = js.native
    
    var pass: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var scanCount: js.UndefOr[Double] = js.native
    
    var serializer: js.UndefOr[Serializer | JSON] = js.native
    
    var socket: js.UndefOr[String] = js.native
    
    var ttl: js.UndefOr[
        Double | String | (js.Function3[/* store */ RedisStore, /* sess */ SessionData, /* sid */ String, Double])
      ] = js.native
    
    var unref: js.UndefOr[Boolean] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object RedisStoreOptions {
    
    @scala.inline
    def apply(): RedisStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisStoreOptions]
    }
    
    @scala.inline
    implicit class RedisStoreOptionsMutableBuilder[Self <: RedisStoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: RedisClient | Redis): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setDb(value: Double): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      @scala.inline
      def setDisableTTL(value: Boolean): Self = StObject.set(x, "disableTTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTTLUndefined: Self = StObject.set(x, "disableTTL", js.undefined)
      
      @scala.inline
      def setDisableTouch(value: Boolean): Self = StObject.set(x, "disableTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTouchUndefined: Self = StObject.set(x, "disableTouch", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLogErrors(value: Boolean | (js.Function1[/* error */ String, Unit])): Self = StObject.set(x, "logErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogErrorsFunction1(value: /* error */ String => Unit): Self = StObject.set(x, "logErrors", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogErrorsUndefined: Self = StObject.set(x, "logErrors", js.undefined)
      
      @scala.inline
      def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setScanCount(value: Double): Self = StObject.set(x, "scanCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScanCountUndefined: Self = StObject.set(x, "scanCount", js.undefined)
      
      @scala.inline
      def setSerializer(value: Serializer | JSON): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
      
      @scala.inline
      def setSocket(value: String): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      @scala.inline
      def setTtl(
        value: Double | String | (js.Function3[/* store */ RedisStore, /* sess */ SessionData, /* sid */ String, Double])
      ): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlFunction3(value: (/* store */ RedisStore, /* sess */ SessionData, /* sid */ String) => Double): Self = StObject.set(x, "ttl", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      @scala.inline
      def setUnref(value: Boolean): Self = StObject.set(x, "unref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnrefUndefined: Self = StObject.set(x, "unref", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Serializer extends StObject {
    
    var parse: js.Function = js.native
    
    var stringify: js.Function = js.native
  }
  object Serializer {
    
    @scala.inline
    def apply(parse: js.Function, stringify: js.Function): Serializer = {
      val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any], stringify = stringify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Serializer]
    }
    
    @scala.inline
    implicit class SerializerMutableBuilder[Self <: Serializer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: js.Function): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringify(value: js.Function): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    }
  }
}
