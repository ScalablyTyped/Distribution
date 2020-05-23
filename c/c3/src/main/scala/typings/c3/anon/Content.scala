package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  /** Class to apply to the text. */
  var `class`: js.UndefOr[String] = js.undefined
  /** Text content to show. */
  var content: js.UndefOr[String] = js.undefined
  /** x-position. */
  var x: js.UndefOr[Double] = js.undefined
  /** y-position. */
  var y: js.UndefOr[Double] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    `class`: String = null,
    content: String = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): Content = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

