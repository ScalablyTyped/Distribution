package typings.carbonIconHelpers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focusable extends js.Object {
  var focusable: String
  var height: Double
  var preserveAspectRatio: String
  var role: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var viewBox: String
  var width: Double
}

object Focusable {
  @scala.inline
  def apply(
    focusable: String,
    height: Double,
    preserveAspectRatio: String,
    viewBox: String,
    width: Double,
    role: String = null,
    title: String = null
  ): Focusable = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focusable]
  }
}

