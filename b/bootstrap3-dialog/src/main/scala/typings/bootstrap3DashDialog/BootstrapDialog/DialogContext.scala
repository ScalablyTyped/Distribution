package typings.bootstrap3DashDialog.BootstrapDialog

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContext extends js.Object {
  /**  	Close the dialog. Usage: dialogInstance.close() */
  def close(): Unit
  /** Disable all buttons in dialog footer when it's false, enable all when it's true. */
  def enableButtons(enable: Boolean): Unit
  def getButton(buttonId: String): JQuery[HTMLElement]
  /** Get data entry according to the given key, returns null if no data entry found. */
  def getData(dataName: String): js.Any
  /** Return the raw modal, equivalent to $('<div class='modal fade'...></div>') */
  def getModal(): JQuery[HTMLElement]
  /** Return the raw modal body. */
  def getModalBody(): JQuery[HTMLElement]
  /** Return the raw modal content. */
  def getModalContent(): JQuery[HTMLElement]
  /** Return the raw modal dialog. */
  def getModalDialog(): JQuery[HTMLElement]
  /** Return the raw modal footer. */
  def getModalFooter(): JQuery[HTMLElement]
  /** Return the raw modal header. */
  def getModalHeader(): JQuery[HTMLElement]
  def getTitle(): String
  /** Open the dialog. Usage: dialogInstance.open() */
  def open(): Unit
  /**
    * Calling dialog.open() will automatically get this method called first, but if you want to do something on your dialog
    * before it's shown, you can manually call dialog.realize() before calling dialog.open().
    */
  def realize(): Unit
  /**
    * When set to true (default), dialog can be closed by clicking close icon in dialog header,
    * or by clicking outside the dialog, or, ESC key is pressed.
    */
  def setClosable(closable: Boolean): Unit
  /** Bind data entry to dialog instance, value can be any types that javascript supports. */
  def setData(dataName: String, value: js.Any): Unit
  def setMessage(message: String): Unit
  def setTitle(title: String): Unit
  /** See BootstrapDialog.TYPE_xxx constants. */
  def setType(dialogType: String): Unit
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
}

