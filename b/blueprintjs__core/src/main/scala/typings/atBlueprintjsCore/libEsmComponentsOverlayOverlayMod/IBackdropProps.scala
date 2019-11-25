package typings.atBlueprintjsCore.libEsmComponentsOverlayOverlayMod

import typings.react.reactMod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackdropProps extends js.Object {
  /** CSS class names to apply to backdrop element. */
  var backdropClassName: js.UndefOr[String] = js.undefined
  /** HTML props for the backdrop element. */
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
  /**
    * Whether clicking outside the overlay element (either on backdrop when present or on document)
    * should invoke `onClose`.
    * @default true
    */
  var canOutsideClickClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether a container-spanning backdrop element should be rendered behind the contents.
    * @default true
    */
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
}

object IBackdropProps {
  @scala.inline
  def apply(
    backdropClassName: String = null,
    backdropProps: HTMLProps[HTMLDivElement] = null,
    canOutsideClickClose: js.UndefOr[Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[Boolean] = js.undefined
  ): IBackdropProps = {
    val __obj = js.Dynamic.literal()
    if (backdropClassName != null) __obj.updateDynamic("backdropClassName")(backdropClassName.asInstanceOf[js.Any])
    if (backdropProps != null) __obj.updateDynamic("backdropProps")(backdropProps.asInstanceOf[js.Any])
    if (!js.isUndefined(canOutsideClickClose)) __obj.updateDynamic("canOutsideClickClose")(canOutsideClickClose.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackdropProps]
  }
}

