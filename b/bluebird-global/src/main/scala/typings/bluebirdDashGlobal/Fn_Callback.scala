package typings.bluebirdDashGlobal

import typings.bluebird.bluebirdMod.SpreadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Callback[T] extends js.Object {
  def apply(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit]): this.type = js.native
  def apply(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit], options: SpreadOption): this.type = js.native
  def apply(sink: js.Any*): this.type = js.native
}

