package typings.azdata.mod

import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object window {
  
  @js.native
  sealed trait MessageLevel extends StObject
  @JSImport("azdata", "window.MessageLevel")
  @js.native
  object MessageLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageLevel with Double] = js.native
    
    @js.native
    sealed trait Error extends MessageLevel
    /* 0 */ val Error: typings.azdata.mod.window.MessageLevel.Error with Double = js.native
    
    @js.native
    sealed trait Information extends MessageLevel
    /* 2 */ val Information: typings.azdata.mod.window.MessageLevel.Information with Double = js.native
    
    @js.native
    sealed trait Warning extends MessageLevel
    /* 1 */ val Warning: typings.azdata.mod.window.MessageLevel.Warning with Double = js.native
  }
  
  @JSImport("azdata", "window.closeDialog")
  @js.native
  def closeDialog(dialog: Dialog): Unit = js.native
  
  @JSImport("azdata", "window.createButton")
  @js.native
  def createButton(label: String): Button = js.native
  @JSImport("azdata", "window.createButton")
  @js.native
  def createButton(label: String, position: DialogButtonPosition): Button = js.native
  
  @JSImport("azdata", "window.createModelViewDialog")
  @js.native
  def createModelViewDialog(title: String): Dialog = js.native
  @JSImport("azdata", "window.createModelViewDialog")
  @js.native
  def createModelViewDialog(title: String, dialogName: js.UndefOr[scala.Nothing], isWide: Boolean): Dialog = js.native
  @JSImport("azdata", "window.createModelViewDialog")
  @js.native
  def createModelViewDialog(title: String, dialogName: String): Dialog = js.native
  @JSImport("azdata", "window.createModelViewDialog")
  @js.native
  def createModelViewDialog(title: String, dialogName: String, isWide: Boolean): Dialog = js.native
  
  @JSImport("azdata", "window.createTab")
  @js.native
  def createTab(title: String): DialogTab = js.native
  
  @JSImport("azdata", "window.createWebViewDialog")
  @js.native
  def createWebViewDialog(title: String): ModalDialog = js.native
  
  @JSImport("azdata", "window.createWizard")
  @js.native
  def createWizard(title: String): Wizard = js.native
  
  @JSImport("azdata", "window.createWizardPage")
  @js.native
  def createWizardPage(title: String): WizardPage = js.native
  
  @JSImport("azdata", "window.openDialog")
  @js.native
  def openDialog(dialog: Dialog): Unit = js.native
  
  @js.native
  trait Button extends StObject {
    
    /**
      * Whether the button is enabled
      */
    var enabled: Boolean = js.native
    
    /**
      * Whether the button is focused
      */
    var focused: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the button is hidden
      */
    var hidden: Boolean = js.native
    
    /**
      * The label displayed on the button
      */
    var label: String = js.native
    
    /**
      * Raised when the button is clicked
      */
    def onClick(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
    def onClick(
      listener: js.Function1[/* e */ Unit, _],
      thisArgs: js.UndefOr[scala.Nothing],
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onClick(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
    def onClick(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
    
    /**
      * Position of the button on the dialog footer
      */
    var position: js.UndefOr[DialogButtonPosition] = js.native
  }
  
  @js.native
  trait Dialog extends ModelViewPanel {
    
    /**
      * The cancel button
      */
    var cancelButton: Button = js.native
    
    /**
      * The content of the dialog. If multiple tabs are given they will be displayed with tabs
      * If a string is given, it should be the ID of the dialog's model view content
      */
    var content: String | js.Array[DialogTab] = js.native
    
    /**
      * Any additional buttons that should be displayed
      */
    var customButtons: js.Array[Button] = js.native
    
    /**
      * Set the dialog name when opening
      * the dialog for telemetry
      */
    var dialogName: js.UndefOr[String] = js.native
    
    /**
      * Indicates the width of the dialog
      */
    var isWide: Boolean = js.native
    
    /**
      * Set the informational message shown in the dialog. Hidden when the message is
      * undefined or the text is empty or undefined. The default level is error.
      */
    var message: DialogMessage = js.native
    
    /**
      * The ok button
      */
    var okButton: Button = js.native
    
    /**
      * Register a callback that will be called when the user tries to click done. Only
      * one callback can be registered at once, so each registration call will clear
      * the previous registration.
      * @param validator The callback that gets executed when the user tries to click
      * done. Return true to allow the dialog to close or false to block it from closing
      */
    def registerCloseValidator(validator: js.Function0[Boolean | Thenable[Boolean]]): Unit = js.native
    
    /**
      * Register an operation to run in the background when the dialog is done
      * @param operationInfo Operation Information
      */
    def registerOperation(operationInfo: BackgroundOperationInfo): Unit = js.native
    
    /**
      * The title of the dialog
      */
    var title: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azdata.azdataStrings.left
    - typings.azdata.azdataStrings.right
  */
  trait DialogButtonPosition extends StObject
  object DialogButtonPosition {
    
    @scala.inline
    def left: typings.azdata.azdataStrings.left = "left".asInstanceOf[typings.azdata.azdataStrings.left]
    
    @scala.inline
    def right: typings.azdata.azdataStrings.right = "right".asInstanceOf[typings.azdata.azdataStrings.right]
  }
  
  @js.native
  trait DialogMessage extends StObject {
    
    val description: js.UndefOr[String] = js.native
    
    val level: js.UndefOr[MessageLevel] = js.native
    
    val text: String = js.native
  }
  object DialogMessage {
    
    @scala.inline
    def apply(text: String): DialogMessage = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogMessage]
    }
    
    @scala.inline
    implicit class DialogMessageMutableBuilder[Self <: DialogMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLevel(value: MessageLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DialogTab extends ModelViewPanel {
    
    /**
      * A string giving the ID of the tab's model view content
      */
    var content: String = js.native
    
    /**
      * The title of the tab
      */
    var title: String = js.native
  }
  
  @js.native
  trait ModelViewPanel extends StObject {
    
    /**
      * Returns the model view content if registered. Returns undefined if model review is not registered
      */
    val modelView: ModelView = js.native
    
    /**
      * Fired whenever the panel's valid property changes
      */
    def onValidityChanged(listener: js.Function1[/* e */ Boolean, _]): Disposable = js.native
    def onValidityChanged(
      listener: js.Function1[/* e */ Boolean, _],
      thisArgs: js.UndefOr[scala.Nothing],
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onValidityChanged(listener: js.Function1[/* e */ Boolean, _], thisArgs: js.Any): Disposable = js.native
    def onValidityChanged(listener: js.Function1[/* e */ Boolean, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
    
    /**
      * Register model view content for the dialog.
      * Doesn't do anything if model view is already registered
      */
    def registerContent(handler: js.Function1[/* view */ ModelView, Thenable[Unit]]): Unit = js.native
    
    /**
      * Whether the panel's content is valid
      */
    val valid: Boolean = js.native
  }
  
  @js.native
  trait Wizard extends StObject {
    
    /**
      * Add a page to the wizard at the given index
      * @param page The page to add
      * @param index The index in the pages array to add the page at, or undefined to
      * add it at the end
      */
    def addPage(page: WizardPage): Thenable[Unit] = js.native
    def addPage(page: WizardPage, index: Double): Thenable[Unit] = js.native
    
    /**
      * The back button
      */
    var backButton: Button = js.native
    
    /**
      * The cancel button
      */
    var cancelButton: Button = js.native
    
    /**
      * Close the wizard. Does nothing if the wizard is not open.
      */
    def close(): Thenable[Unit] = js.native
    
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
      * Event fired when the wizard's page changes, containing information about the
      * previous page and the new page
      */
    @JSName("onPageChanged")
    var onPageChanged_Original: Event[WizardPageChangeInfo] = js.native
    
    /**
      * Open the wizard. Does nothing if the wizard is already open.
      */
    def open(): Thenable[Unit] = js.native
    
    /**
      * The wizard's pages. Pages can be added/removed while the dialog is open by using
      * the addPage and removePage methods
      */
    var pages: js.Array[WizardPage] = js.native
    
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
    
    /**
      * The title of the wizard
      */
    var title: String = js.native
  }
  
  @js.native
  trait WizardPage extends ModelViewPanel {
    
    /**
      * A string giving the ID of the page's model view content
      */
    var content: String = js.native
    
    /**
      * Any additional buttons that should be displayed while the page is open
      */
    var customButtons: js.Array[Button] = js.native
    
    /**
      * An optional description for the page. If provided it will be displayed underneath the page title.
      */
    var description: String = js.native
    
    /**
      * Whether the page is enabled. If the page is not enabled, the user will not be
      * able to advance to it. Defaults to true.
      */
    var enabled: Boolean = js.native
    
    /**
      * The title of the page
      */
    var title: String = js.native
  }
  
  @js.native
  trait WizardPageChangeInfo extends StObject {
    
    /**
      * The page number that the wizard changed from
      */
    var lastPage: Double = js.native
    
    /**
      * The new page number or undefined if the user is closing the wizard
      */
    var newPage: Double = js.native
  }
  object WizardPageChangeInfo {
    
    @scala.inline
    def apply(lastPage: Double, newPage: Double): WizardPageChangeInfo = {
      val __obj = js.Dynamic.literal(lastPage = lastPage.asInstanceOf[js.Any], newPage = newPage.asInstanceOf[js.Any])
      __obj.asInstanceOf[WizardPageChangeInfo]
    }
    
    @scala.inline
    implicit class WizardPageChangeInfoMutableBuilder[Self <: WizardPageChangeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastPage(value: Double): Self = StObject.set(x, "lastPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewPage(value: Double): Self = StObject.set(x, "newPage", value.asInstanceOf[js.Any])
    }
  }
}
