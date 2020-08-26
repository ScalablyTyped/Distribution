package typings.bootstrap3Dialog.BootstrapDialog

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogContext extends js.Object {
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
  implicit class DialogContextOps[Self <: DialogContext] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setEnableButtons(value: Boolean => Unit): Self = this.set("enableButtons", js.Any.fromFunction1(value))
    @scala.inline
    def setGetButton(value: String => JQuery[HTMLElement]): Self = this.set("getButton", js.Any.fromFunction1(value))
    @scala.inline
    def setGetData(value: String => js.Any): Self = this.set("getData", js.Any.fromFunction1(value))
    @scala.inline
    def setGetModal(value: () => JQuery[HTMLElement]): Self = this.set("getModal", js.Any.fromFunction0(value))
    @scala.inline
    def setGetModalBody(value: () => JQuery[HTMLElement]): Self = this.set("getModalBody", js.Any.fromFunction0(value))
    @scala.inline
    def setGetModalContent(value: () => JQuery[HTMLElement]): Self = this.set("getModalContent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetModalDialog(value: () => JQuery[HTMLElement]): Self = this.set("getModalDialog", js.Any.fromFunction0(value))
    @scala.inline
    def setGetModalFooter(value: () => JQuery[HTMLElement]): Self = this.set("getModalFooter", js.Any.fromFunction0(value))
    @scala.inline
    def setGetModalHeader(value: () => JQuery[HTMLElement]): Self = this.set("getModalHeader", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def setRealize(value: () => Unit): Self = this.set("realize", js.Any.fromFunction0(value))
    @scala.inline
    def setSetClosable(value: Boolean => Unit): Self = this.set("setClosable", js.Any.fromFunction1(value))
    @scala.inline
    def setSetData(value: (String, js.Any) => Unit): Self = this.set("setData", js.Any.fromFunction2(value))
    @scala.inline
    def setSetMessage(value: String => Unit): Self = this.set("setMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: String => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetType(value: String => Unit): Self = this.set("setType", js.Any.fromFunction1(value))
  }
  
}

