package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

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
  var position: js.UndefOr[
    codemirrorLib.codemirrorLibStrings.top | codemirrorLib.codemirrorLibStrings.`after-top` | codemirrorLib.codemirrorLibStrings.bottom | codemirrorLib.codemirrorLibStrings.`before-bottom`
  ] = js.undefined
  /**The new panel will replace the given panel. */
  var replace: js.UndefOr[Panel] = js.undefined
  /**Whether to scroll the editor to keep the text's vertical position stable, when adding a panel above it. Defaults to false. */
  var stable: js.UndefOr[scala.Boolean] = js.undefined
}

