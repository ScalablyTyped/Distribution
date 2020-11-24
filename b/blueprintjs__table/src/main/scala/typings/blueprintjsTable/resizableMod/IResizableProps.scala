package typings.blueprintjsTable.resizableMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.resizeHandleMod.ILockableLayout
import typings.blueprintjsTable.resizeHandleMod.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResizableProps
  extends IProps
     with ILockableLayout {
  
  /**
    * Enables/disables the resize interaction for the column.
    * @default true
    */
  var isResizable: js.UndefOr[Boolean] = js.native
  
  /**
    * The optional maximum width of the column.
    */
  var maxSize: js.UndefOr[Double] = js.native
  
  /**
    * The optional minimum width of the column.
    */
  var minSize: js.UndefOr[Double] = js.native
  
  /**
    * A callback that is called when the user double clicks the resize handle
    */
  var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A callback that is called when the user is done dragging the resize
    * handle.
    *
    * @param size is the final resized size
    */
  var onResizeEnd: js.UndefOr[js.Function1[/* size */ Double, Unit]] = js.native
  
  /**
    * A callback that is called while the user is dragging the resize
    * handle.
    *
    * @param size is the resized size
    */
  var onSizeChanged: js.UndefOr[js.Function1[/* size */ Double, Unit]] = js.native
  
  /**
    * Determines how the resize handle is oriented in the resizable child.
    */
  var orientation: Orientation = js.native
  
  /**
    * The initial dimensional size.
    */
  var size: Double = js.native
}
