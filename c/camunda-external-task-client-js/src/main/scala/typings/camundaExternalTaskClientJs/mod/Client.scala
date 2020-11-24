package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("camunda-external-task-client-js", "Client")
@js.native
class Client protected () extends js.Object {
  def this(config: ClientConfig) = this()
  
  def on(name: ErrorEvent, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def on(name: ErrorWithTaskEvent, callback: js.Function2[/* task */ Task, /* error */ js.Any, Unit]): Unit = js.native
  def on(name: PollEvent, callback: js.Function0[Unit]): Unit = js.native
  def on(name: SuccessWithTaskEvent, callback: js.Function1[/* task */ Task, Unit]): Unit = js.native
  def on(name: SuccessWithTasksEvent, callback: js.Function1[/* tasks */ js.Array[Task], Unit]): Unit = js.native
  def on(
    name: TopicEvent,
    callback: js.Function2[/* topic */ String, /* topicSubscription */ TopicSubscription, Unit]
  ): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
  
  def subscribe(topic: String, handler: Handler): TopicSubscription = js.native
  def subscribe(topic: String, options: SubscribeOptions, handler: Handler): TopicSubscription = js.native
}
