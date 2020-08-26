package typings.confirmdialog.options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait confirmOptions extends js.Object {
  var autoClose: js.UndefOr[String] = js.native
  var backgroundDismiss: js.UndefOr[js.Any] = js.native
  var backgroundDismissAnimation: js.UndefOr[String] = js.native
  var bootstrapClasses: js.UndefOr[js.Any] = js.native
  var boxWidth: js.UndefOr[String] = js.native
  var buttons: js.UndefOr[js.Any] = js.native
  var closeIcon: js.UndefOr[js.Any] = js.native
  var closeIconClass: js.UndefOr[String] = js.native
  var columnClass: js.UndefOr[String] = js.native
  var containerFluid: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[js.Any] = js.native
  var contentLoaded: js.UndefOr[js.Function0[Unit]] = js.native
  var dragWindowBorder: js.UndefOr[Boolean] = js.native
  var dragWindowGap: js.UndefOr[Double] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var escapeKey: js.UndefOr[String | Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var lazyOpen: js.UndefOr[Boolean] = js.native
  var onAction: js.UndefOr[js.Function0[Unit]] = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onContentReady: js.UndefOr[js.Any] = js.native
  var onDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var onOpenBefore: js.UndefOr[js.Function0[Unit]] = js.native
  var title: js.UndefOr[String | Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var typeAnimated: js.UndefOr[Boolean] = js.native
  var useBootstrap: js.UndefOr[Boolean] = js.native
}

object confirmOptions {
  @scala.inline
  def apply(): confirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[confirmOptions]
  }
  @scala.inline
  implicit class confirmOptionsOps[Self <: confirmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoClose(value: String): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    @scala.inline
    def setBackgroundDismiss(value: js.Any): Self = this.set("backgroundDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundDismiss: Self = this.set("backgroundDismiss", js.undefined)
    @scala.inline
    def setBackgroundDismissAnimation(value: String): Self = this.set("backgroundDismissAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundDismissAnimation: Self = this.set("backgroundDismissAnimation", js.undefined)
    @scala.inline
    def setBootstrapClasses(value: js.Any): Self = this.set("bootstrapClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootstrapClasses: Self = this.set("bootstrapClasses", js.undefined)
    @scala.inline
    def setBoxWidth(value: String): Self = this.set("boxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxWidth: Self = this.set("boxWidth", js.undefined)
    @scala.inline
    def setButtons(value: js.Any): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCloseIcon(value: js.Any): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    @scala.inline
    def setCloseIconClass(value: String): Self = this.set("closeIconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseIconClass: Self = this.set("closeIconClass", js.undefined)
    @scala.inline
    def setColumnClass(value: String): Self = this.set("columnClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnClass: Self = this.set("columnClass", js.undefined)
    @scala.inline
    def setContainerFluid(value: Boolean): Self = this.set("containerFluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerFluid: Self = this.set("containerFluid", js.undefined)
    @scala.inline
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentLoaded(value: () => Unit): Self = this.set("contentLoaded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteContentLoaded: Self = this.set("contentLoaded", js.undefined)
    @scala.inline
    def setDragWindowBorder(value: Boolean): Self = this.set("dragWindowBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragWindowBorder: Self = this.set("dragWindowBorder", js.undefined)
    @scala.inline
    def setDragWindowGap(value: Double): Self = this.set("dragWindowGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragWindowGap: Self = this.set("dragWindowGap", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEscapeKey(value: String | Boolean): Self = this.set("escapeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscapeKey: Self = this.set("escapeKey", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLazyOpen(value: Boolean): Self = this.set("lazyOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyOpen: Self = this.set("lazyOpen", js.undefined)
    @scala.inline
    def setOnAction(value: () => Unit): Self = this.set("onAction", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAction: Self = this.set("onAction", js.undefined)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnContentReady(value: js.Any): Self = this.set("onContentReady", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnContentReady: Self = this.set("onContentReady", js.undefined)
    @scala.inline
    def setOnDestroy(value: () => Unit): Self = this.set("onDestroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDestroy: Self = this.set("onDestroy", js.undefined)
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setOnOpenBefore(value: () => Unit): Self = this.set("onOpenBefore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnOpenBefore: Self = this.set("onOpenBefore", js.undefined)
    @scala.inline
    def setTitle(value: String | Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeAnimated(value: Boolean): Self = this.set("typeAnimated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAnimated: Self = this.set("typeAnimated", js.undefined)
    @scala.inline
    def setUseBootstrap(value: Boolean): Self = this.set("useBootstrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBootstrap: Self = this.set("useBootstrap", js.undefined)
  }
  
}

