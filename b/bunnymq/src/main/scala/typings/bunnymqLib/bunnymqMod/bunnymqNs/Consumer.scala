package typings
package bunnymqLib.bunnymqMod.bunnymqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Consumer extends js.Object {
  /**
           * Handle messages from a named queue.
           *
           * @param queue A named queue.
           * @param callback A callback.
           */
  def consume[T](queue: java.lang.String, callback: ConsumerCallback[T]): scala.Unit
}

