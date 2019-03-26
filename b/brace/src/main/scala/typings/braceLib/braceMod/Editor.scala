package typings
package braceLib.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "Editor")
@js.native
class EditorCls protected ()
  extends braceLib.braceMod.AceAjaxNs.Editor {
  /**
    * Creates a new `Editor` object.
    * @param renderer Associated `VirtualRenderer` that draws everything
    * @param session The `EditSession` to refer to
    **/
  def this(renderer: braceLib.braceMod.AceAjaxNs.VirtualRenderer) = this()
  def this(renderer: braceLib.braceMod.AceAjaxNs.VirtualRenderer, session: braceLib.braceMod.AceAjaxNs.IEditSession) = this()
}

