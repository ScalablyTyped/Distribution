package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("camunda-external-task-client-js", "Client")
@js.native
class Client protected () extends js.Object {
  def this(config: ClientConfig) = this()
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def subscribe(topic: String, handler: Handler): TopicSubscription = js.native
  def subscribe(topic: String, options: SubscribeOptions, handler: Handler): TopicSubscription = js.native
}

