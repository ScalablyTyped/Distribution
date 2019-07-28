package typings.bson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Relaxed extends js.Object {
  var relaxed: js.UndefOr[Boolean] = js.undefined
}

object Anon_Relaxed {
  @scala.inline
  def apply(relaxed: js.UndefOr[Boolean] = js.undefined): Anon_Relaxed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(relaxed)) __obj.updateDynamic("relaxed")(relaxed)
    __obj.asInstanceOf[Anon_Relaxed]
  }
}

