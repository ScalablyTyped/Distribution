package typings
package atBlueprintjsTableLib.libEsmInteractionsResizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
@js.native
class Resizable protected ()
  extends reactLib.reactMod.PureComponent[IResizableProps, IResizeableState, js.Any] {
  def this(props: IResizableProps) = this()
  def this(props: IResizableProps, context: js.Any) = this()
  var onResizeEnd: js.Any = js.native
  var onResizeMove: js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MResizable(nextProps: IResizableProps): scala.Unit = js.native
  /**
    * Returns the CSS style to apply to the child element given the state's
    * size value.
    */
  /* private */ def getStyle(): js.Any = js.native
  /* private */ def offsetSize(offset: js.Any): js.Any = js.native
  /* private */ def renderResizeHandle(): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
@js.native
object Resizable extends js.Object {
  var defaultProps: atBlueprintjsTableLib.Anon_IsResizable = js.native
}

