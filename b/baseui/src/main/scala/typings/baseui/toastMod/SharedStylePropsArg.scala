package typings.baseui.toastMod

import typings.baseui.baseuiStrings.`inline`
import typings.baseui.baseuiStrings.info
import typings.baseui.baseuiStrings.negative
import typings.baseui.baseuiStrings.positive
import typings.baseui.baseuiStrings.toast
import typings.baseui.baseuiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStylePropsArg extends js.Object {
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.native
  @JSName("$isRendered")
  var $isRendered: js.UndefOr[Boolean] = js.native
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.native
  @JSName("$kind")
  var $kind: js.UndefOr[info | positive | warning | negative] = js.native
  @JSName("$type")
  var $type: js.UndefOr[`inline` | toast] = js.native
}

object SharedStylePropsArg {
  @scala.inline
  def apply(): SharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArg]
  }
  @scala.inline
  implicit class SharedStylePropsArgOps[Self <: SharedStylePropsArg] (val x: Self) extends AnyVal {
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
    def set$closeable(value: Boolean): Self = this.set("$closeable", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$closeable: Self = this.set("$closeable", js.undefined)
    @scala.inline
    def set$isRendered(value: Boolean): Self = this.set("$isRendered", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$isRendered: Self = this.set("$isRendered", js.undefined)
    @scala.inline
    def set$isVisible(value: Boolean): Self = this.set("$isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$isVisible: Self = this.set("$isVisible", js.undefined)
    @scala.inline
    def set$kind(value: info | positive | warning | negative): Self = this.set("$kind", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$kind: Self = this.set("$kind", js.undefined)
    @scala.inline
    def set$type(value: `inline` | toast): Self = this.set("$type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$type: Self = this.set("$type", js.undefined)
  }
  
}

