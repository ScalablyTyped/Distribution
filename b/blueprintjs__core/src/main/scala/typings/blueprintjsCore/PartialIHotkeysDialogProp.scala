package typings.blueprintjsCore

import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/hotkeys/hotkeysDialog.IHotkeysDialogProps> */
trait PartialIHotkeysDialogProp extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var backdropClassName: js.UndefOr[String] = js.undefined
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined
  var canOutsideClickClose: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var enforceFocus: js.UndefOr[Boolean] = js.undefined
  var globalHotkeysGroup: js.UndefOr[String] = js.undefined
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  var isCloseButtonShown: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event_]], Unit]] = js.undefined
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var portalClassName: js.UndefOr[String] = js.undefined
  var portalContainer: js.UndefOr[HTMLElement] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var usePortal: js.UndefOr[Boolean] = js.undefined
}

object PartialIHotkeysDialogProp {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backdropClassName: String = null,
    backdropProps: HTMLProps[HTMLDivElement] = null,
    canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined,
    canOutsideClickClose: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    enforceFocus: js.UndefOr[Boolean] = js.undefined,
    globalHotkeysGroup: String = null,
    hasBackdrop: js.UndefOr[Boolean] = js.undefined,
    icon: IconName | MaybeElement = null,
    isCloseButtonShown: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    onClose: /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event_]] => Unit = null,
    onClosed: /* node */ HTMLElement => Unit = null,
    onClosing: /* node */ HTMLElement => Unit = null,
    onOpened: /* node */ HTMLElement => Unit = null,
    onOpening: /* node */ HTMLElement => Unit = null,
    portalClassName: String = null,
    portalContainer: HTMLElement = null,
    style: CSSProperties = null,
    title: ReactNode = null,
    transitionDuration: Int | Double = null,
    transitionName: String = null,
    usePortal: js.UndefOr[Boolean] = js.undefined
  ): PartialIHotkeysDialogProp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (backdropClassName != null) __obj.updateDynamic("backdropClassName")(backdropClassName.asInstanceOf[js.Any])
    if (backdropProps != null) __obj.updateDynamic("backdropProps")(backdropProps.asInstanceOf[js.Any])
    if (!js.isUndefined(canEscapeKeyClose)) __obj.updateDynamic("canEscapeKeyClose")(canEscapeKeyClose.asInstanceOf[js.Any])
    if (!js.isUndefined(canOutsideClickClose)) __obj.updateDynamic("canOutsideClickClose")(canOutsideClickClose.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus.asInstanceOf[js.Any])
    if (globalHotkeysGroup != null) __obj.updateDynamic("globalHotkeysGroup")(globalHotkeysGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isCloseButtonShown)) __obj.updateDynamic("isCloseButtonShown")(isCloseButtonShown.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1(onClosed))
    if (onClosing != null) __obj.updateDynamic("onClosing")(js.Any.fromFunction1(onClosing))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1(onOpened))
    if (onOpening != null) __obj.updateDynamic("onOpening")(js.Any.fromFunction1(onOpening))
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName.asInstanceOf[js.Any])
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIHotkeysDialogProp]
  }
}

