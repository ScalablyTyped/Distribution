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

trait Position extends js.Object {
  /** The position of the label. */
  var position: `inner-right` | `inner-center` | `inner-left` | `outer-right` | `outer-center` | `outer-left` | `inner-top` | `inner-middle` | `inner-bottom` | `outer-top` | `outer-middle` | `outer-bottom`
  /** The label text to show. */
  var text: String
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
}

