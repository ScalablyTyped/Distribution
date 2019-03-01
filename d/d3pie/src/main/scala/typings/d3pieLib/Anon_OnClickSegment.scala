package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnClickSegment extends js.Object {
  var onClickSegment: js.UndefOr[js.Function] = js.undefined
  var onMouseoutSegment: js.UndefOr[js.Function] = js.undefined
  var onMouseoverSegment: js.UndefOr[js.Function] = js.undefined
  var onload: js.UndefOr[js.Function] = js.undefined
}

object Anon_OnClickSegment {
  @scala.inline
  def apply(
    onClickSegment: js.Function = null,
    onMouseoutSegment: js.Function = null,
    onMouseoverSegment: js.Function = null,
    onload: js.Function = null
  ): Anon_OnClickSegment = {
    val __obj = js.Dynamic.literal()
    if (onClickSegment != null) __obj.updateDynamic("onClickSegment")(onClickSegment)
    if (onMouseoutSegment != null) __obj.updateDynamic("onMouseoutSegment")(onMouseoutSegment)
    if (onMouseoverSegment != null) __obj.updateDynamic("onMouseoverSegment")(onMouseoverSegment)
    if (onload != null) __obj.updateDynamic("onload")(onload)
    __obj.asInstanceOf[Anon_OnClickSegment]
  }
}

