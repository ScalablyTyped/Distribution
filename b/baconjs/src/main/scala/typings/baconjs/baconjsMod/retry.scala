package typings.baconjs.baconjsMod

import typings.baconjs.typesRetryMod.RetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "retry")
@js.native
object retry extends js.Object {
  def apply[V](options: RetryOptions[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
}

