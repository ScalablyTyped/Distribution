package typings.c3.anon

import typings.c3.c3Strings.`inner-bottom`
import typings.c3.c3Strings.`inner-center`
import typings.c3.c3Strings.`inner-left`
import typings.c3.c3Strings.`inner-middle`
import typings.c3.c3Strings.`inner-right`
import typings.c3.c3Strings.`inner-top`
import typings.c3.c3Strings.`outer-bottom`
import typings.c3.c3Strings.`outer-center`
import typings.c3.c3Strings.`outer-left`
import typings.c3.c3Strings.`outer-middle`
import typings.c3.c3Strings.`outer-right`
import typings.c3.c3Strings.`outer-top`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  /** The position of the label. */
  var position: `inner-right` | `inner-center` | `inner-left` | `outer-right` | `outer-center` | `outer-left` | `inner-top` | `inner-middle` | `inner-bottom` | `outer-top` | `outer-middle` | `outer-bottom` = js.native
  /** The label text to show. */
  var text: String = js.native
}

object Position {
  @scala.inline
  def apply(
    position: `inner-right` | `inner-center` | `inner-left` | `outer-right` | `outer-center` | `outer-left` | `inner-top` | `inner-middle` | `inner-bottom` | `outer-top` | `outer-middle` | `outer-bottom`,
    text: String
  ): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
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
    def setPosition(
      value: `inner-right` | `inner-center` | `inner-left` | `outer-right` | `outer-center` | `outer-left` | `inner-top` | `inner-middle` | `inner-bottom` | `outer-top` | `outer-middle` | `outer-bottom`
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

