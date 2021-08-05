package typings.bunnymq

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Instance = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Instance]
  inline def apply(options: Options): Instance = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Instance]
  
  @JSImport("bunnymq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Connection
    extends StObject
       with /* address */ StringDictionary[js.Any] {
    
    var startedAt: String
  }
  object Connection {
    
    inline def apply(startedAt: String): Connection = {
      val __obj = js.Dynamic.literal(startedAt = startedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    extension [Self <: Connection](x: Self) {
      
      inline def setStartedAt(value: String): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Consumer extends StObject {
    
    /**
      * Handle messages from a named queue.
      *
      * @param queue A named queue.
      * @param callback A callback.
      */
    def consume[T](queue: String, callback: ConsumerCallback[T]): Unit
  }
  object Consumer {
    
    inline def apply(consume: (String, ConsumerCallback[js.Any]) => Unit): Consumer = {
      val __obj = js.Dynamic.literal(consume = js.Any.fromFunction2(consume))
      __obj.asInstanceOf[Consumer]
    }
    
    extension [Self <: Consumer](x: Self) {
      
      inline def setConsume(value: (String, ConsumerCallback[js.Any]) => Unit): Self = StObject.set(x, "consume", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ConsumerCallback[T] extends StObject {
    
    def apply(args: js.Any*): T = js.native
  }
  
  @js.native
  trait Instance extends StObject {
    
    var connection: Connection = js.native
    
    var consumer: Consumer = js.native
    
    var producer: Producer = js.native
    
    /**
      * Publisher to send messages to a named queue.
      *
      * @return The consumer response.
      */
    def publish[T](queueName: String, message: js.Any): js.Promise[T] = js.native
    def publish[T](queueName: String, message: js.Any, options: ProducerOptions): js.Promise[T] = js.native
    
    /**
      * Subscriber to handle messages from a named queue.
      *
      * @param queue A named queue.
      * @param callback A callback.
      */
    def subscribe[T](queueName: String, callback: ConsumerCallback[T]): Unit = js.native
  }
  
  trait Logger extends StObject {
    
    def debug(format: js.Any, args: js.Any*): Unit
    @JSName("debug")
    var debug_Original: LoggerOutput
    
    def error(format: js.Any, args: js.Any*): Unit
    @JSName("error")
    var error_Original: LoggerOutput
    
    def info(format: js.Any, args: js.Any*): Unit
    @JSName("info")
    var info_Original: LoggerOutput
    
    def log(format: js.Any, args: js.Any*): Unit
    @JSName("log")
    var log_Original: LoggerOutput
    
    def warn(format: js.Any, args: js.Any*): Unit
    @JSName("warn")
    var warn_Original: LoggerOutput
  }
  object Logger {
    
    inline def apply(
      debug: LoggerOutput,
      error: LoggerOutput,
      info: LoggerOutput,
      log: LoggerOutput,
      warn: LoggerOutput
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: LoggerOutput): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: LoggerOutput): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: LoggerOutput): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setLog(value: LoggerOutput): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: LoggerOutput): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoggerOutput extends StObject {
    
    def apply(format: js.Any, args: js.Any*): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var consumerSuffix: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    /**
      * Number of fetched messages at once on the channel.
      *
      */
    var prefetch: js.UndefOr[Double] = js.undefined
    
    /**
      * Requeue put back message into the broker if consumer crashes/trigger exception.
      *
      */
    var requeue: js.UndefOr[Boolean] = js.undefined
    
    var rpcTimeout: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var transport: js.UndefOr[js.Any] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConsumerSuffix(value: String): Self = StObject.set(x, "consumerSuffix", value.asInstanceOf[js.Any])
      
      inline def setConsumerSuffixUndefined: Self = StObject.set(x, "consumerSuffix", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPrefetch(value: Double): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
      
      inline def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
      
      inline def setRequeue(value: Boolean): Self = StObject.set(x, "requeue", value.asInstanceOf[js.Any])
      
      inline def setRequeueUndefined: Self = StObject.set(x, "requeue", js.undefined)
      
      inline def setRpcTimeout(value: Double): Self = StObject.set(x, "rpcTimeout", value.asInstanceOf[js.Any])
      
      inline def setRpcTimeoutUndefined: Self = StObject.set(x, "rpcTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTransport(value: js.Any): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  @js.native
  trait Producer extends StObject {
    
    /**
      * Send messages to a named queue.
      *
      * @param queue A named queue.
      * @param message A message.
      * @return The consumer response.
      */
    def produce[T](queue: String, message: js.Any): js.Promise[T] = js.native
    def produce[T](queue: String, message: js.Any, options: ProducerOptions): js.Promise[T] = js.native
  }
  
  trait ProducerOptions extends StObject {
    
    var routingKey: js.UndefOr[String] = js.undefined
    
    var rpc: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ProducerOptions {
    
    inline def apply(): ProducerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProducerOptions]
    }
    
    extension [Self <: ProducerOptions](x: Self) {
      
      inline def setRoutingKey(value: String): Self = StObject.set(x, "routingKey", value.asInstanceOf[js.Any])
      
      inline def setRoutingKeyUndefined: Self = StObject.set(x, "routingKey", js.undefined)
      
      inline def setRpc(value: Boolean): Self = StObject.set(x, "rpc", value.asInstanceOf[js.Any])
      
      inline def setRpcUndefined: Self = StObject.set(x, "rpc", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
