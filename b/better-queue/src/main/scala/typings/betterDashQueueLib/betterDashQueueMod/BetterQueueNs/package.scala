package typings
package betterDashQueueLib.betterDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BetterQueueNs {
  // TODO reflect task types somehow (task: T | T[])
  type ProcessFunction[T, K] = js.Function2[/* task */ js.Any, /* cb */ ProcessFunctionCb[K], scala.Unit]
  type ProcessFunctionCb[K] = js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[K], scala.Unit]
  type QueueEvent = betterDashQueueLib.betterDashQueueLibStrings.task_queued | betterDashQueueLib.betterDashQueueLibStrings.task_accepted | betterDashQueueLib.betterDashQueueLibStrings.task_started | betterDashQueueLib.betterDashQueueLibStrings.task_finish | betterDashQueueLib.betterDashQueueLibStrings.task_failed | betterDashQueueLib.betterDashQueueLibStrings.task_progress | betterDashQueueLib.betterDashQueueLibStrings.batch_finish | betterDashQueueLib.betterDashQueueLibStrings.batch_failed | betterDashQueueLib.betterDashQueueLibStrings.batch_progress | betterDashQueueLib.betterDashQueueLibStrings.error
  type TicketEvent = betterDashQueueLib.betterDashQueueLibStrings.accept | betterDashQueueLib.betterDashQueueLibStrings.queued | betterDashQueueLib.betterDashQueueLibStrings.started | betterDashQueueLib.betterDashQueueLibStrings.progress | betterDashQueueLib.betterDashQueueLibStrings.finish | betterDashQueueLib.betterDashQueueLibStrings.failed | betterDashQueueLib.betterDashQueueLibStrings.error
}
