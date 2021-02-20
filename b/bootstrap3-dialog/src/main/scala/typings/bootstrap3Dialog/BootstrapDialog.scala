package typings.bootstrap3Dialog

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BootstrapDialog {
  
  @js.native
  trait DialogButton extends StObject {
    
    /**
      * If provided, the callback will be invoked after the button is clicked, and the dialog instance
      * will be passed to the callback function.
      */
    var action: js.UndefOr[js.Function1[/* dialog */ DialogContext, Unit]] = js.native
    
    /**  If it's true, after clicked the button a spinning icon appears. */
    var autospin: js.UndefOr[Boolean] = js.native
    
    /** Additional css class to be added to the button. */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Object containing data attributes to be added to the button. */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Hotkey char code */
    var hotkey: js.UndefOr[Double] = js.native
    
    /** If set, the specified icon will be added to the button. */
    var icon: js.UndefOr[String] = js.native
    
    /** If id is set, you can use dialogInstance.getButton(id) to get the button later. */
    var id: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
  }
  object DialogButton {
    
    @scala.inline
    def apply(): DialogButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogButton]
    }
    
    @scala.inline
    implicit class DialogButtonMutableBuilder[Self <: DialogButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: /* dialog */ DialogContext => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAutospin(value: Boolean): Self = StObject.set(x, "autospin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutospinUndefined: Self = StObject.set(x, "autospin", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHotkey(value: Double): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotkeyUndefined: Self = StObject.set(x, "hotkey", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  @js.native
  trait DialogButtonInstance extends StObject {
    
    /** Equals to $button.toggleEnable(false); */
    def disable(): Unit = js.native
    
    /** Equals to $button.toggleEnable(true); */
    def enable(): Unit = js.native
    
    /** Equals to $button.toggleSpin(true); */
    def spin(): Unit = js.native
    
    /** Equals to $button.toggleSpin(false); */
    def stopSpin(): Unit = js.native
    
    def toggleEnable(enabled: Boolean): Unit = js.native
    
    def toggleSpin(spin: Boolean): Unit = js.native
  }
  object DialogButtonInstance {
    
    @scala.inline
    def apply(
      disable: () => Unit,
      enable: () => Unit,
      spin: () => Unit,
      stopSpin: () => Unit,
      toggleEnable: Boolean => Unit,
      toggleSpin: Boolean => Unit
    ): DialogButtonInstance = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), spin = js.Any.fromFunction0(spin), stopSpin = js.Any.fromFunction0(stopSpin), toggleEnable = js.Any.fromFunction1(toggleEnable), toggleSpin = js.Any.fromFunction1(toggleSpin))
      __obj.asInstanceOf[DialogButtonInstance]
    }
    
    @scala.inline
    implicit class DialogButtonInstanceMutableBuilder[Self <: DialogButtonInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSpin(value: () => Unit): Self = StObject.set(x, "spin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopSpin(value: () => Unit): Self = StObject.set(x, "stopSpin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggleEnable(value: Boolean => Unit): Self = StObject.set(x, "toggleEnable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleSpin(value: Boolean => Unit): Self = StObject.set(x, "toggleSpin", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DialogContext extends StObject {
    
    /**      Close the dialog. Usage: dialogInstance.close() */
    def close(): Unit = js.native
    
    /** Disable all buttons in dialog footer when it's false, enable all when it's true. */
    def enableButtons(enable: Boolean): Unit = js.native
    
    def getButton(buttonId: String): JQuery[HTMLElement] = js.native
    
    /** Get data entry according to the given key, returns null if no data entry found. */
    def getData(dataName: String): js.Any = js.native
    
    /** Return the raw modal, equivalent to $('<div class='modal fade'...></div>') */
    def getModal(): JQuery[HTMLElement] = js.native
    
    /** Return the raw modal body. */
    def getModalBody(): JQuery[HTMLElement] = js.native
    
    /** Return the raw modal content. */
    def getModalContent(): JQuery[HTMLElement] = js.native
    
    /** Return the raw modal dialog. */
    def getModalDialog(): JQuery[HTMLElement] = js.native
    
    /** Return the raw modal footer. */
    def getModalFooter(): JQuery[HTMLElement] = js.native
    
    /** Return the raw modal header. */
    def getModalHeader(): JQuery[HTMLElement] = js.native
    
    def getTitle(): String = js.native
    
    /** Open the dialog. Usage: dialogInstance.open() */
    def open(): Unit = js.native
    
    /**
      * Calling dialog.open() will automatically get this method called first, but if you want to do something on your dialog
      * before it's shown, you can manually call dialog.realize() before calling dialog.open().
      */
    def realize(): Unit = js.native
    
    /**
      * When set to true (default), dialog can be closed by clicking close icon in dialog header,
      * or by clicking outside the dialog, or, ESC key is pressed.
      */
    def setClosable(closable: Boolean): Unit = js.native
    
    /** Bind data entry to dialog instance, value can be any types that javascript supports. */
    def setData(dataName: String, value: js.Any): Unit = js.native
    
    def setMessage(message: String): Unit = js.native
    
    def setTitle(title: String): Unit = js.native
    
    /** See BootstrapDialog.TYPE_xxx constants. */
    def setType(dialogType: String): Unit = js.native
  }
  object DialogContext {
    
    @scala.inline
    def apply(
      close: () => Unit,
      enableButtons: Boolean => Unit,
      getButton: String => JQuery[HTMLElement],
      getData: String => js.Any,
      getModal: () => JQuery[HTMLElement],
      getModalBody: () => JQuery[HTMLElement],
      getModalContent: () => JQuery[HTMLElement],
      getModalDialog: () => JQuery[HTMLElement],
      getModalFooter: () => JQuery[HTMLElement],
      getModalHeader: () => JQuery[HTMLElement],
      getTitle: () => String,
      open: () => Unit,
      realize: () => Unit,
      setClosable: Boolean => Unit,
      setData: (String, js.Any) => Unit,
      setMessage: String => Unit,
      setTitle: String => Unit,
      setType: String => Unit
    ): DialogContext = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), enableButtons = js.Any.fromFunction1(enableButtons), getButton = js.Any.fromFunction1(getButton), getData = js.Any.fromFunction1(getData), getModal = js.Any.fromFunction0(getModal), getModalBody = js.Any.fromFunction0(getModalBody), getModalContent = js.Any.fromFunction0(getModalContent), getModalDialog = js.Any.fromFunction0(getModalDialog), getModalFooter = js.Any.fromFunction0(getModalFooter), getModalHeader = js.Any.fromFunction0(getModalHeader), getTitle = js.Any.fromFunction0(getTitle), open = js.Any.fromFunction0(open), realize = js.Any.fromFunction0(realize), setClosable = js.Any.fromFunction1(setClosable), setData = js.Any.fromFunction2(setData), setMessage = js.Any.fromFunction1(setMessage), setTitle = js.Any.fromFunction1(setTitle), setType = js.Any.fromFunction1(setType))
      __obj.asInstanceOf[DialogContext]
    }
    
    @scala.inline
    implicit class DialogContextMutableBuilder[Self <: DialogContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableButtons(value: Boolean => Unit): Self = StObject.set(x, "enableButtons", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetButton(value: String => JQuery[HTMLElement]): Self = StObject.set(x, "getButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetData(value: String => js.Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetModal(value: () => JQuery[HTMLElement]): Self = StObject.set(x, "getModal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetModalBody(value: () => JQuery[HTMLElement]): Self = StObject.set(x, "getModalBody", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetModalContent(value: () => JQuery[HTMLElement]): Self = StObject.set(x, "getModalContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetModalDialog(value: () => JQuery[HTMLElement]): Self = StObject.set(x, "getModalDialog", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetModalFooter(value: () => JQuery[HTMLElement]): Self = StObject.set(x, "getModalFooter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetModalHeader(value: () => JQuery[HTMLElement]): Self = StObject.set(x, "getModalHeader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRealize(value: () => Unit): Self = StObject.set(x, "realize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetClosable(value: Boolean => Unit): Self = StObject.set(x, "setClosable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetData(value: (String, js.Any) => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetMessage(value: String => Unit): Self = StObject.set(x, "setMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetType(value: String => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DialogInstance extends StObject {
    
    @JSName("$modal")
    var $modal: JQuery[HTMLElement] = js.native
    
    @JSName("$modalBody")
    var $modalBody: JQuery[HTMLElement] = js.native
    
    @JSName("$modalContent")
    var $modalContent: JQuery[HTMLElement] = js.native
    
    @JSName("$modalDialog")
    var $modalDialog: JQuery[HTMLElement] = js.native
    
    @JSName("$modalFooter")
    var $modalFooter: JQuery[HTMLElement] = js.native
    
    @JSName("$modalHeader")
    var $modalHeader: JQuery[HTMLElement] = js.native
    
    var opened: Boolean = js.native
    
    var options: DialogOptions = js.native
  }
  object DialogInstance {
    
    @scala.inline
    def apply(
      $modal: JQuery[HTMLElement],
      $modalBody: JQuery[HTMLElement],
      $modalContent: JQuery[HTMLElement],
      $modalDialog: JQuery[HTMLElement],
      $modalFooter: JQuery[HTMLElement],
      $modalHeader: JQuery[HTMLElement],
      opened: Boolean,
      options: DialogOptions
    ): DialogInstance = {
      val __obj = js.Dynamic.literal($modal = $modal.asInstanceOf[js.Any], $modalBody = $modalBody.asInstanceOf[js.Any], $modalContent = $modalContent.asInstanceOf[js.Any], $modalDialog = $modalDialog.asInstanceOf[js.Any], $modalFooter = $modalFooter.asInstanceOf[js.Any], $modalHeader = $modalHeader.asInstanceOf[js.Any], opened = opened.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogInstance]
    }
    
    @scala.inline
    implicit class DialogInstanceMutableBuilder[Self <: DialogInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$modal(value: JQuery[HTMLElement]): Self = StObject.set(x, "$modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$modalBody(value: JQuery[HTMLElement]): Self = StObject.set(x, "$modalBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$modalContent(value: JQuery[HTMLElement]): Self = StObject.set(x, "$modalContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$modalDialog(value: JQuery[HTMLElement]): Self = StObject.set(x, "$modalDialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$modalFooter(value: JQuery[HTMLElement]): Self = StObject.set(x, "$modalFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$modalHeader(value: JQuery[HTMLElement]): Self = StObject.set(x, "$modalHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: DialogOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DialogOptions extends StObject {
    
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
    implicit class DialogOptionsMutableBuilder[Self <: DialogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setAutodestroy(value: Boolean): Self = StObject.set(x, "autodestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutodestroyUndefined: Self = StObject.set(x, "autodestroy", js.undefined)
      
      @scala.inline
      def setBtnCancelLabel(value: String): Self = StObject.set(x, "btnCancelLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnCancelLabelUndefined: Self = StObject.set(x, "btnCancelLabel", js.undefined)
      
      @scala.inline
      def setBtnOKClass(value: String): Self = StObject.set(x, "btnOKClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnOKClassUndefined: Self = StObject.set(x, "btnOKClass", js.undefined)
      
      @scala.inline
      def setBtnOKLabel(value: String): Self = StObject.set(x, "btnOKLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnOKLabelUndefined: Self = StObject.set(x, "btnOKLabel", js.undefined)
      
      @scala.inline
      def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonLabelUndefined: Self = StObject.set(x, "buttonLabel", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Array[DialogButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: DialogButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setCallback(value: /* result */ Boolean => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseByBackdrop(value: Boolean): Self = StObject.set(x, "closeByBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseByBackdropUndefined: Self = StObject.set(x, "closeByBackdrop", js.undefined)
      
      @scala.inline
      def setCloseByKeyboard(value: Boolean): Self = StObject.set(x, "closeByKeyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseByKeyboardUndefined: Self = StObject.set(x, "closeByKeyboard", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setMessage(
        value: String | JQuery[HTMLElement] | (js.Function1[/* dialog */ js.UndefOr[DialogContext], String | JQuery[HTMLElement]])
      ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageFunction1(value: /* dialog */ js.UndefOr[DialogContext] => String | JQuery[HTMLElement]): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setNl2br(value: Boolean): Self = StObject.set(x, "nl2br", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNl2brUndefined: Self = StObject.set(x, "nl2br", js.undefined)
      
      @scala.inline
      def setOnhidden(value: /* dialog */ js.UndefOr[DialogContext] => Unit): Self = StObject.set(x, "onhidden", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnhiddenUndefined: Self = StObject.set(x, "onhidden", js.undefined)
      
      @scala.inline
      def setOnhide(value: /* dialog */ js.UndefOr[DialogContext] => _): Self = StObject.set(x, "onhide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnhideUndefined: Self = StObject.set(x, "onhide", js.undefined)
      
      @scala.inline
      def setOnshow(value: /* dialog */ js.UndefOr[DialogContext] => Unit): Self = StObject.set(x, "onshow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnshowUndefined: Self = StObject.set(x, "onshow", js.undefined)
      
      @scala.inline
      def setOnshown(value: /* dialog */ js.UndefOr[DialogContext] => Unit): Self = StObject.set(x, "onshown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnshownUndefined: Self = StObject.set(x, "onshown", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSpinicon(value: String): Self = StObject.set(x, "spinicon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpiniconUndefined: Self = StObject.set(x, "spinicon", js.undefined)
      
      @scala.inline
      def setTitle(value: String | JQuery[HTMLElement]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DialogStatic extends StObject {
    
    def apply(options: DialogOptions): DialogContext = js.native
    
    var BUTTONS_ORDER_CANCEL_OK: String = js.native
    
    var BUTTONS_ORDER_OK_CANCEL: String = js.native
    
    var BUTTON_SIZES: js.Any = js.native
    
    var DEFAULT_TEXTS: js.Any = js.native
    
    /** For text localization. */
    var ICON_SPINNER: String = js.native
    
    var NAMESPACE: String = js.native
    
    var SIZE_LARGE: String = js.native
    
    var SIZE_NORMAL: String = js.native
    
    var SIZE_SMALL: String = js.native
    
    var SIZE_WIDE: String = js.native
    
    var TYPE_DANGER: String = js.native
    
    var TYPE_DEFAULT: String = js.native
    
    var TYPE_INFO: String = js.native
    
    var TYPE_PRIMARY: String = js.native
    
    var TYPE_SUCCESS: String = js.native
    
    var TYPE_WARNING: String = js.native
    
    def alert(message: String): Unit = js.native
    def alert(message: String, closeCallback: js.Function0[Unit]): Unit = js.native
    
    def confirm(message: String): Unit = js.native
    def confirm(message: String, closeCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
    
    def show(options: DialogOptions): DialogInstance = js.native
  }
}
