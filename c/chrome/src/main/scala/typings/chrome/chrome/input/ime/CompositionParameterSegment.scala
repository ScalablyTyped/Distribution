package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositionParameterSegment extends js.Object {
  /** Index of the character to end this segment after. */
  var end: Double = js.native
  /** Index of the character to start this segment at */
  var start: Double = js.native
  /** The type of the underline to modify this segment. */
  var style: String = js.native
}

object CompositionParameterSegment {
  @scala.inline
  def apply(end: Double, start: Double, style: String): CompositionParameterSegment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionParameterSegment]
  }
  @scala.inline
  implicit class CompositionParameterSegmentOps[Self <: CompositionParameterSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

