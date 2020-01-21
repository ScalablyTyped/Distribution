package typings.bson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRelaxed extends js.Object {
  var relaxed: js.UndefOr[Boolean] = js.undefined
}

object AnonRelaxed {
  @scala.inline
  def apply(relaxed: js.UndefOr[Boolean] = js.undefined): AnonRelaxed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(relaxed)) __obj.updateDynamic("relaxed")(relaxed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelaxed]
  }
}

