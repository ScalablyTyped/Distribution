package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotkeysDialogProps
  extends atBlueprintjsCoreLib.libEsmComponentsDialogDialogMod.IDialogProps {
  /**
    * This string displayed as the group name in the hotkeys dialog for all
    * global hotkeys.
    */
  var globalHotkeysGroup: js.UndefOr[java.lang.String] = js.undefined
}

object IHotkeysDialogProps {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backdropClassName: java.lang.String = null,
    backdropProps: reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement] = null,
    canEscapeKeyClose: js.UndefOr[scala.Boolean] = js.undefined,
    canOutsideClickClose: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    enforceFocus: js.UndefOr[scala.Boolean] = js.undefined,
    globalHotkeysGroup: java.lang.String = null,
    hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    icon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement = null,
    isCloseButtonShown: js.UndefOr[scala.Boolean] = js.undefined,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: /* event */ js.UndefOr[reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event]] => scala.Unit = null,
    onClosed: /* node */ stdLib.HTMLElement => scala.Unit = null,
    onClosing: /* node */ stdLib.HTMLElement => scala.Unit = null,
    onOpened: /* node */ stdLib.HTMLElement => scala.Unit = null,
    onOpening: /* node */ stdLib.HTMLElement => scala.Unit = null,
    portalClassName: java.lang.String = null,
    portalContainer: stdLib.HTMLElement = null,
    style: reactLib.reactMod.CSSProperties = null,
    title: reactLib.reactMod.ReactNode = null,
    transitionDuration: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null,
    usePortal: js.UndefOr[scala.Boolean] = js.undefined
  ): IHotkeysDialogProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (backdropClassName != null) __obj.updateDynamic("backdropClassName")(backdropClassName)
    if (backdropProps != null) __obj.updateDynamic("backdropProps")(backdropProps)
    if (!js.isUndefined(canEscapeKeyClose)) __obj.updateDynamic("canEscapeKeyClose")(canEscapeKeyClose)
    if (!js.isUndefined(canOutsideClickClose)) __obj.updateDynamic("canOutsideClickClose")(canOutsideClickClose)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus)
    if (globalHotkeysGroup != null) __obj.updateDynamic("globalHotkeysGroup")(globalHotkeysGroup)
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isCloseButtonShown)) __obj.updateDynamic("isCloseButtonShown")(isCloseButtonShown)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1(onClosed))
    if (onClosing != null) __obj.updateDynamic("onClosing")(js.Any.fromFunction1(onClosing))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1(onOpened))
    if (onOpening != null) __obj.updateDynamic("onOpening")(js.Any.fromFunction1(onOpening))
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName)
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal)
    __obj.asInstanceOf[IHotkeysDialogProps]
  }
}

