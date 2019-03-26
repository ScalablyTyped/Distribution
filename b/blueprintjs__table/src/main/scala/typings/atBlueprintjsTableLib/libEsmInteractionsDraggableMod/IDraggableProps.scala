package typings
package atBlueprintjsTableLib.libEsmInteractionsDraggableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDraggableProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps
     with IDragHandler

object IDraggableProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    onActivate: /* event */ stdLib.MouseEvent => scala.Boolean = null,
    onClick: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onDoubleClick: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onDragEnd: (/* event */ stdLib.MouseEvent, /* coords */ ICoordinateData) => scala.Unit = null,
    onDragMove: (/* event */ stdLib.MouseEvent, /* coords */ ICoordinateData) => scala.Unit = null,
    preventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
  ): IDraggableProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1(onActivate))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2(onDragEnd))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction2(onDragMove))
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault)
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.asInstanceOf[IDraggableProps]
  }
}

