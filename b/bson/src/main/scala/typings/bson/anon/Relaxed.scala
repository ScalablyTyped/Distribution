package typings.bson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relaxed extends js.Object {
  var relaxed: js.UndefOr[Boolean] = js.undefined
}

object Relaxed {
  @scala.inline
  def apply(relaxed: js.UndefOr[Boolean] = js.undefined): Relaxed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(relaxed)) __obj.updateDynamic("relaxed")(relaxed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relaxed]
  }
}

