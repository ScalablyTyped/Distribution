package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickSegment extends js.Object {
  var onClickSegment: js.UndefOr[js.Function] = js.undefined
  var onMouseoutSegment: js.UndefOr[js.Function] = js.undefined
  var onMouseoverSegment: js.UndefOr[js.Function] = js.undefined
  var onload: js.UndefOr[js.Function] = js.undefined
}

object OnClickSegment {
  @scala.inline
  def apply(
    onClickSegment: js.Function = null,
    onMouseoutSegment: js.Function = null,
    onMouseoverSegment: js.Function = null,
    onload: js.Function = null
  ): OnClickSegment = {
    val __obj = js.Dynamic.literal()
    if (onClickSegment != null) __obj.updateDynamic("onClickSegment")(onClickSegment.asInstanceOf[js.Any])
    if (onMouseoutSegment != null) __obj.updateDynamic("onMouseoutSegment")(onMouseoutSegment.asInstanceOf[js.Any])
    if (onMouseoverSegment != null) __obj.updateDynamic("onMouseoverSegment")(onMouseoverSegment.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(onload.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickSegment]
  }
}

