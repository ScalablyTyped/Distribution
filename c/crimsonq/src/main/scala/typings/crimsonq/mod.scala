package typings.crimsonq

import typings.crimsonq.anon.Error
import typings.crimsonq.anon.Key
import typings.crimsonq.anon.TypeofIORedis
import typings.crimsonq.crimsonqStrings.completed
import typings.crimsonq.crimsonqStrings.failed
import typings.ioredis.redisOptionsMod.RedisOptions
import typings.node.eventsMod.EventEmitter
import typings.std.ErrorConstructor
import typings.std.ErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("crimsonq", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CrimsonQClient {
    def this(ConnectionSettings: RedisOptions) = this()
    
    /* CompleteClass */
    override def Consumer(consumerId: String): typings.crimsonq.mod.Consumer = js.native
    
    /* CompleteClass */
    override def Producer(): typings.crimsonq.mod.Producer = js.native
    
    /* CompleteClass */
    var command: Command = js.native
    
    /* CompleteClass */
    override def connect(): js.Promise[Error] = js.native
    
    /* CompleteClass */
    var redisCommander: TypeofIORedis = js.native
    
    /* CompleteClass */
    var redisSubscriber: TypeofIORedis = js.native
  }
  
  trait Command extends StObject {
    
    def consumer_concurrency_ok(consumerId: String): js.Promise[CommandResult | ErrorConstructor]
    
    def consumer_concurrency_set(consumerId: String, concurrency: Double): js.Promise[CommandResult | ErrorConstructor]
    
    def consumer_create(consumerId: String, topics: js.Array[String], concurrency: Double): js.Promise[CommandResult | ErrorConstructor]
    
    def consumer_exists(consumerId: String): js.Promise[CommandResult | ErrorConstructor]
    
    def consumer_flush_completed(consumerId: String): js.Promise[CommandResult | ErrorConstructor]
    
    def consumer_flush_failed(consumerId: String, messageId: String): js.Promise[CommandResult | ErrorConstructor]
    
    def consumer_topics_get(consumerId: String): js.Promise[CommandResult | ErrorConstructor]
    
    def consumer_topics_set(consumerId: String, topics: js.Array[String]): js.Promise[CommandResult | ErrorConstructor]
    
    def msg_complete(consumerId: String, key: String): js.Promise[CommandResult | ErrorConstructor]
    
    def msg_counts(consumerId: String): js.Promise[CommandResult | ErrorConstructor]
    
    def msg_fail(consumerId: String, key: String, errorMessage: String): js.Promise[CommandResult | ErrorConstructor]
    
    def msg_push_consumer(consumerId: String, message: js.Object): js.Promise[CommandResult | ErrorConstructor]
    
    def msg_push_topic(topic: String, message: js.Object): js.Promise[CommandResult | ErrorConstructor]
    
    def msg_retry(consumerId: String, messageId: String): js.Promise[CommandResult | ErrorConstructor]
    
    def msg_retryall(consumerId: String): js.Promise[CommandResult | ErrorConstructor]
  }
  object Command {
    
    inline def apply(
      consumer_concurrency_ok: String => js.Promise[CommandResult | ErrorConstructor],
      consumer_concurrency_set: (String, Double) => js.Promise[CommandResult | ErrorConstructor],
      consumer_create: (String, js.Array[String], Double) => js.Promise[CommandResult | ErrorConstructor],
      consumer_exists: String => js.Promise[CommandResult | ErrorConstructor],
      consumer_flush_completed: String => js.Promise[CommandResult | ErrorConstructor],
      consumer_flush_failed: (String, String) => js.Promise[CommandResult | ErrorConstructor],
      consumer_topics_get: String => js.Promise[CommandResult | ErrorConstructor],
      consumer_topics_set: (String, js.Array[String]) => js.Promise[CommandResult | ErrorConstructor],
      msg_complete: (String, String) => js.Promise[CommandResult | ErrorConstructor],
      msg_counts: String => js.Promise[CommandResult | ErrorConstructor],
      msg_fail: (String, String, String) => js.Promise[CommandResult | ErrorConstructor],
      msg_push_consumer: (String, js.Object) => js.Promise[CommandResult | ErrorConstructor],
      msg_push_topic: (String, js.Object) => js.Promise[CommandResult | ErrorConstructor],
      msg_retry: (String, String) => js.Promise[CommandResult | ErrorConstructor],
      msg_retryall: String => js.Promise[CommandResult | ErrorConstructor]
    ): Command = {
      val __obj = js.Dynamic.literal(consumer_concurrency_ok = js.Any.fromFunction1(consumer_concurrency_ok), consumer_concurrency_set = js.Any.fromFunction2(consumer_concurrency_set), consumer_create = js.Any.fromFunction3(consumer_create), consumer_exists = js.Any.fromFunction1(consumer_exists), consumer_flush_completed = js.Any.fromFunction1(consumer_flush_completed), consumer_flush_failed = js.Any.fromFunction2(consumer_flush_failed), consumer_topics_get = js.Any.fromFunction1(consumer_topics_get), consumer_topics_set = js.Any.fromFunction2(consumer_topics_set), msg_complete = js.Any.fromFunction2(msg_complete), msg_counts = js.Any.fromFunction1(msg_counts), msg_fail = js.Any.fromFunction3(msg_fail), msg_push_consumer = js.Any.fromFunction2(msg_push_consumer), msg_push_topic = js.Any.fromFunction2(msg_push_topic), msg_retry = js.Any.fromFunction2(msg_retry), msg_retryall = js.Any.fromFunction1(msg_retryall))
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setConsumer_concurrency_ok(value: String => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "consumer_concurrency_ok", js.Any.fromFunction1(value))
      
      inline def setConsumer_concurrency_set(value: (String, Double) => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "consumer_concurrency_set", js.Any.fromFunction2(value))
      
      inline def setConsumer_create(value: (String, js.Array[String], Double) => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "consumer_create", js.Any.fromFunction3(value))
      
      inline def setConsumer_exists(value: String => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "consumer_exists", js.Any.fromFunction1(value))
      
      inline def setConsumer_flush_completed(value: String => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "consumer_flush_completed", js.Any.fromFunction1(value))
      
      inline def setConsumer_flush_failed(value: (String, String) => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "consumer_flush_failed", js.Any.fromFunction2(value))
      
      inline def setConsumer_topics_get(value: String => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "consumer_topics_get", js.Any.fromFunction1(value))
      
      inline def setConsumer_topics_set(value: (String, js.Array[String]) => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "consumer_topics_set", js.Any.fromFunction2(value))
      
      inline def setMsg_complete(value: (String, String) => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "msg_complete", js.Any.fromFunction2(value))
      
      inline def setMsg_counts(value: String => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "msg_counts", js.Any.fromFunction1(value))
      
      inline def setMsg_fail(value: (String, String, String) => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "msg_fail", js.Any.fromFunction3(value))
      
      inline def setMsg_push_consumer(value: (String, js.Object) => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "msg_push_consumer", js.Any.fromFunction2(value))
      
      inline def setMsg_push_topic(value: (String, js.Object) => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "msg_push_topic", js.Any.fromFunction2(value))
      
      inline def setMsg_retry(value: (String, String) => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "msg_retry", js.Any.fromFunction2(value))
      
      inline def setMsg_retryall(value: String => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "msg_retryall", js.Any.fromFunction1(value))
    }
  }
  
  trait CommandResult extends StObject {
    
    /* standard es2022.error */
    def error(): js.Error
    def error(message: String): js.Error
    def error(message: String, options: ErrorOptions): js.Error
    def error(message: Unit, options: ErrorOptions): js.Error
    @JSName("error")
    var error_Original: ErrorConstructor
    
    var value: String | js.Array[String]
  }
  object CommandResult {
    
    inline def apply(error: ErrorConstructor, value: String | js.Array[String]): CommandResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandResult]
    }
    
    extension [Self <: CommandResult](x: Self) {
      
      inline def setError(value: ErrorConstructor): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  @js.native
  trait Consumer extends StObject {
    
    def Subscribe(): js.Promise[Unit] = js.native
    
    def completeMessage(messageId: String): js.Promise[CommandResult | ErrorConstructor] = js.native
    
    def concurrencyOk(concurrency: Double): js.Promise[Boolean] = js.native
    
    var consumerId: String = js.native
    
    var cqClient: CrimsonQClient = js.native
    
    var events: CrimsonQEventEmitter = js.native
    
    def failMessage(messageId: String, errorMessage: String): js.Promise[CommandResult | ErrorConstructor] = js.native
    
    def flushMessages(status: failed | completed): js.Promise[CommandResult | ErrorConstructor] = js.native
    
    def getTopics(): js.Promise[CommandResult | ErrorConstructor] = js.native
    
    def init(topics: js.Array[String], concurrency: Double): js.Promise[js.UndefOr[js.Error]] = js.native
    
    def messageCountByStatus(): js.Promise[CommandResult | ErrorConstructor] = js.native
    
    def ping(): js.Promise[CommandResult | ErrorConstructor] = js.native
    
    def pull(): js.Promise[RecievedMessage | String | js.Error] = js.native
    
    def retryMessages(): js.Promise[CommandResult | ErrorConstructor] = js.native
    def retryMessages(messageId: String): js.Promise[CommandResult | ErrorConstructor] = js.native
    
    def setTopics(topics: js.Array[String]): js.Promise[CommandResult | ErrorConstructor] = js.native
    
    def updateConcurrency(concurrency: Double): js.Promise[CommandResult | ErrorConstructor] = js.native
  }
  
  trait CrimsonQClient extends StObject {
    
    def Consumer(consumerId: String): typings.crimsonq.mod.Consumer
    
    def Producer(): typings.crimsonq.mod.Producer
    
    var command: Command
    
    def connect(): js.Promise[Error]
    
    var redisCommander: TypeofIORedis
    
    var redisSubscriber: TypeofIORedis
  }
  object CrimsonQClient {
    
    inline def apply(
      Consumer: String => Consumer,
      Producer: () => Producer,
      command: Command,
      connect: () => js.Promise[Error],
      redisCommander: TypeofIORedis,
      redisSubscriber: TypeofIORedis
    ): CrimsonQClient = {
      val __obj = js.Dynamic.literal(Consumer = js.Any.fromFunction1(Consumer), Producer = js.Any.fromFunction0(Producer), command = command.asInstanceOf[js.Any], connect = js.Any.fromFunction0(connect), redisCommander = redisCommander.asInstanceOf[js.Any], redisSubscriber = redisSubscriber.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrimsonQClient]
    }
    
    extension [Self <: CrimsonQClient](x: Self) {
      
      inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setConnect(value: () => js.Promise[Error]): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      inline def setConsumer(value: String => Consumer): Self = StObject.set(x, "Consumer", js.Any.fromFunction1(value))
      
      inline def setProducer(value: () => Producer): Self = StObject.set(x, "Producer", js.Any.fromFunction0(value))
      
      inline def setRedisCommander(value: TypeofIORedis): Self = StObject.set(x, "redisCommander", value.asInstanceOf[js.Any])
      
      inline def setRedisSubscriber(value: TypeofIORedis): Self = StObject.set(x, "redisSubscriber", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CrimsonQEventEmitter extends EventEmitter
  
  trait Producer extends StObject {
    
    def ping(consumerId: String, message: js.Object): js.Promise[CommandResult | ErrorConstructor]
    
    def pushToConsumer(consumerId: String, message: js.Object): js.Promise[CommandResult | ErrorConstructor]
    
    def pushToTopic(topic: String, message: js.Object): js.Promise[CommandResult | ErrorConstructor]
  }
  object Producer {
    
    inline def apply(
      ping: (String, js.Object) => js.Promise[CommandResult | ErrorConstructor],
      pushToConsumer: (String, js.Object) => js.Promise[CommandResult | ErrorConstructor],
      pushToTopic: (String, js.Object) => js.Promise[CommandResult | ErrorConstructor]
    ): Producer = {
      val __obj = js.Dynamic.literal(ping = js.Any.fromFunction2(ping), pushToConsumer = js.Any.fromFunction2(pushToConsumer), pushToTopic = js.Any.fromFunction2(pushToTopic))
      __obj.asInstanceOf[Producer]
    }
    
    extension [Self <: Producer](x: Self) {
      
      inline def setPing(value: (String, js.Object) => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "ping", js.Any.fromFunction2(value))
      
      inline def setPushToConsumer(value: (String, js.Object) => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "pushToConsumer", js.Any.fromFunction2(value))
      
      inline def setPushToTopic(value: (String, js.Object) => js.Promise[CommandResult | ErrorConstructor]): Self = StObject.set(x, "pushToTopic", js.Any.fromFunction2(value))
    }
  }
  
  trait RecievedMessage extends StObject {
    
    var consumer: Consumer
    
    def done(): js.Promise[js.UndefOr[CommandResult | ErrorConstructor]]
    
    def fail(errorMessage: String): js.Promise[js.UndefOr[CommandResult | ErrorConstructor]]
    
    var key: String
    
    var message: Key
  }
  object RecievedMessage {
    
    inline def apply(
      consumer: Consumer,
      done: () => js.Promise[js.UndefOr[CommandResult | ErrorConstructor]],
      fail: String => js.Promise[js.UndefOr[CommandResult | ErrorConstructor]],
      key: String,
      message: Key
    ): RecievedMessage = {
      val __obj = js.Dynamic.literal(consumer = consumer.asInstanceOf[js.Any], done = js.Any.fromFunction0(done), fail = js.Any.fromFunction1(fail), key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecievedMessage]
    }
    
    extension [Self <: RecievedMessage](x: Self) {
      
      inline def setConsumer(value: Consumer): Self = StObject.set(x, "consumer", value.asInstanceOf[js.Any])
      
      inline def setDone(value: () => js.Promise[js.UndefOr[CommandResult | ErrorConstructor]]): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      inline def setFail(value: String => js.Promise[js.UndefOr[CommandResult | ErrorConstructor]]): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: Key): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
