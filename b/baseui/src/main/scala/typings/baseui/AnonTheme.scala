package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTheme[T] extends js.Object {
  @JSName("$theme")
  var $theme: T
}

object AnonTheme {
  @scala.inline
  def apply[T]($theme: T): AnonTheme[T] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTheme[T]]
  }
}

