package typings
package bootstrap3DashDialogLib.BootstrapDialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DialogOptions extends js.Object {
  /** Whether fade-out background while showing the dialog. TRUE by default. */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When it's true, all modal stuff will be removed from the DOM tree after the dialog is popped down,
           * set it to false if you need your dialog (same instance) pups up and down again and again.
           * Default is true.
           */
  var autodestroy: js.UndefOr[scala.Boolean] = js.undefined
  /** 'Cancel' by default. */
  var btnCancelLabel: js.UndefOr[java.lang.String] = js.undefined
  /** If you didn't specify it, dialog type will be used. */
  var btnOKClass: js.UndefOr[java.lang.String] = js.undefined
  /** 'OK' by default. */
  var btnOKLabel: js.UndefOr[java.lang.String] = js.undefined
  /** Default button title. OK by default. */
  var buttonLabel: js.UndefOr[java.lang.String] = js.undefined
  var buttons: js.UndefOr[js.Array[DialogButton]] = js.undefined
  /** Result will be true if button was click, while it will be false if users close the dialog directly. */
  var callback: js.UndefOr[js.Function1[/* result */ scala.Boolean, scala.Unit]] = js.undefined
  /**
           * When set to true, you can close the dialog by:
           *  - Clicking the close icon in dialog header.
           *  - Clicking outside the dialog.
           *  - ESC key.
           *
           * FALSE by default.
           */
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether dialog will close by clicking outside of it. */
  var closeByBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether dialog will close by ESC. */
  var closeByKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  /** Additional css classes that will be added to your dialog. */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Data to be bound to the dialog. */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
           * If provided, 'aria-describedby' attribute will be added to the dialog with the description string as its value. This can improve accessibility, as the description can be read by screen
           * readers.
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Whether dialog could be dragged by its header. Cursor could be changed (see doc)! FALSE by default. */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /** Dialog message. Either string, JQuery element, or function that returns either string or JQuery element. */
  var message: js.UndefOr[
    java.lang.String | jqueryLib.JQuery[stdLib.HTMLElement] | (js.Function1[
      /* dialog */ js.UndefOr[DialogContext], 
      java.lang.String | jqueryLib.JQuery[stdLib.HTMLElement]
    ])
  ] = js.undefined
  /**
           * Automatically convert line breaking character to <br /> if it's set to true,
           * everything keeps original if it's false.
           */
  var nl2br: js.UndefOr[scala.Boolean] = js.undefined
  /** If provided, it will be invoked when the dialog is popped down. */
  var onhidden: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], scala.Unit]] = js.undefined
  /**
           * If provided, it will be invoked when the dialog is popping down.
           * Return FALSE to don`t close the dialog. Don`t return anything by default.
           */
  var onhide: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], _]] = js.undefined
  /** If provided, it will be invoked when the dialog is popping up. */
  var onshow: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], scala.Unit]] = js.undefined
  /** If provided, it will be invoked when the dialog is popped up. */
  var onshown: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], scala.Unit]] = js.undefined
  /** Text size. See BootstrapDialog.SIZE_xxx constants. By default - SIZE_NORMAL */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /** Icon class name, for example 'glyphicon glyphicon-check'. */
  var spinicon: js.UndefOr[java.lang.String] = js.undefined
  /** Dialog title. Either string or JQuery element. */
  var title: js.UndefOr[java.lang.String | jqueryLib.JQuery[stdLib.HTMLElement]] = js.undefined
  /** Dialog header type. See BootstrapDialog.TYPE_xxx constants. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

