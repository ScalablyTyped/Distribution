package typings.catboxRedis

import typings.catbox.mod.Client
import typings.catbox.mod.ClientOptions
import typings.catboxRedis.anon.Host
import typings.ioredis.mod.Redis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("catbox-redis", JSImport.Namespace)
  @js.native
  class ^[T] protected () extends Client[T] {
    def this(options: CatboxRedisOptions) = this()
  }
  
  type CatboxRedis[T] = Client[T]
  
  trait CatboxRedisOptions
    extends StObject
       with ClientOptions {
    
    /**
      * Raw client.
      */
    var client: js.UndefOr[Redis] = js.undefined
    
    /**
      * the Redis database.
      */
    var database: js.UndefOr[String] = js.undefined
    
    /**
      * the Redis server hostname.
      * Defaults to '127.0.0.1'.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * the Redis authentication password when required.
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * the Redis server port or unix domain socket path.
      * Defaults to 6379.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * the name of the sentinel master.
      * (Only needed when sentinels is specified)
      */
    var sentinelName: js.UndefOr[String] = js.undefined
    
    /**
      * an array of redis sentinel addresses to connect to.
      */
    var sentinels: js.UndefOr[js.Array[Host]] = js.undefined
    
    /**
      * the unix socket string to connect to (if socket is provided, host and port are ignored)
      */
    var socket: js.UndefOr[String] = js.undefined
    
    /**
      * the Redis server URL (if url is provided, host, port, and socket are ignored)
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object CatboxRedisOptions {
    
    inline def apply(partition: String): CatboxRedisOptions = {
      val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any])
      __obj.asInstanceOf[CatboxRedisOptions]
    }
    
    extension [Self <: CatboxRedisOptions](x: Self) {
      
      inline def setClient(value: Redis): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSentinelName(value: String): Self = StObject.set(x, "sentinelName", value.asInstanceOf[js.Any])
      
      inline def setSentinelNameUndefined: Self = StObject.set(x, "sentinelName", js.undefined)
      
      inline def setSentinels(value: js.Array[Host]): Self = StObject.set(x, "sentinels", value.asInstanceOf[js.Any])
      
      inline def setSentinelsUndefined: Self = StObject.set(x, "sentinels", js.undefined)
      
      inline def setSentinelsVarargs(value: Host*): Self = StObject.set(x, "sentinels", js.Array(value :_*))
      
      inline def setSocket(value: String): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
