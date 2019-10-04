package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Theme[T] extends js.Object {
  @JSName("$theme")
  var $theme: T
}

object Anon_Theme {
  @scala.inline
  def apply[T]($theme: T): Anon_Theme[T] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Theme[T]]
  }
}

