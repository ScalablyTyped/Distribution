package typings.delay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Once extends js.Object {
  var once: js.UndefOr[Boolean] = js.undefined
}

object Once {
  @scala.inline
  def apply(once: js.UndefOr[Boolean] = js.undefined): Once = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Once]
  }
}

