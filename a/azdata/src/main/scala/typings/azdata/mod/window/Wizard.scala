package typings.azdata.mod.window

import typings.azdata.mod.BackgroundOperationInfo
import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wizard extends js.Object {
  /**
    * The back button
    */
  var backButton: Button = js.native
  /**
    * The cancel button
    */
  var cancelButton: Button = js.native
  /**
    * The index in the pages array of the active page, or undefined if the wizard is
    * not currently visible
    */
  val currentPage: Double = js.native
  /**
    * Any additional buttons that should be displayed for all pages of the dialog. If
    * buttons are needed for specific pages they can be added using the customButtons
    * property on each page.
    */
  var customButtons: js.Array[Button] = js.native
  /**
    * When set to false page titles and descriptions will not be displayed at the top
    * of each wizard page. The default is true.
    */
  var displayPageTitles: Boolean = js.native
  /**
    * The done button
    */
  var doneButton: Button = js.native
  /**
    * The generate script button
    */
  var generateScriptButton: Button = js.native
  /**
    * Set the informational message shown in the wizard. Hidden when the message is
    * undefined or the text is empty or undefined. The default level is error.
    */
  var message: DialogMessage = js.native
  /**
    * The next button
    */
  var nextButton: Button = js.native
  /**
    * Event fired when the wizard's page changes, containing information about the
    * previous page and the new page
    */
  @JSName("onPageChanged")
  var onPageChanged_Original: Event[WizardPageChangeInfo] = js.native
  /**
    * The wizard's pages. Pages can be added/removed while the dialog is open by using
    * the addPage and removePage methods
    */
  var pages: js.Array[WizardPage] = js.native
  /**
    * The title of the wizard
    */
  var title: String = js.native
  /**
    * Add a page to the wizard at the given index
    * @param page The page to add
    * @param index The index in the pages array to add the page at, or undefined to
    * add it at the end
    */
  def addPage(page: WizardPage): Thenable[Unit] = js.native
  def addPage(page: WizardPage, index: Double): Thenable[Unit] = js.native
  /**
    * Close the wizard. Does nothing if the wizard is not open.
    */
  def close(): Thenable[Unit] = js.native
  /**
    * Event fired when the wizard's page changes, containing information about the
    * previous page and the new page
    */
  def onPageChanged(listener: js.Function1[/* e */ WizardPageChangeInfo, _]): Disposable = js.native
  def onPageChanged(
    listener: js.Function1[/* e */ WizardPageChangeInfo, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onPageChanged(listener: js.Function1[/* e */ WizardPageChangeInfo, _], thisArgs: js.Any): Disposable = js.native
  def onPageChanged(
    listener: js.Function1[/* e */ WizardPageChangeInfo, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /**
    * Open the wizard. Does nothing if the wizard is already open.
    */
  def open(): Thenable[Unit] = js.native
  /**
    * Register a callback that will be called when the user tries to navigate by
    * changing pages or clicking done. Only one callback can be registered at once, so
    * each registration call will clear the previous registration.
    * @param validator The callback that gets executed when the user tries to
    * navigate. Return true to allow the navigation to proceed, or false to
    * cancel it.
    */
  def registerNavigationValidator(validator: js.Function1[/* pageChangeInfo */ WizardPageChangeInfo, Boolean | Thenable[Boolean]]): Unit = js.native
  /**
    * Register an operation to run in the background when the wizard is done
    * @param operationInfo Operation Information
    */
  def registerOperation(operationInfo: BackgroundOperationInfo): Unit = js.native
  /**
    * Remove the page at the given index from the wizard
    * @param index The index in the pages array to remove
    */
  def removePage(index: Double): Thenable[Unit] = js.native
  /**
    * Go to the page at the given index in the pages array.
    * @param index The index of the page to go to
    */
  def setCurrentPage(index: Double): Thenable[Unit] = js.native
}

