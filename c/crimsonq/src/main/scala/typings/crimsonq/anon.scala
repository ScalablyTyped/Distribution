package typings.crimsonq

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.crimsonq.crimsonqStrings.ENTER_SUBSCRIBER_MODE
import typings.crimsonq.crimsonqStrings.EXIT_SUBSCRIBER_MODE
import typings.crimsonq.crimsonqStrings.VALID_IN_MONITOR_MODE
import typings.crimsonq.crimsonqStrings.VALID_IN_SUBSCRIBER_MODE
import typings.crimsonq.crimsonqStrings.WILL_DISCONNECT
import typings.ioredis.anon.PartialSentinelAddress
import typings.ioredis.anon.keyinkeyofCommandNameFlag
import typings.ioredis.clusterMod.ClusterNode
import typings.ioredis.clusterMod.default
import typings.ioredis.clusterOptionsMod.ClusterOptions
import typings.ioredis.commandMod.ArgumentTransformer
import typings.ioredis.commandMod.ReplyTransformer
import typings.ioredis.mod.Command
import typings.ioredis.redisMod.Redis
import typings.ioredis.redisOptionsMod.RedisOptions
import typings.ioredis.scanStreamMod.Options
import typings.ioredis.sentinelConnectorMod.SentinelConnectionOptions
import typings.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: js.Error
    
    var value: String
  }
  object Error {
    
    inline def apply(error: js.Error, value: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var status: String
    
    var statusHistory: js.Array[js.Object]
    
    var topic: String
    
    var value: String
  }
  object Key {
    
    inline def apply(key: String, status: String, statusHistory: js.Array[js.Object], topic: String, value: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusHistory = statusHistory.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusHistory(value: js.Array[js.Object]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
      
      inline def setStatusHistoryVarargs(value: js.Object*): Self = StObject.set(x, "statusHistory", js.Array(value*))
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofCommand extends StObject {
    
    var FLAGS: keyinkeyofCommandNameFlag = js.native
    
    var _transformer: Any = js.native
    
    @JSName("checkFlag")
    def checkFlag_ENTERSUBSCRIBERMODE(flagName: ENTER_SUBSCRIBER_MODE, commandName: String): Boolean = js.native
    @JSName("checkFlag")
    def checkFlag_EXITSUBSCRIBERMODE(flagName: EXIT_SUBSCRIBER_MODE, commandName: String): Boolean = js.native
    @JSName("checkFlag")
    def checkFlag_VALIDINMONITORMODE(flagName: VALID_IN_MONITOR_MODE, commandName: String): Boolean = js.native
    /**
      * Check whether the command has the flag
      */
    @JSName("checkFlag")
    def checkFlag_VALIDINSUBSCRIBERMODE(flagName: VALID_IN_SUBSCRIBER_MODE, commandName: String): Boolean = js.native
    @JSName("checkFlag")
    def checkFlag_WILLDISCONNECT(flagName: WILL_DISCONNECT, commandName: String): Boolean = js.native
    
    var flagMap: Any = js.native
    
    var getFlagMap: Any = js.native
    
    def setArgumentTransformer(name: String, func: ArgumentTransformer): Unit = js.native
    
    def setReplyTransformer(name: String, func: ReplyTransformer): Unit = js.native
  }
  
  @js.native
  trait TypeofCommandInstantiable
    extends StObject
       with Instantiable1[/* name */ String, Command] {
    
    var FLAGS: keyinkeyofCommandNameFlag = js.native
    
    /* private */ var _transformer: Any = js.native
    
    @JSName("checkFlag")
    def checkFlag_ENTERSUBSCRIBERMODE(flagName: ENTER_SUBSCRIBER_MODE, commandName: String): Boolean = js.native
    @JSName("checkFlag")
    def checkFlag_EXITSUBSCRIBERMODE(flagName: EXIT_SUBSCRIBER_MODE, commandName: String): Boolean = js.native
    @JSName("checkFlag")
    def checkFlag_VALIDINMONITORMODE(flagName: VALID_IN_MONITOR_MODE, commandName: String): Boolean = js.native
    /**
      * Check whether the command has the flag
      */
    @JSName("checkFlag")
    def checkFlag_VALIDINSUBSCRIBERMODE(flagName: VALID_IN_SUBSCRIBER_MODE, commandName: String): Boolean = js.native
    @JSName("checkFlag")
    def checkFlag_WILLDISCONNECT(flagName: WILL_DISCONNECT, commandName: String): Boolean = js.native
    
    /* private */ var flagMap: Any = js.native
    
    /* private */ var getFlagMap: Any = js.native
    
    def setArgumentTransformer(name: String, func: ArgumentTransformer): Unit = js.native
    
    def setReplyTransformer(name: String, func: ReplyTransformer): Unit = js.native
  }
  
  @js.native
  trait TypeofIORedis extends StObject {
    
    /**
      * This is the major component of ioredis.
      * Use it to connect to a standalone Redis server or Sentinels.
      *
      * ```typescript
      * const redis = new Redis(); // Default port is 6379
      * async function main() {
      *   redis.set("foo", "bar");
      *   redis.get("foo", (err, result) => {
      *     // `result` should be "bar"
      *     console.log(err, result);
      *   });
      *   // Or use Promise
      *   const result = await redis.get("foo");
      * }
      * ```
      */
    val default: Typeofdefault & (Instantiable3[
        /* port */ Double, 
        /* host */ String, 
        /* options */ RedisOptions, 
        typings.ioredis.mod.default
      ]) = js.native
    
    var AbstractConnector: Instantiable1[/* disconnectTimeout */ Double, typings.ioredis.mod.AbstractConnector] = js.native
    
    /**
      * Client for the official Redis Cluster
      */
    var Cluster: Instantiable1[/* startupNodes */ js.Array[ClusterNode], typings.ioredis.mod.Cluster] = js.native
    
    var Command: TypeofCommandInstantiable = js.native
    
    var Pipeline: Instantiable1[/* redis */ typings.ioredis.redisMod.default, typings.ioredis.mod.Pipeline] = js.native
    
    /**
      * This is the major component of ioredis.
      * Use it to connect to a standalone Redis server or Sentinels.
      *
      * ```typescript
      * const redis = new Redis(); // Default port is 6379
      * async function main() {
      *   redis.set("foo", "bar");
      *   redis.get("foo", (err, result) => {
      *     // `result` should be "bar"
      *     console.log(err, result);
      *   });
      *   // Or use Promise
      *   const result = await redis.get("foo");
      * }
      * ```
      */
    val Redis: TypeofRedis & (Instantiable3[
        /* port */ Double, 
        /* host */ String, 
        /* options */ RedisOptions, 
        typings.ioredis.mod.Redis
      ]) = js.native
    
    val ReplyError: Any = js.native
    
    var ScanStream: Instantiable1[/* opt */ Options, typings.ioredis.mod.ScanStream] = js.native
    
    var SentinelConnector: Instantiable1[/* options */ SentinelConnectionOptions, typings.ioredis.mod.SentinelConnector] = js.native
    
    var SentinelIterator: Instantiable1[
        /* sentinels */ js.Array[PartialSentinelAddress], 
        typings.ioredis.mod.SentinelIterator
      ] = js.native
    
    def print(): Unit = js.native
    def print(err: js.Error): Unit = js.native
    def print(err: js.Error, reply: Any): Unit = js.native
    def print(err: Null, reply: Any): Unit = js.native
  }
  
  trait TypeofRedis extends StObject {
    
    /* static member */
    /* was `typeof Cluster` */
    var Cluster: Instantiable2[
        /* startupNodes */ js.Array[ClusterNode], 
        /* options */ js.UndefOr[ClusterOptions], 
        default
      ]
    
    /* static member */
    /* was `typeof Command` */
    val Command: TypeofCommand
    
    /**
      * Create a Redis instance.
      * This is the same as `new Redis()` but is included for compatibility with node-redis.
      */
    /* static member */
    def createClient(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Redis> is not an array type */ args: ConstructorParameters[
          typings.ioredis.anon.TypeofRedis & (Instantiable3[/* port */ Double, /* host */ String, /* options */ RedisOptions, Redis])
        ]
    ): Redis
    
    /**
      * Default options
      */
    /* static member */
    var defaultOptions: Any
  }
  object TypeofRedis {
    
    inline def apply(
      Cluster: Instantiable2[
          /* startupNodes */ js.Array[ClusterNode], 
          /* options */ js.UndefOr[ClusterOptions], 
          default
        ],
      Command: TypeofCommand,
      createClient: ConstructorParameters[
          typings.ioredis.anon.TypeofRedis & (Instantiable3[/* port */ Double, /* host */ String, /* options */ RedisOptions, Redis])
        ] => Redis,
      defaultOptions: Any
    ): TypeofRedis = {
      val __obj = js.Dynamic.literal(Cluster = Cluster.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], createClient = js.Any.fromFunction1(createClient), defaultOptions = defaultOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofRedis]
    }
    
    extension [Self <: TypeofRedis](x: Self) {
      
      inline def setCluster(
        value: Instantiable2[
              /* startupNodes */ js.Array[ClusterNode], 
              /* options */ js.UndefOr[ClusterOptions], 
              default
            ]
      ): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: TypeofCommand): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
      
      inline def setCreateClient(
        value: ConstructorParameters[
              typings.ioredis.anon.TypeofRedis & (Instantiable3[/* port */ Double, /* host */ String, /* options */ RedisOptions, Redis])
            ] => Redis
      ): Self = StObject.set(x, "createClient", js.Any.fromFunction1(value))
      
      inline def setDefaultOptions(value: Any): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Typeofdefault extends StObject {
    
    /* static member */
    /* was `typeof Cluster` */
    var Cluster: Instantiable2[
        /* startupNodes */ js.Array[ClusterNode], 
        /* options */ js.UndefOr[ClusterOptions], 
        default
      ]
    
    /* static member */
    /* was `typeof Command` */
    val Command: TypeofCommand
    
    /**
      * Create a Redis instance.
      * This is the same as `new Redis()` but is included for compatibility with node-redis.
      */
    /* static member */
    def createClient(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Redis> is not an array type */ args: ConstructorParameters[
          typings.ioredis.anon.TypeofRedis & (Instantiable3[/* port */ Double, /* host */ String, /* options */ RedisOptions, Redis])
        ]
    ): Redis
    
    /**
      * Default options
      */
    /* static member */
    var defaultOptions: Any
  }
  object Typeofdefault {
    
    inline def apply(
      Cluster: Instantiable2[
          /* startupNodes */ js.Array[ClusterNode], 
          /* options */ js.UndefOr[ClusterOptions], 
          default
        ],
      Command: TypeofCommand,
      createClient: ConstructorParameters[
          typings.ioredis.anon.TypeofRedis & (Instantiable3[/* port */ Double, /* host */ String, /* options */ RedisOptions, Redis])
        ] => Redis,
      defaultOptions: Any
    ): Typeofdefault = {
      val __obj = js.Dynamic.literal(Cluster = Cluster.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], createClient = js.Any.fromFunction1(createClient), defaultOptions = defaultOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofdefault]
    }
    
    extension [Self <: Typeofdefault](x: Self) {
      
      inline def setCluster(
        value: Instantiable2[
              /* startupNodes */ js.Array[ClusterNode], 
              /* options */ js.UndefOr[ClusterOptions], 
              default
            ]
      ): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: TypeofCommand): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
      
      inline def setCreateClient(
        value: ConstructorParameters[
              typings.ioredis.anon.TypeofRedis & (Instantiable3[/* port */ Double, /* host */ String, /* options */ RedisOptions, Redis])
            ] => Redis
      ): Self = StObject.set(x, "createClient", js.Any.fromFunction1(value))
      
      inline def setDefaultOptions(value: Any): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    }
  }
}
