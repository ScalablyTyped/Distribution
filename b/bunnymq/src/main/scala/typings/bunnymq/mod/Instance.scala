package typings.bunnymq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
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
