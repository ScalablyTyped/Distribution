package typings
package atBlueprintjsTableLib.libEsmInteractionsResizeHandleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeHandleProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps
     with ILockableLayout {
  /**
    * A callback that is called when the user double clicks the resize handle
    */
  var onDoubleClick: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /**
    * A callback that is called when the user is done dragging the resize
    * handle.
    *
    * @param offset is the difference between the initial and final coordinates
    */
  var onResizeEnd: js.UndefOr[js.Function1[/* offset */ scala.Double, scala.Unit]] = js.native
  /**
    * A callback that is called while the user is dragging the resize
    * handle.
    *
    * @param offset is the difference between the initial and current coordinates
    * @param delta is the difference between this and the previous offset
    */
  var onResizeMove: js.UndefOr[js.Function2[/* offset */ scala.Double, /* delta */ scala.Double, scala.Unit]] = js.native
  /**
    * An enum value to indicate the orientation of the resize handle.
    */
  var orientation: Orientation = js.native
}

