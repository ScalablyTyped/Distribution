package typings.brace.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "Editor")
@js.native
class EditorCls protected () extends Editor {
  /**
    * Creates a new `Editor` object.
    * @param renderer Associated `VirtualRenderer` that draws everything
    * @param session The `EditSession` to refer to
    **/
  def this(renderer: VirtualRenderer) = this()
  def this(renderer: VirtualRenderer, session: IEditSession) = this()
}

