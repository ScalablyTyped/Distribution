package typings
package confirmdialogLib.optionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait confirmOptions extends js.Object {
  var autoClose: js.UndefOr[java.lang.String] = js.undefined
  var backgroundDismiss: js.UndefOr[js.Any] = js.undefined
  var backgroundDismissAnimation: js.UndefOr[java.lang.String] = js.undefined
  var bootstrapClasses: js.UndefOr[js.Any] = js.undefined
  var boxWidth: js.UndefOr[java.lang.String] = js.undefined
  var buttons: js.UndefOr[js.Any] = js.undefined
  var closeIcon: js.UndefOr[js.Any] = js.undefined
  var closeIconClass: js.UndefOr[java.lang.String] = js.undefined
  var columnClass: js.UndefOr[java.lang.String] = js.undefined
  var containerFluid: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[js.Any] = js.undefined
  var contentLoaded: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var dragWindowBorder: js.UndefOr[scala.Boolean] = js.undefined
  var dragWindowGap: js.UndefOr[scala.Double] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var escapeKey: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var lazyOpen: js.UndefOr[scala.Boolean] = js.undefined
  var onAction: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onContentReady: js.UndefOr[js.Any] = js.undefined
  var onDestroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpenBefore: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var title: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var typeAnimated: js.UndefOr[scala.Boolean] = js.undefined
  var useBootstrap: js.UndefOr[scala.Boolean] = js.undefined
}

object confirmOptions {
  @scala.inline
  def apply(
    autoClose: java.lang.String = null,
    backgroundDismiss: js.Any = null,
    backgroundDismissAnimation: java.lang.String = null,
    bootstrapClasses: js.Any = null,
    boxWidth: java.lang.String = null,
    buttons: js.Any = null,
    closeIcon: js.Any = null,
    closeIconClass: java.lang.String = null,
    columnClass: java.lang.String = null,
    containerFluid: js.UndefOr[scala.Boolean] = js.undefined,
    content: js.Any = null,
    contentLoaded: () => scala.Unit = null,
    dragWindowBorder: js.UndefOr[scala.Boolean] = js.undefined,
    dragWindowGap: scala.Int | scala.Double = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    escapeKey: java.lang.String | scala.Boolean = null,
    icon: java.lang.String = null,
    lazyOpen: js.UndefOr[scala.Boolean] = js.undefined,
    onAction: () => scala.Unit = null,
    onClose: () => scala.Unit = null,
    onContentReady: js.Any = null,
    onDestroy: () => scala.Unit = null,
    onOpen: () => scala.Unit = null,
    onOpenBefore: () => scala.Unit = null,
    title: java.lang.String | scala.Boolean = null,
    `type`: java.lang.String = null,
    typeAnimated: js.UndefOr[scala.Boolean] = js.undefined,
    useBootstrap: js.UndefOr[scala.Boolean] = js.undefined
  ): confirmOptions = {
    val __obj = js.Dynamic.literal()
    if (autoClose != null) __obj.updateDynamic("autoClose")(autoClose)
    if (backgroundDismiss != null) __obj.updateDynamic("backgroundDismiss")(backgroundDismiss)
    if (backgroundDismissAnimation != null) __obj.updateDynamic("backgroundDismissAnimation")(backgroundDismissAnimation)
    if (bootstrapClasses != null) __obj.updateDynamic("bootstrapClasses")(bootstrapClasses)
    if (boxWidth != null) __obj.updateDynamic("boxWidth")(boxWidth)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon)
    if (closeIconClass != null) __obj.updateDynamic("closeIconClass")(closeIconClass)
    if (columnClass != null) __obj.updateDynamic("columnClass")(columnClass)
    if (!js.isUndefined(containerFluid)) __obj.updateDynamic("containerFluid")(containerFluid)
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentLoaded != null) __obj.updateDynamic("contentLoaded")(js.Any.fromFunction0(contentLoaded))
    if (!js.isUndefined(dragWindowBorder)) __obj.updateDynamic("dragWindowBorder")(dragWindowBorder)
    if (dragWindowGap != null) __obj.updateDynamic("dragWindowGap")(dragWindowGap.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (escapeKey != null) __obj.updateDynamic("escapeKey")(escapeKey.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(lazyOpen)) __obj.updateDynamic("lazyOpen")(lazyOpen)
    if (onAction != null) __obj.updateDynamic("onAction")(js.Any.fromFunction0(onAction))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(onContentReady)
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction0(onDestroy))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (onOpenBefore != null) __obj.updateDynamic("onOpenBefore")(js.Any.fromFunction0(onOpenBefore))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(typeAnimated)) __obj.updateDynamic("typeAnimated")(typeAnimated)
    if (!js.isUndefined(useBootstrap)) __obj.updateDynamic("useBootstrap")(useBootstrap)
    __obj.asInstanceOf[confirmOptions]
  }
}

