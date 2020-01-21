package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.`after-top`
import typings.codemirror.codemirrorStrings.`before-bottom`
import typings.codemirror.codemirrorStrings.bottom
import typings.codemirror.codemirrorStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowPanelOptions extends js.Object {
  /**The new panel will be added after the given panel. */
  var after: js.UndefOr[Panel] = js.undefined
  /**The new panel will be added before the given panel. */
  var before: js.UndefOr[Panel] = js.undefined
  /**Controls the position of the newly added panel. The following values are recognized:  
    * `top` (default): Adds the panel at the very top.  
    *  `after-top`: Adds the panel at the bottom of the top panels.  
    *  `bottom`: Adds the panel at the very bottom.  
    *  `before-bottom`: Adds the panel at the top of the bottom panels.  
    */
  var position: js.UndefOr[top | `after-top` | bottom | `before-bottom`] = js.undefined
  /**The new panel will replace the given panel. */
  var replace: js.UndefOr[Panel] = js.undefined
  /**Whether to scroll the editor to keep the text's vertical position stable, when adding a panel above it. Defaults to false. */
  var stable: js.UndefOr[Boolean] = js.undefined
}

object ShowPanelOptions {
  @scala.inline
  def apply(
    after: Panel = null,
    before: Panel = null,
    position: top | `after-top` | bottom | `before-bottom` = null,
    replace: Panel = null,
    stable: js.UndefOr[Boolean] = js.undefined
  ): ShowPanelOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (!js.isUndefined(stable)) __obj.updateDynamic("stable")(stable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowPanelOptions]
  }
}

