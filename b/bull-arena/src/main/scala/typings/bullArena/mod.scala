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
import typings.ioredis.mod.Redis
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: MiddlewareOptions): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(options: MiddlewareOptions, listenOptions: MiddlewareListenOptions): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], listenOptions.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
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
      
      inline def PortHostConnectionOptions(host: String): typings.bullArena.mod.BullArena.PortHostConnectionOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.bullArena.mod.BullArena.PortHostConnectionOptions]
      }
      
      inline def RedisClientConnectionOptions(
        redis: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any) | Redis
      ): typings.bullArena.mod.BullArena.RedisClientConnectionOptions = {
        val __obj = js.Dynamic.literal(redis = redis.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.bullArena.mod.BullArena.RedisClientConnectionOptions]
      }
      
      inline def RedisUrlConnectionOptions(url: String): typings.bullArena.mod.BullArena.RedisUrlConnectionOptions = {
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
      
      inline def apply(): MiddlewareListenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MiddlewareListenOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MiddlewareListenOptions] (val x: Self) extends AnyVal {
        
        inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
        
        inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
        
        inline def setDisableListen(value: Boolean): Self = StObject.set(x, "disableListen", value.asInstanceOf[js.Any])
        
        inline def setDisableListenUndefined: Self = StObject.set(x, "disableListen", js.undefined)
        
        inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        inline def setUseCdn(value: Boolean): Self = StObject.set(x, "useCdn", value.asInstanceOf[js.Any])
        
        inline def setUseCdnUndefined: Self = StObject.set(x, "useCdn", js.undefined)
      }
    }
    
    trait MiddlewareOptions extends StObject {
      
      var Bee: js.UndefOr[QueueConstructor] = js.undefined
      
      var Bull: js.UndefOr[QueueConstructor] = js.undefined
      
      var BullMQ: js.UndefOr[QueueConstructor] = js.undefined
      
      var queues: js.Array[QueueOptions & ConnectionOptions]
    }
    object MiddlewareOptions {
      
      inline def apply(queues: js.Array[QueueOptions & ConnectionOptions]): MiddlewareOptions = {
        val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
        __obj.asInstanceOf[MiddlewareOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
        
        inline def setBee(value: QueueConstructor): Self = StObject.set(x, "Bee", value.asInstanceOf[js.Any])
        
        inline def setBeeUndefined: Self = StObject.set(x, "Bee", js.undefined)
        
        inline def setBull(value: QueueConstructor): Self = StObject.set(x, "Bull", value.asInstanceOf[js.Any])
        
        inline def setBullMQ(value: QueueConstructor): Self = StObject.set(x, "BullMQ", value.asInstanceOf[js.Any])
        
        inline def setBullMQUndefined: Self = StObject.set(x, "BullMQ", js.undefined)
        
        inline def setBullUndefined: Self = StObject.set(x, "Bull", js.undefined)
        
        inline def setQueues(value: js.Array[QueueOptions & ConnectionOptions]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
        
        inline def setQueuesVarargs(value: (QueueOptions & ConnectionOptions)*): Self = StObject.set(x, "queues", js.Array(value*))
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
      
      inline def apply(host: String): PortHostConnectionOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
        __obj.asInstanceOf[PortHostConnectionOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PortHostConnectionOptions] (val x: Self) extends AnyVal {
        
        inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
        
        inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
        
        inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      }
    }
    
    trait Queue extends StObject {
      
      // Interface of Queue is much larger and
      // inconsistent between different packages.
      // We are using an example method here
      // that is consistent across all providers.
      def getJob(jobId: String): js.Promise[Any]
    }
    object Queue {
      
      inline def apply(getJob: String => js.Promise[Any]): Queue = {
        val __obj = js.Dynamic.literal(getJob = js.Any.fromFunction1(getJob))
        __obj.asInstanceOf[Queue]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Queue] (val x: Self) extends AnyVal {
        
        inline def setGetJob(value: String => js.Promise[Any]): Self = StObject.set(x, "getJob", js.Any.fromFunction1(value))
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
      
      inline def apply(name: String): QueueOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[QueueOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: QueueOptions] (val x: Self) extends AnyVal {
        
        inline def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
        
        inline def setHostIdUndefined: Self = StObject.set(x, "hostId", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPrefix(value: bull | bq | String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setType(value: bull | bee | bullmq | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait RedisClientConnectionOptions
      extends StObject
         with ConnectionOptions {
      
      var redis: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any) | Redis
    }
    object RedisClientConnectionOptions {
      
      inline def apply(
        redis: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any) | Redis
      ): RedisClientConnectionOptions = {
        val __obj = js.Dynamic.literal(redis = redis.asInstanceOf[js.Any])
        __obj.asInstanceOf[RedisClientConnectionOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RedisClientConnectionOptions] (val x: Self) extends AnyVal {
        
        inline def setRedis(
          value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any) | Redis
        ): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      }
    }
    
    trait RedisUrlConnectionOptions
      extends StObject
         with ConnectionOptions {
      
      var url: String
    }
    object RedisUrlConnectionOptions {
      
      inline def apply(url: String): RedisUrlConnectionOptions = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[RedisUrlConnectionOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RedisUrlConnectionOptions] (val x: Self) extends AnyVal {
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
