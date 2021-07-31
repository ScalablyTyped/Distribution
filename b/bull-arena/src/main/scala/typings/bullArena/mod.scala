package typings.bullArena

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.bullArena.bullArenaStrings.bee
import typings.bullArena.bullArenaStrings.bq
import typings.bullArena.bullArenaStrings.bull
import typings.bullArena.bullArenaStrings.bullmq
import typings.bullArena.mod.BullArena.MiddlewareListenOptions
import typings.bullArena.mod.BullArena.MiddlewareOptions
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.redis.mod.ClientOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(options: MiddlewareOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def apply(options: MiddlewareOptions, listenOptions: MiddlewareListenOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], listenOptions.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("bull-arena", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object BullArena {
    
    /* Rewritten from type alias, can be one of: 
      - typings.bullArena.mod.BullArena.PortHostConnectionOptions
      - typings.bullArena.mod.BullArena.RedisUrlConnectionOptions
      - typings.bullArena.mod.BullArena.RedisClientConnectionOptions
    */
    trait ConnectionOptions extends StObject
    object ConnectionOptions {
      
      @scala.inline
      def PortHostConnectionOptions(host: String): typings.bullArena.mod.BullArena.PortHostConnectionOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.bullArena.mod.BullArena.PortHostConnectionOptions]
      }
      
      @scala.inline
      def RedisClientConnectionOptions(redis: ClientOpts): typings.bullArena.mod.BullArena.RedisClientConnectionOptions = {
        val __obj = js.Dynamic.literal(redis = redis.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.bullArena.mod.BullArena.RedisClientConnectionOptions]
      }
      
      @scala.inline
      def RedisUrlConnectionOptions(url: String): typings.bullArena.mod.BullArena.RedisUrlConnectionOptions = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.bullArena.mod.BullArena.RedisUrlConnectionOptions]
      }
    }
    
    trait MiddlewareListenOptions extends StObject {
      
      var basePath: js.UndefOr[String] = js.undefined
      
      var disableListen: js.UndefOr[Boolean] = js.undefined
      
      var host: js.UndefOr[String] = js.undefined
      
      var port: js.UndefOr[Double] = js.undefined
      
      var useCdn: js.UndefOr[Boolean] = js.undefined
    }
    object MiddlewareListenOptions {
      
      @scala.inline
      def apply(): MiddlewareListenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MiddlewareListenOptions]
      }
      
      @scala.inline
      implicit class MiddlewareListenOptionsMutableBuilder[Self <: MiddlewareListenOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
        
        @scala.inline
        def setDisableListen(value: Boolean): Self = StObject.set(x, "disableListen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableListenUndefined: Self = StObject.set(x, "disableListen", js.undefined)
        
        @scala.inline
        def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        @scala.inline
        def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        @scala.inline
        def setUseCdn(value: Boolean): Self = StObject.set(x, "useCdn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseCdnUndefined: Self = StObject.set(x, "useCdn", js.undefined)
      }
    }
    
    trait MiddlewareOptions extends StObject {
      
      var Bee: js.UndefOr[QueueConstructor] = js.undefined
      
      var Bull: js.UndefOr[QueueConstructor] = js.undefined
      
      var BullMQ: js.UndefOr[QueueConstructor] = js.undefined
      
      var queues: js.Array[QueueOptions & ConnectionOptions]
    }
    object MiddlewareOptions {
      
      @scala.inline
      def apply(queues: js.Array[QueueOptions & ConnectionOptions]): MiddlewareOptions = {
        val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
        __obj.asInstanceOf[MiddlewareOptions]
      }
      
      @scala.inline
      implicit class MiddlewareOptionsMutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBee(value: QueueConstructor): Self = StObject.set(x, "Bee", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBeeUndefined: Self = StObject.set(x, "Bee", js.undefined)
        
        @scala.inline
        def setBull(value: QueueConstructor): Self = StObject.set(x, "Bull", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBullMQ(value: QueueConstructor): Self = StObject.set(x, "BullMQ", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBullMQUndefined: Self = StObject.set(x, "BullMQ", js.undefined)
        
        @scala.inline
        def setBullUndefined: Self = StObject.set(x, "Bull", js.undefined)
        
        @scala.inline
        def setQueues(value: js.Array[QueueOptions & ConnectionOptions]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQueuesVarargs(value: (QueueOptions & ConnectionOptions)*): Self = StObject.set(x, "queues", js.Array(value :_*))
      }
    }
    
    trait PortHostConnectionOptions
      extends StObject
         with ConnectionOptions {
      
      var db: js.UndefOr[String] = js.undefined
      
      var host: String
      
      var password: js.UndefOr[String] = js.undefined
      
      var port: js.UndefOr[Double] = js.undefined
    }
    object PortHostConnectionOptions {
      
      @scala.inline
      def apply(host: String): PortHostConnectionOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
        __obj.asInstanceOf[PortHostConnectionOptions]
      }
      
      @scala.inline
      implicit class PortHostConnectionOptionsMutableBuilder[Self <: PortHostConnectionOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
        
        @scala.inline
        def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        @scala.inline
        def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      }
    }
    
    trait Queue extends StObject {
      
      // Interface of Queue is much larger and
      // inconsistent between different packages.
      // We are using an example method here
      // that is consistent across all providers.
      def getJob(jobId: String): js.Promise[js.Any]
    }
    object Queue {
      
      @scala.inline
      def apply(getJob: String => js.Promise[js.Any]): Queue = {
        val __obj = js.Dynamic.literal(getJob = js.Any.fromFunction1(getJob))
        __obj.asInstanceOf[Queue]
      }
      
      @scala.inline
      implicit class QueueMutableBuilder[Self <: Queue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetJob(value: String => js.Promise[js.Any]): Self = StObject.set(x, "getJob", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait QueueConstructor
      extends StObject
         with Instantiable1[/* queueName */ String, Queue]
         with Instantiable2[/* queueName */ String, /* opts */ QueueOptions, Queue]
    
    trait QueueOptions extends StObject {
      
      var hostId: js.UndefOr[String] = js.undefined
      
      var name: String
      
      var prefix: js.UndefOr[bull | bq | String] = js.undefined
      
      var `type`: js.UndefOr[bull | bee | bullmq | String] = js.undefined
    }
    object QueueOptions {
      
      @scala.inline
      def apply(name: String): QueueOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[QueueOptions]
      }
      
      @scala.inline
      implicit class QueueOptionsMutableBuilder[Self <: QueueOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostIdUndefined: Self = StObject.set(x, "hostId", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefix(value: bull | bq | String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        @scala.inline
        def setType(value: bull | bee | bullmq | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait RedisClientConnectionOptions
      extends StObject
         with ConnectionOptions {
      
      var redis: ClientOpts
    }
    object RedisClientConnectionOptions {
      
      @scala.inline
      def apply(redis: ClientOpts): RedisClientConnectionOptions = {
        val __obj = js.Dynamic.literal(redis = redis.asInstanceOf[js.Any])
        __obj.asInstanceOf[RedisClientConnectionOptions]
      }
      
      @scala.inline
      implicit class RedisClientConnectionOptionsMutableBuilder[Self <: RedisClientConnectionOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRedis(value: ClientOpts): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      }
    }
    
    trait RedisUrlConnectionOptions
      extends StObject
         with ConnectionOptions {
      
      var url: String
    }
    object RedisUrlConnectionOptions {
      
      @scala.inline
      def apply(url: String): RedisUrlConnectionOptions = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[RedisUrlConnectionOptions]
      }
      
      @scala.inline
      implicit class RedisUrlConnectionOptionsMutableBuilder[Self <: RedisUrlConnectionOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
