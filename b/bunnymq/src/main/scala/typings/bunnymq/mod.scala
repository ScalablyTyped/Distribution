package typings.bunnymq

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunnymq", JSImport.Namespace)
  @js.native
  def apply(): Instance = js.native
  @JSImport("bunnymq", JSImport.Namespace)
  @js.native
  def apply(options: Options): Instance = js.native
  
  @js.native
  trait Connection
    extends /* address */ StringDictionary[js.Any] {
    
    var startedAt: String = js.native
  }
  object Connection {
    
    @scala.inline
    def apply(startedAt: String): Connection = {
      val __obj = js.Dynamic.literal(startedAt = startedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStartedAt(value: String): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Consumer extends StObject {
    
    /**
      * Handle messages from a named queue.
      *
      * @param queue A named queue.
      * @param callback A callback.
      */
    def consume[T](queue: String, callback: ConsumerCallback[T]): Unit = js.native
  }
  object Consumer {
    
    @scala.inline
    def apply(consume: (String, ConsumerCallback[js.Any]) => Unit): Consumer = {
      val __obj = js.Dynamic.literal(consume = js.Any.fromFunction2(consume))
      __obj.asInstanceOf[Consumer]
    }
    
    @scala.inline
    implicit class ConsumerMutableBuilder[Self <: Consumer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsume(value: (String, ConsumerCallback[js.Any]) => Unit): Self = StObject.set(x, "consume", js.Any.fromFunction2(value))
    }
  }
  
  type ConsumerCallback[T] = js.Function1[/* repeated */ js.Any, T]
  
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
  
  @js.native
  trait Logger extends StObject {
    
    def debug(format: js.Any, args: js.Any*): Unit = js.native
    @JSName("debug")
    var debug_Original: LoggerOutput = js.native
    
    def error(format: js.Any, args: js.Any*): Unit = js.native
    @JSName("error")
    var error_Original: LoggerOutput = js.native
    
    def info(format: js.Any, args: js.Any*): Unit = js.native
    @JSName("info")
    var info_Original: LoggerOutput = js.native
    
    def log(format: js.Any, args: js.Any*): Unit = js.native
    @JSName("log")
    var log_Original: LoggerOutput = js.native
    
    def warn(format: js.Any, args: js.Any*): Unit = js.native
    @JSName("warn")
    var warn_Original: LoggerOutput = js.native
  }
  
  type LoggerOutput = js.Function2[/* format */ js.Any, /* repeated */ js.Any, Unit]
  
  @js.native
  trait Options extends StObject {
    
    var consumerSuffix: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var hostname: js.UndefOr[String] = js.native
    
    /**
      * Number of fetched messages at once on the channel.
      *
      */
    var prefetch: js.UndefOr[Double] = js.native
    
    /**
      * Requeue put back message into the broker if consumer crashes/trigger exception.
      *
      */
    var requeue: js.UndefOr[Boolean] = js.native
    
    var rpcTimeout: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var transport: js.UndefOr[js.Any] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumerSuffix(value: String): Self = StObject.set(x, "consumerSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumerSuffixUndefined: Self = StObject.set(x, "consumerSuffix", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setPrefetch(value: Double): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
      
      @scala.inline
      def setRequeue(value: Boolean): Self = StObject.set(x, "requeue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequeueUndefined: Self = StObject.set(x, "requeue", js.undefined)
      
      @scala.inline
      def setRpcTimeout(value: Double): Self = StObject.set(x, "rpcTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpcTimeoutUndefined: Self = StObject.set(x, "rpcTimeout", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTransport(value: js.Any): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
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
  
  @js.native
  trait ProducerOptions extends StObject {
    
    var routingKey: js.UndefOr[String] = js.native
    
    var rpc: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object ProducerOptions {
    
    @scala.inline
    def apply(): ProducerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProducerOptions]
    }
    
    @scala.inline
    implicit class ProducerOptionsMutableBuilder[Self <: ProducerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoutingKey(value: String): Self = StObject.set(x, "routingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingKeyUndefined: Self = StObject.set(x, "routingKey", js.undefined)
      
      @scala.inline
      def setRpc(value: Boolean): Self = StObject.set(x, "rpc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpcUndefined: Self = StObject.set(x, "rpc", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
