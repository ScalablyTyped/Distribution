package typings.blueprintjsTable.resizableMod

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsTable.anon.IsResizable
import typings.blueprintjsTable.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
@js.native
class Resizable ()
  extends AbstractPureComponent2[IResizableProps, IResizeableState, js.Object] {
  /**
    * Returns the CSS style to apply to the child element given the state's
    * size value.
    */
  var getStyle: js.Any = js.native
  var offsetSize: js.Any = js.native
  var onResizeEnd: js.Any = js.native
  var onResizeMove: js.Any = js.native
  var renderResizeHandle: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MResizable(prevProps: IResizableProps): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
@js.native
object Resizable extends js.Object {
  var defaultProps: IsResizable = js.native
  def getDerivedStateFromProps(hasSize: IResizableProps, prevState: IResizeableState): Size = js.native
}

