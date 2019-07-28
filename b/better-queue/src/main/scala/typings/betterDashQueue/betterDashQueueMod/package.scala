package typings.betterDashQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object betterDashQueueMod {
  // TODO reflect task types somehow (task: T | T[])
  type ProcessFunction[T, K] = js.Function2[/* task */ js.Any, /* cb */ ProcessFunctionCb[K], Unit]
  type ProcessFunctionCb[K] = js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[K], Unit]
}
