package typings.blueprintjsTable.resizeHandleMod

import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResizeHandleProps
  extends IProps
     with ILockableLayout {
  
  /**
    * A callback that is called when the user double clicks the resize handle
    */
  var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A callback that is called when the user is done dragging the resize
    * handle.
    *
    * @param offset is the difference between the initial and final coordinates
    */
  var onResizeEnd: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.native
  
  /**
    * A callback that is called while the user is dragging the resize
    * handle.
    *
    * @param offset is the difference between the initial and current coordinates
    * @param delta is the difference between this and the previous offset
    */
  var onResizeMove: js.UndefOr[js.Function2[/* offset */ Double, /* delta */ Double, Unit]] = js.native
  
  /**
    * An enum value to indicate the orientation of the resize handle.
    */
  var orientation: Orientation = js.native
}
