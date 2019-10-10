package typings.atBabelTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Computed extends js.Object {
  var computed: Boolean | Null
}

object Anon_Computed {
  @scala.inline
  def apply(computed: js.UndefOr[Boolean] = js.undefined): Anon_Computed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    __obj.asInstanceOf[Anon_Computed]
  }
}

