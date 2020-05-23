package typings.c3.anon

import typings.c3.c3Strings.center
import typings.c3.c3Strings.left
import typings.c3.c3Strings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Padding extends js.Object {
  /**
    * Spacing around the title.
    */
  var padding: js.UndefOr[typings.c3.mod.Padding] = js.undefined
  /**
    * Chart title text.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Position the title relative to the chart.
    */
  var title_position: js.UndefOr[right | center | left] = js.undefined
}

object Padding {
  @scala.inline
  def apply(
    padding: typings.c3.mod.Padding = null,
    text: String = null,
    title_position: right | center | left = null
  ): Padding = {
    val __obj = js.Dynamic.literal()
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title_position != null) __obj.updateDynamic("title_position")(title_position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
}

