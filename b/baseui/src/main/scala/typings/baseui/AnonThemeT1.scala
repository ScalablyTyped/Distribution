package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThemeT1[T1] extends js.Object {
  @JSName("$theme")
  var $theme: T1
}

object AnonThemeT1 {
  @scala.inline
  def apply[T1]($theme: T1): AnonThemeT1[T1] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonThemeT1[T1]]
  }
}

