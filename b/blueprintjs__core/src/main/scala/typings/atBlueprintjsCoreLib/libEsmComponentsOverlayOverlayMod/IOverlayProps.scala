package typings
package atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayProps
  extends IOverlayableProps
     with IBackdropProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Toggles the visibility of the overlay and its children.
    * This prop is required because the component is controlled.
    */
  var isOpen: scala.Boolean
  /**
    * Name of the transition for internal `CSSTransition`.
    * Providing your own name here will require defining new CSS transition properties.
    * @default Classes.OVERLAY
    */
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
}

object IOverlayProps {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backdropClassName: java.lang.String = null,
    backdropProps: reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLDivElement] = null,
    canEscapeKeyClose: js.UndefOr[scala.Boolean] = js.undefined,
    canOutsideClickClose: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    enforceFocus: js.UndefOr[scala.Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: js.Function1[
      /* event */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]], 
      scala.Unit
    ] = null,
    onClosed: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onClosing: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onOpened: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onOpening: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    portalClassName: java.lang.String = null,
    portalContainer: reactLib.HTMLElement = null,
    transitionDuration: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null,
    usePortal: js.UndefOr[scala.Boolean] = js.undefined
  ): IOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (backdropClassName != null) __obj.updateDynamic("backdropClassName")(backdropClassName)
    if (backdropProps != null) __obj.updateDynamic("backdropProps")(backdropProps)
    if (!js.isUndefined(canEscapeKeyClose)) __obj.updateDynamic("canEscapeKeyClose")(canEscapeKeyClose)
    if (!js.isUndefined(canOutsideClickClose)) __obj.updateDynamic("canOutsideClickClose")(canOutsideClickClose)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus)
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onClosed != null) __obj.updateDynamic("onClosed")(onClosed)
    if (onClosing != null) __obj.updateDynamic("onClosing")(onClosing)
    if (onOpened != null) __obj.updateDynamic("onOpened")(onOpened)
    if (onOpening != null) __obj.updateDynamic("onOpening")(onOpening)
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName)
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal)
    __obj.asInstanceOf[IOverlayProps]
  }
}

