package typings.betterDashQueue.betterDashQueueMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("better-queue", JSImport.Namespace)
@js.native
class ^[T, K] protected () extends BetterQueue[T, K] {
  def this(options: QueueOptions[T, K]) = this()
  def this(process: ProcessFunction[T, K]) = this()
  def this(process: ProcessFunction[T, K], options: Partial[QueueOptions[T, K]]) = this()
}

