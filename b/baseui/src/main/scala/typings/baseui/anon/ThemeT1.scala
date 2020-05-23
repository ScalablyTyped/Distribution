package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeT1[T1] extends js.Object {
  @JSName("$theme")
  var $theme: T1
}

object ThemeT1 {
  @scala.inline
  def apply[T1]($theme: T1): ThemeT1[T1] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeT1[T1]]
  }
}

