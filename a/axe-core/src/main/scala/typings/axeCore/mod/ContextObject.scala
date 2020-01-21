package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextObject extends js.Object {
  var exclude: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  var include: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
}

object ContextObject {
  @scala.inline
  def apply(
    exclude: js.Array[js.Array[String] | String] = null,
    include: js.Array[js.Array[String] | String] = null
  ): ContextObject = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextObject]
  }
}

