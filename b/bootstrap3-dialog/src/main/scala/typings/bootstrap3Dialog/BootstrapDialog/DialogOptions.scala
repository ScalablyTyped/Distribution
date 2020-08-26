package typings.bootstrap3Dialog.BootstrapDialog

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogOptions extends js.Object {
  /** Whether fade-out background while showing the dialog. TRUE by default. */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * When it's true, all modal stuff will be removed from the DOM tree after the dialog is popped down,
    * set it to false if you need your dialog (same instance) pups up and down again and again.
    * Default is true.
    */
  var autodestroy: js.UndefOr[Boolean] = js.native
  /** 'Cancel' by default. */
  var btnCancelLabel: js.UndefOr[String] = js.native
  /** If you didn't specify it, dialog type will be used. */
  var btnOKClass: js.UndefOr[String] = js.native
  /** 'OK' by default. */
  var btnOKLabel: js.UndefOr[String] = js.native
  /** Default button title. OK by default. */
  var buttonLabel: js.UndefOr[String] = js.native
  var buttons: js.UndefOr[js.Array[DialogButton]] = js.native
  /** Result will be true if button was click, while it will be false if users close the dialog directly. */
  var callback: js.UndefOr[js.Function1[/* result */ Boolean, Unit]] = js.native
  /**
    * When set to true, you can close the dialog by:
    *  - Clicking the close icon in dialog header.
    *  - Clicking outside the dialog.
    *  - ESC key.
    *
    * FALSE by default.
    */
  var closable: js.UndefOr[Boolean] = js.native
  /** Whether dialog will close by clicking outside of it. */
  var closeByBackdrop: js.UndefOr[Boolean] = js.native
  /** Whether dialog will close by ESC. */
  var closeByKeyboard: js.UndefOr[Boolean] = js.native
  /** Additional css classes that will be added to your dialog. */
  var cssClass: js.UndefOr[String] = js.native
  /** Data to be bound to the dialog. */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * If provided, 'aria-describedby' attribute will be added to the dialog with the description string as its value. This can improve accessibility, as the description can be read by screen
    * readers.
    */
  var description: js.UndefOr[String] = js.native
  /** Whether dialog could be dragged by its header. Cursor could be changed (see doc)! FALSE by default. */
  var draggable: js.UndefOr[Boolean] = js.native
  /** Dialog message. Either string, JQuery element, or function that returns either string or JQuery element. */
  var message: js.UndefOr[
    String | JQuery[HTMLElement] | (js.Function1[/* dialog */ js.UndefOr[DialogContext], String | JQuery[HTMLElement]])
  ] = js.native
  /**
    * Automatically convert line breaking character to <br /> if it's set to true,
    * everything keeps original if it's false.
    */
  var nl2br: js.UndefOr[Boolean] = js.native
  /** If provided, it will be invoked when the dialog is popped down. */
  var onhidden: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Unit]] = js.native
  /**
    * If provided, it will be invoked when the dialog is popping down.
    * Return FALSE to don`t close the dialog. Don`t return anything by default.
    */
  var onhide: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], _]] = js.native
  /** If provided, it will be invoked when the dialog is popping up. */
  var onshow: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Unit]] = js.native
  /** If provided, it will be invoked when the dialog is popped up. */
  var onshown: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Unit]] = js.native
  /** Text size. See BootstrapDialog.SIZE_xxx constants. By default - SIZE_NORMAL */
  var size: js.UndefOr[String] = js.native
  /** Icon class name, for example 'glyphicon glyphicon-check'. */
  var spinicon: js.UndefOr[String] = js.native
  /** Dialog title. Either string or JQuery element. */
  var title: js.UndefOr[String | JQuery[HTMLElement]] = js.native
  /** Dialog header type. See BootstrapDialog.TYPE_xxx constants. */
  var `type`: js.UndefOr[String] = js.native
}

object DialogOptions {
  @scala.inline
  def apply(): DialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogOptions]
  }
  @scala.inline
  implicit class DialogOptionsOps[Self <: DialogOptions] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAutodestroy(value: Boolean): Self = this.set("autodestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutodestroy: Self = this.set("autodestroy", js.undefined)
    @scala.inline
    def setBtnCancelLabel(value: String): Self = this.set("btnCancelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBtnCancelLabel: Self = this.set("btnCancelLabel", js.undefined)
    @scala.inline
    def setBtnOKClass(value: String): Self = this.set("btnOKClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBtnOKClass: Self = this.set("btnOKClass", js.undefined)
    @scala.inline
    def setBtnOKLabel(value: String): Self = this.set("btnOKLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBtnOKLabel: Self = this.set("btnOKLabel", js.undefined)
    @scala.inline
    def setButtonLabel(value: String): Self = this.set("buttonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonLabel: Self = this.set("buttonLabel", js.undefined)
    @scala.inline
    def setButtonsVarargs(value: DialogButton*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[DialogButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCallback(value: /* result */ Boolean => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setCloseByBackdrop(value: Boolean): Self = this.set("closeByBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseByBackdrop: Self = this.set("closeByBackdrop", js.undefined)
    @scala.inline
    def setCloseByKeyboard(value: Boolean): Self = this.set("closeByKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseByKeyboard: Self = this.set("closeByKeyboard", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setMessageFunction1(value: /* dialog */ js.UndefOr[DialogContext] => String | JQuery[HTMLElement]): Self = this.set("message", js.Any.fromFunction1(value))
    @scala.inline
    def setMessage(
      value: String | JQuery[HTMLElement] | (js.Function1[/* dialog */ js.UndefOr[DialogContext], String | JQuery[HTMLElement]])
    ): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setNl2br(value: Boolean): Self = this.set("nl2br", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNl2br: Self = this.set("nl2br", js.undefined)
    @scala.inline
    def setOnhidden(value: /* dialog */ js.UndefOr[DialogContext] => Unit): Self = this.set("onhidden", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnhidden: Self = this.set("onhidden", js.undefined)
    @scala.inline
    def setOnhide(value: /* dialog */ js.UndefOr[DialogContext] => _): Self = this.set("onhide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnhide: Self = this.set("onhide", js.undefined)
    @scala.inline
    def setOnshow(value: /* dialog */ js.UndefOr[DialogContext] => Unit): Self = this.set("onshow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnshow: Self = this.set("onshow", js.undefined)
    @scala.inline
    def setOnshown(value: /* dialog */ js.UndefOr[DialogContext] => Unit): Self = this.set("onshown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnshown: Self = this.set("onshown", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpinicon(value: String): Self = this.set("spinicon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinicon: Self = this.set("spinicon", js.undefined)
    @scala.inline
    def setTitle(value: String | JQuery[HTMLElement]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

