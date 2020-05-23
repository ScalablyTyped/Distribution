package typings.behavior3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Milliseconds extends js.Object {
  var milliseconds: js.UndefOr[Double] = js.undefined
}

object Milliseconds {
  @scala.inline
  def apply(milliseconds: js.UndefOr[Double] = js.undefined): Milliseconds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(milliseconds)) __obj.updateDynamic("milliseconds")(milliseconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milliseconds]
  }
}

