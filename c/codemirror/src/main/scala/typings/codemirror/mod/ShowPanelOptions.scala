package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.`after-top`
import typings.codemirror.codemirrorStrings.`before-bottom`
import typings.codemirror.codemirrorStrings.bottom
import typings.codemirror.codemirrorStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowPanelOptions extends js.Object {
  /**The new panel will be added after the given panel. */
  var after: js.UndefOr[Panel] = js.native
  /**The new panel will be added before the given panel. */
  var before: js.UndefOr[Panel] = js.native
  /**Controls the position of the newly added panel. The following values are recognized:
    * `top` (default): Adds the panel at the very top.
    *  `after-top`: Adds the panel at the bottom of the top panels.
    *  `bottom`: Adds the panel at the very bottom.
    *  `before-bottom`: Adds the panel at the top of the bottom panels.
    */
  var position: js.UndefOr[top | `after-top` | bottom | `before-bottom`] = js.native
  /**The new panel will replace the given panel. */
  var replace: js.UndefOr[Panel] = js.native
  /**Whether to scroll the editor to keep the text's vertical position stable, when adding a panel above it. Defaults to false. */
  var stable: js.UndefOr[Boolean] = js.native
}

object ShowPanelOptions {
  @scala.inline
  def apply(): ShowPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowPanelOptions]
  }
  @scala.inline
  implicit class ShowPanelOptionsOps[Self <: ShowPanelOptions] (val x: Self) extends AnyVal {
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
    def setAfter(value: Panel): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setBefore(value: Panel): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setPosition(value: top | `after-top` | bottom | `before-bottom`): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setReplace(value: Panel): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    @scala.inline
    def setStable(value: Boolean): Self = this.set("stable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStable: Self = this.set("stable", js.undefined)
  }
  
}

