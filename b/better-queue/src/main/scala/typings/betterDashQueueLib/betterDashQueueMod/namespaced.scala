package typings
package betterDashQueueLib.betterDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("better-queue", JSImport.Namespace)
@js.native
class namespaced[T, K] protected () extends BetterQueue[T, K] {
  def this(options: betterDashQueueLib.betterDashQueueMod.BetterQueueNs.QueueOptions[T, K]) = this()
  def this(process: betterDashQueueLib.betterDashQueueMod.BetterQueueNs.ProcessFunction[T, K]) = this()
  def this(process: betterDashQueueLib.betterDashQueueMod.BetterQueueNs.ProcessFunction[T, K], options: stdLib.Partial[betterDashQueueLib.betterDashQueueMod.BetterQueueNs.QueueOptions[T, K]]) = this()
}

