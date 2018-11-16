package typings
package bunnymqLib.bunnymqMod.bunnymqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Producer extends js.Object {
  /**
           * Send messages to a named queue.
           *
           * @param queue A named queue.
           * @param message A message.
           * @return The consumer response.
           */
  def produce[T](queue: java.lang.String, message: js.Any): stdLib.Promise[T] = js.native
  /**
           * Send messages to a named queue.
           *
           * @param queue A named queue.
           * @param message A message.
           * @return The consumer response.
           */
  def produce[T](queue: java.lang.String, message: js.Any, options: ProducerOptions): stdLib.Promise[T] = js.native
}

