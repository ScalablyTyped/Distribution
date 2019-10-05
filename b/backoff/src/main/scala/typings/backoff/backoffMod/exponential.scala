package typings.backoff.backoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backoff", "exponential")
@js.native
object exponential extends js.Object {
  def apply(): Backoff = js.native
  def apply(options: ExponentialOptions): Backoff = js.native
}

