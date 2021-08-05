package typings.azdata.mod

import typings.azdata.mod.window.ModelViewPanel
import typings.vscode.Thenable
import typings.vscode.mod.Event
import typings.vscode.mod.ViewColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspace {
  
  @JSImport("azdata", "workspace")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createModelViewEditor(title: String): ModelViewEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewEditor")(title.asInstanceOf[js.Any]).asInstanceOf[ModelViewEditor]
  inline def createModelViewEditor(title: String, options: ModelViewEditorOptions): ModelViewEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelViewEditor")(title.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ModelViewEditor]
  
  @JSImport("azdata", "workspace.onDidChangeToDashboard")
  @js.native
  val onDidChangeToDashboard: Event[DashboardDocument] = js.native
  
  @JSImport("azdata", "workspace.onDidOpenDashboard")
  @js.native
  val onDidOpenDashboard: Event[DashboardDocument] = js.native
  
  @js.native
  trait ModelViewEditor
    extends StObject
       with ModelViewPanel {
    
    /**
      * `true` if there are unpersisted changes.
      * This is editable to support extensions updating the dirty status.
      */
    var isDirty: Boolean = js.native
    
    /**
      * Opens the editor
      */
    def openEditor(): Thenable[Unit] = js.native
    def openEditor(position: ViewColumn): Thenable[Unit] = js.native
    
    /**
      * Registers a save handler for this editor. This will be called if [supportsSave](#ModelViewEditorOptions.supportsSave)
      * is set to true and the editor is marked as dirty
      */
    def registerSaveHandler(handler: js.Function0[Thenable[Boolean]]): Unit = js.native
  }
}
