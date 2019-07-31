package typings.atBlueprintjsTable.libEsmInteractionsResizableMod

import typings.atBlueprintjsTable.Anon_IsResizable
import typings.react.reactMod.PureComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
@js.native
class Resizable protected ()
  extends PureComponent[IResizableProps, IResizeableState, js.Any] {
  def this(props: IResizableProps) = this()
  def this(props: IResizableProps, context: js.Any) = this()
  /**
    * Returns the CSS style to apply to the child element given the state's
    * size value.
    */
  var getStyle: js.Any = js.native
  var offsetSize: js.Any = js.native
  var onResizeEnd: js.Any = js.native
  var onResizeMove: js.Any = js.native
  var renderResizeHandle: js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MResizable(nextProps: IResizableProps): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
@js.native
object Resizable extends js.Object {
  var defaultProps: Anon_IsResizable = js.native
}

