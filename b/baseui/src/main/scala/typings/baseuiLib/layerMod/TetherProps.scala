package typings
package baseuiLib.layerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TetherProps extends js.Object {
  var anchorRef: js.UndefOr[reactLib.reactMod.Ref[stdLib.HTMLElement]] = js.undefined
  var arrowRef: js.UndefOr[reactLib.reactMod.Ref[stdLib.HTMLElement]] = js.undefined
  var children: reactLib.reactMod.ReactNode
  var onPopperUpdate: js.UndefOr[js.Function2[/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject, _]] = js.undefined
  var placement: js.UndefOr[
    baseuiLib.baseuiLibStrings.rightTop | baseuiLib.baseuiLibStrings.auto | baseuiLib.baseuiLibStrings.leftBottom | baseuiLib.baseuiLibStrings.bottomRight | baseuiLib.baseuiLibStrings.leftTop | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.left | baseuiLib.baseuiLibStrings.topRight | baseuiLib.baseuiLibStrings.bottomLeft | baseuiLib.baseuiLibStrings.rightBottom | baseuiLib.baseuiLibStrings.topLeft | baseuiLib.baseuiLibStrings.top | baseuiLib.baseuiLibStrings.right
  ] = js.undefined
  var popperOptions: js.UndefOr[js.Any] = js.undefined
  var popperRef: js.UndefOr[reactLib.reactMod.Ref[stdLib.HTMLElement]] = js.undefined
}

object TetherProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    anchorRef: reactLib.reactMod.Ref[stdLib.HTMLElement] = null,
    arrowRef: reactLib.reactMod.Ref[stdLib.HTMLElement] = null,
    onPopperUpdate: (/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject) => _ = null,
    placement: baseuiLib.baseuiLibStrings.rightTop | baseuiLib.baseuiLibStrings.auto | baseuiLib.baseuiLibStrings.leftBottom | baseuiLib.baseuiLibStrings.bottomRight | baseuiLib.baseuiLibStrings.leftTop | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.left | baseuiLib.baseuiLibStrings.topRight | baseuiLib.baseuiLibStrings.bottomLeft | baseuiLib.baseuiLibStrings.rightBottom | baseuiLib.baseuiLibStrings.topLeft | baseuiLib.baseuiLibStrings.top | baseuiLib.baseuiLibStrings.right = null,
    popperOptions: js.Any = null,
    popperRef: reactLib.reactMod.Ref[stdLib.HTMLElement] = null
  ): TetherProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (anchorRef != null) __obj.updateDynamic("anchorRef")(anchorRef.asInstanceOf[js.Any])
    if (arrowRef != null) __obj.updateDynamic("arrowRef")(arrowRef.asInstanceOf[js.Any])
    if (onPopperUpdate != null) __obj.updateDynamic("onPopperUpdate")(js.Any.fromFunction2(onPopperUpdate))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions)
    if (popperRef != null) __obj.updateDynamic("popperRef")(popperRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetherProps]
  }
}

