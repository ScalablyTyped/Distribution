package typings.confirmdialog.optionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait confirmOptions extends js.Object {
  var autoClose: js.UndefOr[String] = js.undefined
  var backgroundDismiss: js.UndefOr[js.Any] = js.undefined
  var backgroundDismissAnimation: js.UndefOr[String] = js.undefined
  var bootstrapClasses: js.UndefOr[js.Any] = js.undefined
  var boxWidth: js.UndefOr[String] = js.undefined
  var buttons: js.UndefOr[js.Any] = js.undefined
  var closeIcon: js.UndefOr[js.Any] = js.undefined
  var closeIconClass: js.UndefOr[String] = js.undefined
  var columnClass: js.UndefOr[String] = js.undefined
  var containerFluid: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[js.Any] = js.undefined
  var contentLoaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  var dragWindowBorder: js.UndefOr[Boolean] = js.undefined
  var dragWindowGap: js.UndefOr[Double] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var escapeKey: js.UndefOr[String | Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var lazyOpen: js.UndefOr[Boolean] = js.undefined
  var onAction: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onContentReady: js.UndefOr[js.Any] = js.undefined
  var onDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpenBefore: js.UndefOr[js.Function0[Unit]] = js.undefined
  var title: js.UndefOr[String | Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var typeAnimated: js.UndefOr[Boolean] = js.undefined
  var useBootstrap: js.UndefOr[Boolean] = js.undefined
}

object confirmOptions {
  @scala.inline
  def apply(
    autoClose: String = null,
    backgroundDismiss: js.Any = null,
    backgroundDismissAnimation: String = null,
    bootstrapClasses: js.Any = null,
    boxWidth: String = null,
    buttons: js.Any = null,
    closeIcon: js.Any = null,
    closeIconClass: String = null,
    columnClass: String = null,
    containerFluid: js.UndefOr[Boolean] = js.undefined,
    content: js.Any = null,
    contentLoaded: () => Unit = null,
    dragWindowBorder: js.UndefOr[Boolean] = js.undefined,
    dragWindowGap: Int | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    escapeKey: String | Boolean = null,
    icon: String = null,
    lazyOpen: js.UndefOr[Boolean] = js.undefined,
    onAction: () => Unit = null,
    onClose: () => Unit = null,
    onContentReady: js.Any = null,
    onDestroy: () => Unit = null,
    onOpen: () => Unit = null,
    onOpenBefore: () => Unit = null,
    title: String | Boolean = null,
    `type`: String = null,
    typeAnimated: js.UndefOr[Boolean] = js.undefined,
    useBootstrap: js.UndefOr[Boolean] = js.undefined
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

