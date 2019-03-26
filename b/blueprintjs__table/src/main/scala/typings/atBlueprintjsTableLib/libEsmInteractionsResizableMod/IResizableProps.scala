package typings
package atBlueprintjsTableLib.libEsmInteractionsResizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizableProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps
     with atBlueprintjsTableLib.libEsmInteractionsResizeHandleMod.ILockableLayout {
  /**
    * Enables/disables the resize interaction for the column.
    * @default true
    */
  var isResizable: js.UndefOr[scala.Boolean] = js.native
  /**
    * The optional maximum width of the column.
    */
  var maxSize: js.UndefOr[scala.Double] = js.native
  /**
    * The optional minimum width of the column.
    */
  var minSize: js.UndefOr[scala.Double] = js.native
  /**
    * A callback that is called when the user double clicks the resize handle
    */
  var onDoubleClick: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /**
    * A callback that is called when the user is done dragging the resize
    * handle.
    *
    * @param size is the final resized size
    */
  var onResizeEnd: js.UndefOr[js.Function1[/* size */ scala.Double, scala.Unit]] = js.native
  /**
    * A callback that is called while the user is dragging the resize
    * handle.
    *
    * @param size is the resized size
    */
  var onSizeChanged: js.UndefOr[js.Function1[/* size */ scala.Double, scala.Unit]] = js.native
  /**
    * Determines how the resize handle is oriented in the resizable child.
    */
  var orientation: atBlueprintjsTableLib.libEsmInteractionsResizeHandleMod.Orientation = js.native
  /**
    * The initial dimensional size.
    */
  var size: scala.Double = js.native
}

