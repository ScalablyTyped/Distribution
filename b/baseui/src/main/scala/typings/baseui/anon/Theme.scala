package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme[T] extends js.Object {
  @JSName("$theme")
  var $theme: T
}

object Theme {
  @scala.inline
  def apply[T]($theme: T): Theme[T] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme[T]]
  }
}

