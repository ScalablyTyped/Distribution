package typings
package delayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Once extends js.Object {
  var once: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Once {
  @scala.inline
  def apply(once: js.UndefOr[scala.Boolean] = js.undefined): Anon_Once = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    __obj.asInstanceOf[Anon_Once]
  }
}

