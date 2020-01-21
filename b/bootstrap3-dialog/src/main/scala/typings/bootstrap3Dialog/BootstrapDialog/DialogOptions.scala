package typings.bootstrap3Dialog.BootstrapDialog

import typings.jquery.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogOptions extends js.Object {
  /** Whether fade-out background while showing the dialog. TRUE by default. */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * When it's true, all modal stuff will be removed from the DOM tree after the dialog is popped down,
    * set it to false if you need your dialog (same instance) pups up and down again and again.
    * Default is true.
    */
  var autodestroy: js.UndefOr[Boolean] = js.undefined
  /** 'Cancel' by default. */
  var btnCancelLabel: js.UndefOr[String] = js.undefined
  /** If you didn't specify it, dialog type will be used. */
  var btnOKClass: js.UndefOr[String] = js.undefined
  /** 'OK' by default. */
  var btnOKLabel: js.UndefOr[String] = js.undefined
  /** Default button title. OK by default. */
  var buttonLabel: js.UndefOr[String] = js.undefined
  var buttons: js.UndefOr[js.Array[DialogButton]] = js.undefined
  /** Result will be true if button was click, while it will be false if users close the dialog directly. */
  var callback: js.UndefOr[js.Function1[/* result */ Boolean, Unit]] = js.undefined
  /**
    * When set to true, you can close the dialog by:
    *  - Clicking the close icon in dialog header.
    *  - Clicking outside the dialog.
    *  - ESC key.
    *
    * FALSE by default.
    */
  var closable: js.UndefOr[Boolean] = js.undefined
  /** Whether dialog will close by clicking outside of it. */
  var closeByBackdrop: js.UndefOr[Boolean] = js.undefined
  /** Whether dialog will close by ESC. */
  var closeByKeyboard: js.UndefOr[Boolean] = js.undefined
  /** Additional css classes that will be added to your dialog. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Data to be bound to the dialog. */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * If provided, 'aria-describedby' attribute will be added to the dialog with the description string as its value. This can improve accessibility, as the description can be read by screen
    * readers.
    */
  var description: js.UndefOr[String] = js.undefined
  /** Whether dialog could be dragged by its header. Cursor could be changed (see doc)! FALSE by default. */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /** Dialog message. Either string, JQuery element, or function that returns either string or JQuery element. */
  var message: js.UndefOr[
    String | JQuery_[HTMLElement] | (js.Function1[/* dialog */ js.UndefOr[DialogContext], String | JQuery_[HTMLElement]])
  ] = js.undefined
  /**
    * Automatically convert line breaking character to <br /> if it's set to true,
    * everything keeps original if it's false.
    */
  var nl2br: js.UndefOr[Boolean] = js.undefined
  /** If provided, it will be invoked when the dialog is popped down. */
  var onhidden: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Unit]] = js.undefined
  /**
    * If provided, it will be invoked when the dialog is popping down.
    * Return FALSE to don`t close the dialog. Don`t return anything by default.
    */
  var onhide: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], _]] = js.undefined
  /** If provided, it will be invoked when the dialog is popping up. */
  var onshow: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Unit]] = js.undefined
  /** If provided, it will be invoked when the dialog is popped up. */
  var onshown: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Unit]] = js.undefined
  /** Text size. See BootstrapDialog.SIZE_xxx constants. By default - SIZE_NORMAL */
  var size: js.UndefOr[String] = js.undefined
  /** Icon class name, for example 'glyphicon glyphicon-check'. */
  var spinicon: js.UndefOr[String] = js.undefined
  /** Dialog title. Either string or JQuery element. */
  var title: js.UndefOr[String | JQuery_[HTMLElement]] = js.undefined
  /** Dialog header type. See BootstrapDialog.TYPE_xxx constants. */
  var `type`: js.UndefOr[String] = js.undefined
}

object DialogOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    autodestroy: js.UndefOr[Boolean] = js.undefined,
    btnCancelLabel: String = null,
    btnOKClass: String = null,
    btnOKLabel: String = null,
    buttonLabel: String = null,
    buttons: js.Array[DialogButton] = null,
    callback: /* result */ Boolean => Unit = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeByBackdrop: js.UndefOr[Boolean] = js.undefined,
    closeByKeyboard: js.UndefOr[Boolean] = js.undefined,
    cssClass: String = null,
    data: js.Any = null,
    description: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    message: String | JQuery_[HTMLElement] | (js.Function1[/* dialog */ js.UndefOr[DialogContext], String | JQuery_[HTMLElement]]) = null,
    nl2br: js.UndefOr[Boolean] = js.undefined,
    onhidden: /* dialog */ js.UndefOr[DialogContext] => Unit = null,
    onhide: /* dialog */ js.UndefOr[DialogContext] => _ = null,
    onshow: /* dialog */ js.UndefOr[DialogContext] => Unit = null,
    onshown: /* dialog */ js.UndefOr[DialogContext] => Unit = null,
    size: String = null,
    spinicon: String = null,
    title: String | JQuery_[HTMLElement] = null,
    `type`: String = null
  ): DialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(autodestroy)) __obj.updateDynamic("autodestroy")(autodestroy.asInstanceOf[js.Any])
    if (btnCancelLabel != null) __obj.updateDynamic("btnCancelLabel")(btnCancelLabel.asInstanceOf[js.Any])
    if (btnOKClass != null) __obj.updateDynamic("btnOKClass")(btnOKClass.asInstanceOf[js.Any])
    if (btnOKLabel != null) __obj.updateDynamic("btnOKLabel")(btnOKLabel.asInstanceOf[js.Any])
    if (buttonLabel != null) __obj.updateDynamic("buttonLabel")(buttonLabel.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (!js.isUndefined(closeByBackdrop)) __obj.updateDynamic("closeByBackdrop")(closeByBackdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(closeByKeyboard)) __obj.updateDynamic("closeByKeyboard")(closeByKeyboard.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(nl2br)) __obj.updateDynamic("nl2br")(nl2br.asInstanceOf[js.Any])
    if (onhidden != null) __obj.updateDynamic("onhidden")(js.Any.fromFunction1(onhidden))
    if (onhide != null) __obj.updateDynamic("onhide")(js.Any.fromFunction1(onhide))
    if (onshow != null) __obj.updateDynamic("onshow")(js.Any.fromFunction1(onshow))
    if (onshown != null) __obj.updateDynamic("onshown")(js.Any.fromFunction1(onshown))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spinicon != null) __obj.updateDynamic("spinicon")(spinicon.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogOptions]
  }
}

