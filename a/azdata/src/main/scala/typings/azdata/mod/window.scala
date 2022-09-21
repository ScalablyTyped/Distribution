package typings.azdata.mod

import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object window {
  
  @JSImport("azdata", "window")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait MessageLevel extends StObject
  @JSImport("azdata", "window.MessageLevel")
  @js.native
  object MessageLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageLevel & Double] = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with MessageLevel
    /* 0 */ val Error: typings.azdata.mod.window.MessageLevel.Error & Double = js.native
    
    @js.native
    sealed trait Information
      extends StObject
         with MessageLevel
    /* 2 */ val Information: typings.azdata.mod.window.MessageLevel.Information & Double = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with MessageLevel
    /* 1 */ val Warning: typings.azdata.mod.window.MessageLevel.Warning & Double = js.native
  }
  
  inline def closeDialog(dialog: Dialog): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDialog")(dialog.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createButton(label: String): Button = ^.asInstanceOf[js.Dynamic].applyDynamic("createButton")(label.asInstanceOf[js.Any]).asInstanceOf[Button]
  inline def createButton(label: String, position: DialogButtonPosition): Button = (^.asInstanceOf[js.Dynamic].applyDynamic("createButton")(label.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Button]
  
  inline def createModelViewDashboard(title: String): ModelViewDashboard = ^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewDashboard")(title.asInstanceOf[js.Any]).asInstanceOf[ModelViewDashboard]
  inline def createModelViewDashboard(title: String, name: String): ModelViewDashboard = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewDashboard")(title.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ModelViewDashboard]
  inline def createModelViewDashboard(title: String, name: String, options: ModelViewDashboardOptions): ModelViewDashboard = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewDashboard")(title.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ModelViewDashboard]
  inline def createModelViewDashboard(title: String, name: Unit, options: ModelViewDashboardOptions): ModelViewDashboard = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewDashboard")(title.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ModelViewDashboard]
  
  inline def createModelViewDialog(title: String): Dialog = ^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewDialog")(title.asInstanceOf[js.Any]).asInstanceOf[Dialog]
  inline def createModelViewDialog(
    title: String,
    dialogName: js.UndefOr[String],
    width: js.UndefOr[DialogWidth],
    dialogStyle: js.UndefOr[DialogStyle],
    dialogPosition: js.UndefOr[DialogPosition],
    renderHeader: js.UndefOr[Boolean],
    renderFooter: js.UndefOr[Boolean],
    dialogProperties: js.UndefOr[IDialogProperties]
  ): Dialog = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewDialog")(title.asInstanceOf[js.Any], dialogName.asInstanceOf[js.Any], width.asInstanceOf[js.Any], dialogStyle.asInstanceOf[js.Any], dialogPosition.asInstanceOf[js.Any], renderHeader.asInstanceOf[js.Any], renderFooter.asInstanceOf[js.Any], dialogProperties.asInstanceOf[js.Any])).asInstanceOf[Dialog]
  inline def createModelViewDialog(title: String, dialogName: String): Dialog = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewDialog")(title.asInstanceOf[js.Any], dialogName.asInstanceOf[js.Any])).asInstanceOf[Dialog]
  inline def createModelViewDialog(title: String, dialogName: String, isWide: Boolean): Dialog = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewDialog")(title.asInstanceOf[js.Any], dialogName.asInstanceOf[js.Any], isWide.asInstanceOf[js.Any])).asInstanceOf[Dialog]
  inline def createModelViewDialog(title: String, dialogName: String, width: DialogWidth): Dialog = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewDialog")(title.asInstanceOf[js.Any], dialogName.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Dialog]
  inline def createModelViewDialog(title: String, dialogName: Unit, isWide: Boolean): Dialog = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewDialog")(title.asInstanceOf[js.Any], dialogName.asInstanceOf[js.Any], isWide.asInstanceOf[js.Any])).asInstanceOf[Dialog]
  inline def createModelViewDialog(title: String, dialogName: Unit, width: DialogWidth): Dialog = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewDialog")(title.asInstanceOf[js.Any], dialogName.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Dialog]
  
  inline def createTab(title: String): DialogTab = ^.asInstanceOf[js.Dynamic].applyDynamic("createTab")(title.asInstanceOf[js.Any]).asInstanceOf[DialogTab]
  
  inline def createWebViewDialog(title: String): ModalDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebViewDialog")(title.asInstanceOf[js.Any]).asInstanceOf[ModalDialog]
  
  inline def createWizard(title: String): Wizard = ^.asInstanceOf[js.Dynamic].applyDynamic("createWizard")(title.asInstanceOf[js.Any]).asInstanceOf[Wizard]
  inline def createWizard(title: String, name: String): Wizard = (^.asInstanceOf[js.Dynamic].applyDynamic("createWizard")(title.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Wizard]
  inline def createWizard(title: String, name: String, width: DialogWidth): Wizard = (^.asInstanceOf[js.Dynamic].applyDynamic("createWizard")(title.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Wizard]
  inline def createWizard(title: String, name: Unit, width: DialogWidth): Wizard = (^.asInstanceOf[js.Dynamic].applyDynamic("createWizard")(title.asInstanceOf[js.Any], name.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Wizard]
  
  inline def createWizardPage(title: String): WizardPage = ^.asInstanceOf[js.Dynamic].applyDynamic("createWizardPage")(title.asInstanceOf[js.Any]).asInstanceOf[WizardPage]
  inline def createWizardPage(title: String, pageName: String): WizardPage = (^.asInstanceOf[js.Dynamic].applyDynamic("createWizardPage")(title.asInstanceOf[js.Any], pageName.asInstanceOf[js.Any])).asInstanceOf[WizardPage]
  
  inline def openDialog(dialog: Dialog): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openDialog")(dialog.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    def onClick(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
    def onClick(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
    def onClick(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
    def onClick(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
    
    /**
      * Position of the button on the dialog footer
      */
    var position: js.UndefOr[DialogButtonPosition] = js.native
    
    /**
      * Specifies whether this is a secondary button. Default is false.
      */
    var secondary: js.UndefOr[Boolean] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azdata.azdataStrings.close
    - typings.azdata.azdataStrings.cancel
    - typings.azdata.azdataStrings.ok
  */
  trait CloseReason extends StObject
  object CloseReason {
    
    inline def cancel: typings.azdata.azdataStrings.cancel = "cancel".asInstanceOf[typings.azdata.azdataStrings.cancel]
    
    inline def close: typings.azdata.azdataStrings.close = "close".asInstanceOf[typings.azdata.azdataStrings.close]
    
    inline def ok: typings.azdata.azdataStrings.ok = "ok".asInstanceOf[typings.azdata.azdataStrings.ok]
  }
  
  @js.native
  trait Dialog
    extends StObject
       with ModelViewPanel {
    
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
      * Dialog position type: left, below and undefined.
      * Default is undefined.
      */
    var dialogPosition: js.UndefOr[DialogPosition] = js.native
    
    /**
      * Positional data prior to opening of dialog.
      * Default is undefined.
      */
    var dialogProperties: js.UndefOr[IDialogProperties] = js.native
    
    /**
      * Dialog style type: normal, flyout, callout.
      * Default is 'flyout'.
      */
    var dialogStyle: js.UndefOr[DialogStyle] = js.native
    
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
      * Fired when the dialog is closed for any reason. The value indicates the reason it was closed (such as 'ok' or 'cancel')
      */
    def onClosed(listener: js.Function1[/* e */ CloseReason, Any]): Disposable = js.native
    def onClosed(listener: js.Function1[/* e */ CloseReason, Any], thisArgs: Any): Disposable = js.native
    def onClosed(listener: js.Function1[/* e */ CloseReason, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
    def onClosed(
      listener: js.Function1[/* e */ CloseReason, Any],
      thisArgs: Unit,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    /**
      * Fired when the dialog is closed for any reason. The value indicates the reason it was closed (such as 'ok' or 'cancel')
      */
    @JSName("onClosed")
    var onClosed_Original: Event[CloseReason] = js.native
    
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
      * Specify whether or not to render the Dialog footer.
      * Default is true.
      */
    var renderFooter: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify whether or not to render the Dialog header.
      * Default is true.
      */
    var renderHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * The title of the dialog
      */
    var title: String = js.native
    
    /**
      * Width of the dialog.
      * Default is 'narrow'.
      */
    var width: js.UndefOr[DialogWidth] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azdata.azdataStrings.left
    - typings.azdata.azdataStrings.right
  */
  trait DialogButtonPosition extends StObject
  object DialogButtonPosition {
    
    inline def left: typings.azdata.azdataStrings.left = "left".asInstanceOf[typings.azdata.azdataStrings.left]
    
    inline def right: typings.azdata.azdataStrings.right = "right".asInstanceOf[typings.azdata.azdataStrings.right]
  }
  
  trait DialogMessage extends StObject {
    
    val description: js.UndefOr[String] = js.undefined
    
    val level: js.UndefOr[MessageLevel] = js.undefined
    
    val text: String
  }
  object DialogMessage {
    
    inline def apply(text: String): DialogMessage = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogMessage]
    }
    
    extension [Self <: DialogMessage](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLevel(value: MessageLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azdata.azdataStrings.left
    - typings.azdata.azdataStrings.below
  */
  trait DialogPosition extends StObject
  object DialogPosition {
    
    inline def below: typings.azdata.azdataStrings.below = "below".asInstanceOf[typings.azdata.azdataStrings.below]
    
    inline def left: typings.azdata.azdataStrings.left = "left".asInstanceOf[typings.azdata.azdataStrings.left]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azdata.azdataStrings.normal
    - typings.azdata.azdataStrings.flyout
    - typings.azdata.azdataStrings.callout
  */
  trait DialogStyle extends StObject
  object DialogStyle {
    
    inline def callout: typings.azdata.azdataStrings.callout = "callout".asInstanceOf[typings.azdata.azdataStrings.callout]
    
    inline def flyout: typings.azdata.azdataStrings.flyout = "flyout".asInstanceOf[typings.azdata.azdataStrings.flyout]
    
    inline def normal: typings.azdata.azdataStrings.normal = "normal".asInstanceOf[typings.azdata.azdataStrings.normal]
  }
  
  @js.native
  trait DialogTab
    extends StObject
       with ModelViewPanel {
    
    /**
      * A string giving the ID of the tab's model view content
      */
    var content: String = js.native
    
    /**
      * The title of the tab
      */
    var title: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azdata.azdataStrings.narrow
    - typings.azdata.azdataStrings.medium
    - typings.azdata.azdataStrings.wide
    - scala.Double
    - java.lang.String
  */
  type DialogWidth = _DialogWidth | Double | String
  
  trait IDialogProperties extends StObject {
    
    /**
      * height of the dialog
      */
    var height: Double
    
    /**
      * width of the dialog
      */
    var width: Double
    
    /**
      * x position of the dialog relative to the parent element
      */
    var xPos: Double
    
    /**
      * y position of the dialog relative to the parent element
      */
    var yPos: Double
  }
  object IDialogProperties {
    
    inline def apply(height: Double, width: Double, xPos: Double, yPos: Double): IDialogProperties = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xPos = xPos.asInstanceOf[js.Any], yPos = yPos.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDialogProperties]
    }
    
    extension [Self <: IDialogProperties](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXPos(value: Double): Self = StObject.set(x, "xPos", value.asInstanceOf[js.Any])
      
      inline def setYPos(value: Double): Self = StObject.set(x, "yPos", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModelViewDashboard extends StObject {
    
    /**
      * Close the dashboard
      */
    def close(): Thenable[Unit]
    
    /**
      * Open the dashboard
      */
    def open(): Thenable[Unit]
    
    /**
      * Registers the initial set of tabs for this dashboard
      * @param handler Callback for creating the initial set of tabs to display
      */
    def registerTabs(handler: js.Function1[/* view */ ModelView, Thenable[js.Array[DashboardTab | DashboardTabGroup]]]): Unit
    
    /**
      * Selects the tab with the given ID
      * @param id The ID of the tab to select
      */
    def selectTab(id: String): Unit
    
    /**
      * Updates the tabs that are currently displayed
      * @param tabs The new set of tabs to display
      */
    def updateTabs(tabs: js.Array[DashboardTab | DashboardTabGroup]): Unit
  }
  object ModelViewDashboard {
    
    inline def apply(
      close: () => Thenable[Unit],
      open: () => Thenable[Unit],
      registerTabs: js.Function1[/* view */ ModelView, Thenable[js.Array[DashboardTab | DashboardTabGroup]]] => Unit,
      selectTab: String => Unit,
      updateTabs: js.Array[DashboardTab | DashboardTabGroup] => Unit
    ): ModelViewDashboard = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), registerTabs = js.Any.fromFunction1(registerTabs), selectTab = js.Any.fromFunction1(selectTab), updateTabs = js.Any.fromFunction1(updateTabs))
      __obj.asInstanceOf[ModelViewDashboard]
    }
    
    extension [Self <: ModelViewDashboard](x: Self) {
      
      inline def setClose(value: () => Thenable[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setOpen(value: () => Thenable[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      inline def setRegisterTabs(
        value: js.Function1[/* view */ ModelView, Thenable[js.Array[DashboardTab | DashboardTabGroup]]] => Unit
      ): Self = StObject.set(x, "registerTabs", js.Any.fromFunction1(value))
      
      inline def setSelectTab(value: String => Unit): Self = StObject.set(x, "selectTab", js.Any.fromFunction1(value))
      
      inline def setUpdateTabs(value: js.Array[DashboardTab | DashboardTabGroup] => Unit): Self = StObject.set(x, "updateTabs", js.Any.fromFunction1(value))
    }
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
    def onValidityChanged(listener: js.Function1[/* e */ Boolean, Any]): Disposable = js.native
    def onValidityChanged(listener: js.Function1[/* e */ Boolean, Any], thisArgs: Any): Disposable = js.native
    def onValidityChanged(listener: js.Function1[/* e */ Boolean, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
    def onValidityChanged(listener: js.Function1[/* e */ Boolean, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
    
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
      * The name used to identify the wizard in telemetry
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The next button
      */
    var nextButton: Button = js.native
    
    /**
      * Event fired when the wizard's page changes, containing information about the
      * previous page and the new page
      */
    def onPageChanged(listener: js.Function1[/* e */ WizardPageChangeInfo, Any]): Disposable = js.native
    def onPageChanged(listener: js.Function1[/* e */ WizardPageChangeInfo, Any], thisArgs: Any): Disposable = js.native
    def onPageChanged(
      listener: js.Function1[/* e */ WizardPageChangeInfo, Any],
      thisArgs: Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onPageChanged(
      listener: js.Function1[/* e */ WizardPageChangeInfo, Any],
      thisArgs: Unit,
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
      * @param source Where the wizard was opened from for telemetry (ex: command palette, context menu)
      */
    def open(): Thenable[Unit] = js.native
    def open(source: String): Thenable[Unit] = js.native
    
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
    
    /**
      * Width of the wizard
      */
    var width: js.UndefOr[DialogWidth] = js.native
  }
  
  @js.native
  trait WizardPage
    extends StObject
       with ModelViewPanel {
    
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
      * An optional name for the page. If provided it will be used for telemetry
      */
    var pageName: js.UndefOr[String] = js.native
    
    /**
      * The title of the page
      */
    var title: String = js.native
  }
  
  trait WizardPageChangeInfo extends StObject {
    
    /**
      * The page number that the wizard changed from
      */
    var lastPage: Double
    
    /**
      * The new page number or undefined if the user is closing the wizard
      */
    var newPage: Double
  }
  object WizardPageChangeInfo {
    
    inline def apply(lastPage: Double, newPage: Double): WizardPageChangeInfo = {
      val __obj = js.Dynamic.literal(lastPage = lastPage.asInstanceOf[js.Any], newPage = newPage.asInstanceOf[js.Any])
      __obj.asInstanceOf[WizardPageChangeInfo]
    }
    
    extension [Self <: WizardPageChangeInfo](x: Self) {
      
      inline def setLastPage(value: Double): Self = StObject.set(x, "lastPage", value.asInstanceOf[js.Any])
      
      inline def setNewPage(value: Double): Self = StObject.set(x, "newPage", value.asInstanceOf[js.Any])
    }
  }
  
  trait _DialogWidth extends StObject
}
