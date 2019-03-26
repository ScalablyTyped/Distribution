package typings
package bluebirdDashGlobalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback[T] extends js.Object {
  def apply(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], scala.Unit]): this.type = js.native
  def apply(
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], scala.Unit],
    options: bluebirdLib.bluebirdMod.BluebirdNs.SpreadOption
  ): this.type = js.native
  def apply(sink: js.Any*): this.type = js.native
}

