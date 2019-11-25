package typings.delay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Once extends js.Object {
  var once: js.UndefOr[Boolean] = js.undefined
}

object Anon_Once {
  @scala.inline
  def apply(once: js.UndefOr[Boolean] = js.undefined): Anon_Once = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Once]
  }
}

