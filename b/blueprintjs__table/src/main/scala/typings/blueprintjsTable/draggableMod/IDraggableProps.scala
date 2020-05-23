package typings.blueprintjsTable.draggableMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.dragTypesMod.IDragHandler
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDraggableProps
  extends IProps
     with IDragHandler

object IDraggableProps {
  @scala.inline
  def apply(
    className: String = null,
    onActivate: /* event */ MouseEvent => Boolean = null,
    onClick: /* event */ MouseEvent => Unit = null,
    onDoubleClick: /* event */ MouseEvent => Unit = null,
    onDragEnd: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Unit = null,
    onDragMove: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Unit = null,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: js.UndefOr[Boolean] = js.undefined
  ): IDraggableProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1(onActivate))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2(onDragEnd))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction2(onDragMove))
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDraggableProps]
  }
}

