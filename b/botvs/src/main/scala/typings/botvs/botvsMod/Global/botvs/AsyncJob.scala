package typings.botvs.botvsMod.Global.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncJob[T] extends js.Object {
  def wait(timeout: Double): js.UndefOr[T | Null] = js.native
}

