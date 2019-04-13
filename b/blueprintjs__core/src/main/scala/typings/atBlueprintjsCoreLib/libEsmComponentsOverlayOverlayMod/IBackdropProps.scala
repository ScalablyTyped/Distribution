package typings
package atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackdropProps extends js.Object {
  /** CSS class names to apply to backdrop element. */
  var backdropClassName: js.UndefOr[java.lang.String] = js.undefined
  /** HTML props for the backdrop element. */
  var backdropProps: js.UndefOr[reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement]] = js.undefined
  /**
    * Whether clicking outside the overlay element (either on backdrop when present or on document)
    * should invoke `onClose`.
    * @default true
    */
  var canOutsideClickClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether a container-spanning backdrop element should be rendered behind the contents.
    * @default true
    */
  var hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined
}

object IBackdropProps {
  @scala.inline
  def apply(
    backdropClassName: java.lang.String = null,
    backdropProps: reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement] = null,
    canOutsideClickClose: js.UndefOr[scala.Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  ): IBackdropProps = {
    val __obj = js.Dynamic.literal()
    if (backdropClassName != null) __obj.updateDynamic("backdropClassName")(backdropClassName)
    if (backdropProps != null) __obj.updateDynamic("backdropProps")(backdropProps)
    if (!js.isUndefined(canOutsideClickClose)) __obj.updateDynamic("canOutsideClickClose")(canOutsideClickClose)
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop)
    __obj.asInstanceOf[IBackdropProps]
  }
}

