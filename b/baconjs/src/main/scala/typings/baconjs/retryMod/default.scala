package typings.baconjs.retryMod

import typings.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/retry", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[V](options: RetryOptions[V]): EventStream[V] = js.native
}

