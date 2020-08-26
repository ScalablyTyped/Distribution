package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeT1[T1] extends js.Object {
  @JSName("$theme")
  var $theme: T1 = js.native
}

object ThemeT1 {
  @scala.inline
  def apply[T1]($theme: T1): ThemeT1[T1] = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeT1[T1]]
  }
  @scala.inline
  implicit class ThemeT1Ops[Self <: ThemeT1[_], T1] (val x: Self with ThemeT1[T1]) extends AnyVal {
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
    def set$theme(value: T1): Self = this.set("$theme", value.asInstanceOf[js.Any])
  }
  
}

