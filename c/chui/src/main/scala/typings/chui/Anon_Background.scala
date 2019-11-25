package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var handle: js.UndefOr[Boolean] = js.undefined
  var id: String
  var listClass: js.UndefOr[String] = js.undefined
}

object Anon_Background {
  @scala.inline
  def apply(
    id: String,
    background: String = null,
    handle: js.UndefOr[Boolean] = js.undefined,
    listClass: String = null
  ): Anon_Background = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(handle)) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (listClass != null) __obj.updateDynamic("listClass")(listClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Background]
  }
}

